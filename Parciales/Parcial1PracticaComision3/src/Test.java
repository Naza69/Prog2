//Clase prueba

import java.util.ArrayList;

public class Test {
    //Atributos iniciales
    private int code;
    private String title;

    //Atributos dada la asociacion
    private ArrayList<Athlete> participants;
    private Site siteUsed;
    private ArrayList<Site> sitesUsed;

    //Constructor
    public Test(ArrayList<Athlete> participants, int code, String title){
        if(participants.isEmpty()){
            throw new IllegalArgumentException("Para que una prueba se haya llevado a cabo, necesita participantes.");
        } else this.participants = participants;
        this.code = code;
        this.title = title;
    }

    //Constructores dados por la asociacion
    public Test(ArrayList<Athlete> participants, int code, String title,  Site siteUsed){
        if(participants.isEmpty()){
            throw new IllegalArgumentException("Para que una prueba se haya llevado a cabo, necesita participantes.");
        } else this.participants = participants;
        this.code = code;
        this.title = title;
        this.siteUsed = siteUsed;
    }

    public Test(ArrayList<Athlete> participants, int code, String title, ArrayList<Site> sitesUsed){
        if(participants.isEmpty()){
            throw new IllegalArgumentException("Para que una prueba se haya llevado a cabo, necesita participantes.");
        } else this.participants = participants;
        this.code = code;
        this.title = title;
        if(sitesUsed.isEmpty()){
            throw new IllegalArgumentException("Por favor, agrege alguna instalacion al array, o sino, use el constructor sin este atributo");
        } else this.sitesUsed = sitesUsed;
    }

    //Constructor vacio
    public Test(){}

    //Getters
    public String getTitle() {
        return title;
    }

    public int getCode() {
        return code;
    }

    public ArrayList<Athlete> getParticipants() {
        return participants;
    }

    public ArrayList<Site> getSitesUsed() {
        return sitesUsed;
    }

    public Site getSiteUsed() {
        return siteUsed;
    }

    //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setParticipants(ArrayList<Athlete> participants) {
        this.participants = participants;
    }

    public void setSitesUsed(ArrayList<Site> sitesUsed) {
        this.sitesUsed = sitesUsed;
    }

    public void setSiteUsed(Site siteUsed) {
        this.siteUsed = siteUsed;
    }

    //Metodos necesarios para cumplir las consignas
    public void getAthleteByPosition(int position){
        for(int i = 0; i < participants.size();i++){
            try{
                if(1-position == i){
                    System.out.println("Nombre del atleta: "+participants.get(i).getName());
                }
            } catch (IndexOutOfBoundsException e){
                System.out.println("La posicion introducida, usada como indice, esta fuera de los limites del array, por favor, use una posicion valida.");
            }
        }
    }

    //Metodos adicionales
    public void infoTest(){
        if(sitesUsed == null){
            System.out.println("Titulo: "+getTitle());
            System.out.println("Codigo: "+getCode());
            if (siteUsed == null) {
                System.out.println("No se llevaron a cabo en ninguna instalacion registrada.");
                System.out.println("Participantes: ");
                for(int i = 0; i<participants.size(); i++){
                    participants.get(i).infoAthlete();
                }
            } else {
                System.out.println("Instalacion usada: "+siteUsed.getName());
                System.out.println("Participantes: ");
                for(int i = 0; i<participants.size(); i++){
                    participants.get(i).infoAthlete();
                }
            }
        } else {
            System.out.println("Instalaciones usadas: ");
            for(int i = 0; i < sitesUsed.size();i++){
                System.out.println("Instalacion ["+i+"]: "+sitesUsed.get(i).getName());
            }
            System.out.println("Participantes: ");
            for(int i = 0; i<participants.size(); i++){
                System.out.println("Atleta ["+i+"]:");
                participants.get(i).infoAthlete();
            }
        }
    }

}
