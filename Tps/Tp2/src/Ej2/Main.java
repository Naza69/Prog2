package Ej2;

public class Main {
    public static void main(String [] args){
        Academic uni = new Academic("Nazareno Fioretti", false, "¿Que paso ayer?", 2021,
                "Biografico");

        Novel n1 = new Novel("Fiodor Dostoievsky" , true, "Crimen y castigo", 1886, "Drama psicologico" );

        Infantile i1 = new Infantile("Antoine de Saint-Exupéry.", true, "El Principito", 1943,
                "Ficcion" );

        Library b1 = new Library();

        b1.addBook(uni);
        b1.addBook(n1);
        b1.addBook(i1);


        System.out.println(" ");

        b1.showList();
        System.out.println(" ");
        b1.borrowBook(i1);
        System.out.println(" ");
        b1.giveBackBook(i1);


    }
}
