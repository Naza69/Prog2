import java.util.Scanner;

public class CheckingAccount extends Account{
    protected float overdraft;
    public CheckingAccount(){}
    public CheckingAccount(float salary, int outs, int consignments, float annualRate, float monthlyCommission, float overdraft){
        super(salary, consignments, outs, annualRate, monthlyCommission);
        this.overdraft = overdraft;
    }

    public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void retire() {
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
                    System.out.println("Se ha evualuado un sobregiro de: "+(-1*(salary-ammount)));
                    setOverdraft((-1*(salary-ammount)));
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

    @Override
    public void consigne() {
        if(overdraft>0){
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
            System.out.println("Su sobregiro se ha visto reducido: "+(getOverdraft()-ammount));
            System.out.println("Valor real consignado: "+(ammount-getOverdraft()));
            setOverdraft(getOverdraft()-ammount);
            setConsignment((ammount));
            setSalary(getSalary()+ammount);
            consignments++;
        }else super.consigne();
    }

    @Override
    public void monthlyExtract() {
        super.monthlyExtract();
    }

    @Override
    public void print() {
        System.out.println("Saldo: "+getSalary());
        System.out.println("Comision mensual: "+getMonthlyCommission());
        System.out.println("Numero de transacciones: "+(getOuts()+getConsignments()));
        System.out.println("Sobregiro: "+getOverdraft());
    }
}
