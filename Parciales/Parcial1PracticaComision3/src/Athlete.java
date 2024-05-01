import java.lang.Math;
import java.util.ArrayList;

//Clase atleta
public class Athlete extends Person implements Contract {
    //Atributos iniciales
    private double height;
    private int age;
    private double weight;
    //Atributos para agregacion dada la relacion en el uml
    private NationalTeam nationalTeam;
    private Test test;
    private ArrayList<NationalTeam> nationalTeams;

    //Constructor
    public Athlete(int dni, String name, double height, int age, double weight){
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    //Otros constuctores dada la agregacion
    public Athlete(int dni, String name, double height, int age, double weight, NationalTeam nationalTeam){
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
        this.nationalTeam = nationalTeam;
    }

    public Athlete(int dni, String name, double height, int age, double weight, ArrayList<NationalTeam> nationalTeams){
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
        if(nationalTeams.isEmpty()){
            throw new IllegalArgumentException("Por favor, llene la lista con algun equipo, o, use el constructor sin este atributo.");
        } else this.nationalTeams = nationalTeams;
    }

    //Constructor vacio
    public Athlete(){}

    //Getters
    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public NationalTeam getNationalTeam() {
        return nationalTeam;
    }

    public ArrayList<NationalTeam> getNationalTeams() {
        return nationalTeams;
    }

    //Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setNationalTeam(NationalTeam nationalTeam) {
        this.nationalTeam = nationalTeam;
    }

    public void setNationalTeams(ArrayList<NationalTeam> nationalTeams) {
        this.nationalTeams = nationalTeams;
    }

    //Metodo sobrescrito de la interfaz para obtener el IMC
    @Override
    public double calculateBMI(){
        return (getWeight()/Math.pow(getHeight(), 2));
    }

    //Metodo sobrescrito de la interfaz para saber si tiene sobrepeso o no
    @Override
    public boolean thereIsExtraWeight(double BMIresult){
        if (BMIresult >= 25.0){
            return true;
        } else return false;
    }
    private double BMIresult = (getHeight()/(Math.pow(getWeight(), 2)));

    //Metodo sobrescrito de la interfaz para obtener el valor de las pulsaciones
    @Override
    public double takeHeartBeat(){
        if(BMIresult > 25){
            return 105;
        } else return 102;
    }

    //Metodos adicionales
    public void infoAthlete(){
        System.out.println("DNI: "+getDni());
        System.out.println("Nombre: "+getName());
        System.out.println("Altura: "+getHeight()+" m.");
        System.out.println("Peso: "+getWeight()+" kg.");
        if(nationalTeams == null){
            if(nationalTeam == null){
                System.out.println("No pertenece a un equipo nacional.");
            } else System.out.println("Equipo nacional al que pertenece: "+getNationalTeam().getColour());
        } else {
            System.out.println("Equipos nacionales al que pertenece:");
            for(int i = 0; i<nationalTeams.size(); i++){
                System.out.println("Equipo ["+i+"]");
                System.out.println("Color: "+nationalTeams.get(i).getColour());
                System.out.println("Pais: "+nationalTeams.get(i).getCountry());
            }
        }
    }
    public void addNationalTeam(NationalTeam teamToAdd){
        nationalTeams.add(teamToAdd);
    }
}
