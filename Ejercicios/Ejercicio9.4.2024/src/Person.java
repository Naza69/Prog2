public class Person {
    private Book[] books;
    private String name;
    public Person(Book[] books, String name){
        this.books = books;
        this.name = name;
    }
    public Person(String name){
        this.name = name;
    }
    public Person(){}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Book[] getBooks() {
        return books;
    }
    public void setBooks(Book[] books) {
        this.books = books;
    }
}
