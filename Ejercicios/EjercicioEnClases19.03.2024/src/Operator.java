public abstract class Operator extends Employee {
    private String credentials;
    public Operator(){
    }
    public Operator(String name, String credentials){
        super(name);
        this.credentials = credentials;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }
    public void licenceStandard(){
        System.out.println("Este es el modelo de matricula estandar: #XXX0000000 de "+(getName())+".");
    }

    @Override
    public void ToString() {
        System.out.println("Este es un empleado con cualidad de operador de la empresa.");
        System.out.println("Nombre: "+getName());
        System.out.println("Credencial: "+getCredentials());
    }

}
