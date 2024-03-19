import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Motorcycle(2, "gray", 660, 195);
        vehicles[1] = new Bike(2, "orange", "allterrain");
        vehicles[2] = new Car(4, "white", 2, 275);
        vehicles[3] = new VanOrTruck(4, "black", 120);
        Main mainInstance = new Main();
        functions fun = mainInstance.new functions();
        fun.catalog(vehicles);
    }
    public class functions{

        public void catalog(Vehicle[] to_catalog){
            for(int i = 0;i<to_catalog.length;i++){
                if(to_catalog[i] instanceof Motorcycle){
                    System.out.println("Es de clase motocicleta"+"\n"
                            +"Ruedas: "+to_catalog[i].getWheels()+"\n"
                            +"Color: "+to_catalog[i].getColour()+"\n"+
                            "Cilindrada: "+ ((Motorcycle) to_catalog[i]).getDisplacement()+"\n"+
                            "Velocidad Maxima: "+((Motorcycle) to_catalog[i]).getKilometersPerHour());
                }

            }
        }
    }
}