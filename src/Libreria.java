import java.util.HashSet;
import java.util.Iterator;

public class Libreria {
    HashSet<Libro> libreria;

    public Libreria () {
        libreria = new HashSet<>();
    }

    public boolean AgregarLibro(Libro libro) {
        if (libreria.contains(libro)) {
            System.out.println("El libro ya esta en el catalogo.");
            return false;
        }
        libreria.add(libro);
        System.out.println("Libro agregado al catalogo: " +libro.getTitulo());
        return true;
    }

    public boolean EliminarLibro(int ISBN) {
        Iterator<Libro> iterator = libreria.iterator();
        while (iterator.hasNext()) {
            Libro libro = iterator.next();
            if (libro.getISBN( ) == ISBN) {
                iterator.remove();
                System.out.println("Libro eliminado: " +libro.getTitulo());
                return true;
            }
        }
        System.out.println("No se encontro un libro con el ISBN: " +ISBN);
        return false;
    }

    public void MostrarCatalogo() {
        if (libreria.isEmpty()) {
            System.out.println("El catalogo esta vacio.");
        } else {
            System.out.println("\n--- CATALOGO DE LIBROS ---");
            for (Libro libro : libreria) {
                System.out.println(libro);
            }
        }
    }
}
