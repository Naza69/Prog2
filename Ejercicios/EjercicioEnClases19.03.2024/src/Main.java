//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Executive theFirst = new Executive();
        Official theSecond = new Official();
        Technician theThird = new Technician();

        //Directivo
        theFirst.setName("Uriel Castellino");
        theFirst.setShares(400);

        //Oficial
        theSecond.setName("Luciano Aguilera");
        theSecond.setCredentials("AccesoNivelB");
        theSecond.setUnitsInCharge(4);

        //Tecnico
        theThird.setName("Nazareno Fioretti");
        theThird.setCredentials("AccesoNivelE");
        theThird.setWorkshop("Sistemas");

        //Metodo heredado
        theFirst.ToString();
        theSecond.ToString();
        theThird.ToString();

        //Metodos nativos
        theFirst.howManyShareOperations();
        theSecond.licenceStandard();
        theSecond.experienceRequired();
        theThird.applicattionRequire();
        }
    }