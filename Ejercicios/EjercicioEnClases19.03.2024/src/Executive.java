public class Executive extends Employee {
    private int shares;
    public Executive() {
    }
    public Executive(String name, int shares){
        super(name);
        this.shares = shares;
    }
    public int getShares() {
        return shares;
    }
    public void setShares(int shares) {
        this.shares = shares;
    }
    public void howManyShareOperations(){
        System.out.println("Para obtener el grado de directivo, este empleado ("+getName()+") tuvo que haber "+
                "realizado minimo 100 operaciones bursatiles.");
    }
    @Override
    public void ToString() {
        System.out.println("Este es un empleado con cualidad de directivo de la empresa.");
        System.out.println("Nombre: "+getName());
        System.out.println("Acciones: "+getShares());
    }
}
