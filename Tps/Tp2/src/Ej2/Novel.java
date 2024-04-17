package Ej2;

public class Novel extends Book {
    private String gender;

    public Novel(String author, boolean borrowed, String title, int yearOfPublication, String gender) {
        super(author, borrowed, title, yearOfPublication);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
