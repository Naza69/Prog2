package Ej2;
import java.util.ArrayList;
public class Library {
    private ArrayList<Book>libros;

    public Library(ArrayList<Book> libros) {
        this.libros = libros;
    }

    public Library() {}

    public ArrayList<Book> getLibros() {
        return libros;
    }

    public void setBooks(ArrayList<Book> libros) {
        this.libros = libros;
    }

    public ArrayList<Book> addBook(Book book){
        boolean checker = false ;
        if (libros == null){ //No hay libros en la biblioteca
            libros = new ArrayList<Book>();
        }
        for (Book libro : libros){
            if (book == libro){
                checker = true;
            }
        }

        if (checker){
            System.out.println("El libro " + book.title + " ya se encuentra adherido a la lista");
        }else {
            System.out.println("Adhiriendo libro " + book.title + " a la lista");
            libros.add(book);

        }

        return libros;
    }

    public void showList(){
        System.out.println("---LISTA DE LIBROS---");
        for (Book libro : libros){
            System.out.println("- " + libro.title);
        }
    }

    public ArrayList<Book> borrowBook(Book book) {
        boolean checker = false;
        System.out.println("-- TRAMITE: DEVOLVER --");
        for (Book libro : libros) {
            if (book == libro && libro.borrowed) {
                book.borrow();
                System.out.println("El libro en cuestion debera ser devuelto en el lapzo de 2 a 3 meses");
                libros.remove(libro);

                return libros;

            } else if (book == libro && !libro.borrowed) {
                System.out.println("Lo sentimos!, el libro deseado no puede ser prestado");

                return libros;
            } else {
                checker = true;
            }
        }

        if (checker) {
            System.out.println("El libro solicitado no se encuentra en la biblioteca!");
        }
        return libros;
    }


    public ArrayList<Book> giveBackBook(Book book) {
        System.out.println("-- TRAMITE: PRESTAR --");
        addBook(book);
        book.giveBack();
        return libros;
    }

}