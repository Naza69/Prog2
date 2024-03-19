public class Technician extends Operator {
    private String workshop;
    public Technician(){
    }
    public Technician(String name, String credentials, String workshop){
        super(name, credentials);
        this.workshop = workshop;
    }

    public String getWorkshop() {
        return workshop;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop;
    }
    public void applicattionRequire(){
        System.out.println("Este empleado ("+getName()+") para poder ejercer de tecnico, tuvo que aplicar como ingeniero en sistemas, " +
                "como programador, o, como licenciado en ciencias de la computacion.");
    }
    @Override
    public void licenceStandard() {
        System.out.println("Este es el modelo de matricula estandar: #XXX0000000T de "+(getName()));
    }

    @Override
    public void ToString() {
        System.out.println("Este es un empleado con cualidad de tecnico de la empresa.");
        System.out.println("Nombre: "+getName());
        System.out.println("Creedenciales: "+getCredentials());
        System.out.println("Area laboral: "+getWorkshop());
    }
}
