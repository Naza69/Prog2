public class SavingsAccount extends Account {
    protected boolean active;
    public SavingsAccount(){}
    public SavingsAccount(float salary, int consignment, int outs, float annualRate, float monthlyCommission, boolean active){
        super(salary, consignment, outs, annualRate, monthlyCommission);
        this.active = active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void getActive() {
        if(active){
            System.out.println("Esta cuenta esta activa");
        }else System.out.println("Esta cuenta no esta activa");
    }

    @Override
    public void retire() {
        if(active) {
            if(outs>4){
                super.retire();
                setSalary(getSalary()-1000);
                System.out.println("Se le ha cobrado 1000 adicionales por haber retirado mas de 4 veces.");
            }else super.retire();
        }else System.out.println("Active la cuenta antes de retirar...");
    }

    @Override
    public void consigne() {
        if(active) {
            super.consigne();
        }else System.out.println("Antes de consignar active la cuenta...");
    }

    @Override
    public void monthlyExtract() {
        if(getSalary()>0) {
            super.monthlyExtract();
        }else System.out.println("Esta cuenta no parece estar activa, por tanto, no se puede proceder con la extraccion mensual");
    }

    @Override
    public float getWithMonthlyInterest() {
        return super.getWithMonthlyInterest();
    }

    @Override
    public void print() {
        System.out.println("Saldo: "+(getSalary()));
        System.out.println("Comision mensual: "+getMonthlyCommission());
        System.out.println("Numero de transacciones: "+(getOuts()+getConsignments()));
    }

}
