//Clase Sede

public class Campus {
    //Atributos iniciales
    private int phase;
    private String date;
    private String hour;

    //Constructor
    public Campus(int phase, String date, String hour){
        this.phase = phase;
        this.date = date;
        this.hour = hour;
    }

    //Constructor vacio
    public Campus(){}

    //Getters
    public int getPhase() {
        return phase;
    }

    public String getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }

    //Setters
    public void setPhase(int phase) {
        this.phase = phase;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    //Metodos adicionales
    public void infoCampus(){
        System.out.println("Fase: "+getPhase());
        System.out.println("Fecha: "+getDate());
        System.out.println("Hora: "+getHour());
    }
}
