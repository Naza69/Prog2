public class Official extends Operator{
    private int unitsInCharge;
    public Official(){
    }
    public Official(String name, String credentials, int unitsInCharge){
        super(name, credentials);
        this.unitsInCharge = unitsInCharge;
    }
    public int getUnitsInCharge() {
        return unitsInCharge;
    }
    public void setUnitsInCharge(int unitsInCharge) {
        this.unitsInCharge = unitsInCharge;
    }
    public void experienceRequired(){
        System.out.println("Para ejercer de oficial, este empleado ("+getName()+") tiene que haber aplicado con minimo 5 años de experiencia laboral");
    }
    @Override
    public void licenceStandard() {
        System.out.println("Este es el modelo de matricula estandar: #XXX0000000OF de "+(getName())+".");
    }

    @Override
    public void ToString() {
        System.out.println("Este es un empleado con cualidad de oficial de la empresa.");
        System.out.println("Nombre: "+getName());
        System.out.println("Creedenciales: "+getCredentials());
        System.out.println("Esta a cargo de "+getUnitsInCharge()+" unidad/es.");
    }
}
