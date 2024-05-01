//Clase instalacion

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Site {
    //Atributos iniciales
    private String category;
    private String location;
    private String name;
    private String type;
    //Atributo dada la asociacion
    private ArrayList<Test> testsDone;

    //Constructor
    public Site(String category, String location, String name, String type){
        this.category = category;
        this.location = location;
        this.name = name;
        this.type = type;
    }

    //Constructor dada la asociacion
    public Site(String category, String location, String name, String type, ArrayList<Test> testsDone){
        this.category = category;
        this.location = location;
        this.name = name;
        this.type = type;
        if(testsDone.isEmpty()){
            throw new IllegalArgumentException("Por favor, agregue por lo menos una prueba al array, sino, use el constructor sin este atributo");
        } else this.testsDone = testsDone;
    }

    //Constructor vacio
    public Site(){}

    //Getters
    public String getCategory() {
        return category;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    //Setters
    public void setCategory(String category) {
        this.category = category;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Metodos dada las consignas
    public void getNameAthleteByTest(int testToGetAthleteName, int athletePosition){
        if(testsDone == null){
            System.out.println("No hay pruebas asociadas, asocie pruebas para utilizar este metodo.");
        } else {
            try {
                for(int i = 0; i < testsDone.size();i++){
                    if(1-testToGetAthleteName == i){
                        testsDone.get(i).getAthleteByPosition(1-athletePosition);
                    }
                }
            } catch (IndexOutOfBoundsException e){
                System.out.println("La posicion introducida, usada como indice, esta fuera de los limites del array, por favor, use una posicion valida.");
            }
        }
    }

    public void getCodeTestByPosition(int position){
        if(testsDone == null){
            System.out.println("No hay pruebas asociadas, asocie pruebas para utilizar este metodo.");
        } else {
            for(int i = 0; i < testsDone.size();i++){
                if(1-position == i){
                    System.out.println("Codigo de la prueba "+position+": "+testsDone.get(i));
                }
            }
        }
    }

    //Metodos adicionales
    public void infoSite(){
        System.out.println("Categoria: "+getCategory());
        System.out.println("Localizacion: "+getLocation());
        System.out.println("Nombre: "+getName());
        System.out.println("Tipo: "+getType());
    }
}
