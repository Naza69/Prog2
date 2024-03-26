import java.util.Scanner;

public abstract class Account {
    protected float salary;
    protected int consignments;
    protected int outs;
    protected float annualRate;
    protected float monthlyCommission;
    public Account(float salary, int consignments, int outs, float annualRate, float monthlyCommission){
        this.salary = salary;
        this.consignments = consignments;
        this.outs = outs;
        this.annualRate = annualRate;
        this.monthlyCommission = monthlyCommission;
    }
    public Account(){}

    public float getSalary() {
        return salary;
    }

    public int getOuts() {
        return outs;
    }

    public float getAnnualRate() {
        return annualRate;
    }

    public int getConsignments() {
        return consignments;
    }

    public float getMonthlyCommission() {
        return monthlyCommission;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setOuts(int outs) {
        this.outs = outs;
    }

    public void setAnnualRate(float annualRate) {
        this.annualRate = annualRate;
    }

    public void setConsignment(int consignment) {
        this.consignments = consignments;
    }

    public void setMonthlyCommission(float monthlyCommission) {
        this.monthlyCommission = monthlyCommission;
    }
    public void consigne(){
        Scanner sc = new Scanner(System.in);
        int ammount = 1;
        while(ammount >= 1){
            try{
                System.out.println("Ingrese el monto a consignar");
                ammount = sc.nextInt();
                if(ammount <1 ){
                    System.out.println("No puede ingresar un valor nulo o negativo");
                    continue;
                }
            }catch (Exception e){
                System.out.println("Ingrese un valor numerico");
                continue;
            }
            break;
        }
        System.out.println("Valor consignado: "+ammount);
        setConsignment((ammount));
        setSalary(getSalary()+ammount);
        consignments++;
    }
    public void retire(){
        Scanner sc = new Scanner(System.in);
        int ammount = 1;
        while(ammount >= 1){
            try{
                System.out.println("Ingrese el monto a retirar");
                ammount = sc.nextInt();
                if(ammount <1 ){
                    System.out.println("No puede ingresar un valor nulo o negativo");
                    continue;
                } else if (ammount>salary) {
                    System.out.println("No puede retirar una cantidad mayor a la que tiene...");
                    continue;
                }
            }catch (Exception e){
                System.out.println("Ingrese un valor numerico");
                continue;
            }
            break;
        }
        System.out.println("Retirado: "+(ammount));
        setSalary(getSalary()-ammount);
        outs++;
    }
    public float getWithMonthlyInterest(){
        float montlhyInterest = (getAnnualRate()/12);
        System.out.println("Saldo con interes mensual: "+(getSalary()*(getAnnualRate()/12)));
        setSalary((getSalary()*(getAnnualRate()/12)));
        return montlhyInterest;
    }
    public void monthlyExtract(){
        System.out.println("Extracto mensual: "+((getSalary()-getMonthlyCommission())*getWithMonthlyInterest()));
        setSalary((getSalary()-getMonthlyCommission())*getWithMonthlyInterest());
    }
    public void print(){
        System.out.println("Saldo: "+(getSalary()));
        System.out.println("Numero consignaciones: "+(getConsignments()));
        System.out.println("Numero de retiros: "+getOuts());
        System.out.println("Tasa anual: "+getAnnualRate());
        System.out.println("Comision mensual: "+getMonthlyCommission());
    }

}

