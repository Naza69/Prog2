import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Intanciada cada clase
        Athlete atleta1 = new Athlete(45328190, "Mauro Garzia", 1.68, 21, 60);
        Athlete atleta2 = new Athlete(32456789, "Rodrigo Zapata", 1.75, 19, 70);
        Athlete atleta3 = new Athlete(48765890, "Lucas Sosa", 1.85, 17, 71);

        Athlete atleta4 = new Athlete(00000000, "///////////", 0.00, 00, 00);
        Athlete atleta5 = new Athlete(00000001, "!!!!!!!!!!!", 0.00, 00, 00);
        Athlete atleta6 = new Athlete(00000002, ")))))))))))", 0.00, 00, 00);
        ArrayList<Athlete> atletas2 = new ArrayList<>(3);
        atletas2.add(0, atleta4);
        atletas2.add(1, atleta5);
        atletas2.add(2, atleta6);

        Athlete atleta7 = new Athlete(00000003, "UUUUUUUUUUU", 0.00, 00, 00);
        Athlete atleta8 = new Athlete(00000004, "PPPPPPPPPPP", 0.00, 00, 00);
        Athlete atleta9 = new Athlete(00000005, "QQQQQQQQQQQ", 0.00, 00, 00);
        ArrayList<Athlete> atletas3 = new ArrayList<>(3);
        atletas3.add(0, atleta7);
        atletas3.add(1, atleta8);
        atletas3.add(2, atleta9);

        ArrayList<Athlete> atletas1 = new ArrayList<>(3);
        atletas1.add(0, atleta1);
        atletas1.add(1, atleta2);
        atletas1.add(2, atleta3);
        Test prueba1 = new Test(atletas1, 543210, "Resistencia");
        ArrayList<Test> pruebas1 = new ArrayList<>(3);
        Test prueba2 =  new Test(atletas2, 678900, "Peso");
        Test prueba3 = new Test(atletas3, 213434, "Cordinacion");
        pruebas1.add(0, prueba1);
        pruebas1.add(1, prueba2);
        pruebas1.add(2, prueba3);
        Site instalacion1 = new Site("B", "Mendoza, Maipu", "PolideportivoMario", "Polideportivo", pruebas1);
        Campus sede1 = new Campus(12, "25/05/2024", "10:00/21:00");
        NationalTeam equipoNacional1 = new NationalTeam("Azul marino", "Argentina", atletas1);

        //Metodos para la consigna mostrar
        instalacion1.getNameAthleteByTest(2, 3);
        instalacion1.getCodeTestByPosition(2);

        equipoNacional1.showAllMembersHeight();
        equipoNacional1.showMembersExtraWeight();

    }
}
