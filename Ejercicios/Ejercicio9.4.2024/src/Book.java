public class Book {
    private Person[] owners;
    private String title;
    public Book(Person[] owners, String title){
        this.owners = owners;
        this.title = title;
    }

    public Book(String title){
        this.title = title;
    }

    public Book(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person[] getOwners() {
        return owners;
    }

    public void setOwners(Person[] owners) {
        this.owners = owners;
    }

}
