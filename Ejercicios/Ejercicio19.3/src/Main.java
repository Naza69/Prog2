//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creacion de objeto cuenta de ahorros, con atributos
        SavingsAccount myAccount = new SavingsAccount(300000, 0, 0, 20, 2, true);
        //Metodos
        myAccount.retire();
        myAccount.consigne();
        myAccount.monthlyExtract();
        myAccount.print();
        }
    }