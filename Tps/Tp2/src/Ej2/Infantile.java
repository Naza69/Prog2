package Ej2;


public class Infantile extends Book {
    private String type;

    public Infantile(String author, boolean borrowed, String title, int yearOfPublication, String type) {
        super(author, borrowed, title, yearOfPublication);
        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
