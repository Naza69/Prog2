package Ej2;

public class Book implements Borrowable {
    protected String author;
    protected boolean borrowed;
    protected String title;
    protected int yearOfPublication;



    public Book(String author, boolean borrowed, String title, int yearOfPublication) {
        this.author = author;
        this.borrowed = borrowed;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }


    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public void giveBack() {

        System.out.println("El libro " + this.title +" de " + this.author + " esta siendo devuelto por el cliente");
    }


    @Override
    public void borrow() {

        System.out.println("El libro " + this.title +" de " + this.author + " esta siendo prestado al cliente");
    }
}
