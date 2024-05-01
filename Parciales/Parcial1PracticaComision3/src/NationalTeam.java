import java.util.ArrayList;
//Clase equipo nacional

public class NationalTeam {
    //Atributos iniciales
    private String colour;
    private String country;
    //Atributo dada la agregacion representada en el uml
    private ArrayList<Athlete> members;


    //Constructor
    public NationalTeam(String colour, String country){
        this.colour = colour;
        this.country = country;
    }

    //Constructor dada la agregacion
    public NationalTeam(String colour, String country, ArrayList<Athlete> members){
        this.colour = colour;
        this.country = country;
        if(members.isEmpty()){
            throw new IllegalArgumentException("Por favor, llene el equipo con algun miembro, o, use el constructor sin este atributo.");
        } else this.members = members;
    }

    //Constructor vacio
    public NationalTeam(){}

    //Getters
    public String getColour() {
        return colour;
    }

    public String getCountry() {
        return country;
    }

    public ArrayList<Athlete> getMembers() {
        return members;
    }

    //Setters
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMembers(ArrayList<Athlete> members) {
        this.members = members;
    }
    //Metodos segun las consignas
    public void showAllMembersHeight(){
        if(members == null){
            System.out.println("En este equipo no hay miembros aun. Incorpore miembros para usar este metodo.");
        } else {
            for(int i = 0; i < members.size();i++){
                System.out.println("Altura de miembro ["+i+"]: "+members.get(i).getHeight()+" m.");
            }
        }
    }
    public void showMembersExtraWeight(){
        if(members == null){
            System.out.println("En este equipo no hay miembros aun. Incorpore miembros para usar este metodo.");
        } else {
            for(int i = 0; i < members.size();i++){
                if(members.get(i).calculateBMI() >= 25){
                    System.out.println("Peso extra de atleta ["+i+"]: "+((members.get(i).calculateBMI()-25)*3)+" kg.");
                } else System.out.println("El miembro ["+i+"] no tiene sobrepeso.");
            }
        }
    }

    //Metodos adicionales
    public void infoNationalTeam(){
        System.out.println("Color: "+getColour());
        System.out.println("Pais: "+getCountry());
        if(members == null){
            System.out.println("Aun no tiene miembros.");
        } else {
            System.out.println("Miembros: ");
            for(int i = 0; i < members.size();i++){
                System.out.println("Miembro ["+i+"]");
                members.get(i).infoAthlete();
            }
        }
    }
    public void addMember(Athlete memberToAdd){
        members.add(memberToAdd);
    }

}
