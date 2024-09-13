import java.util.Locale;
import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private int ISBN;

    public Libro() {

    }
    public Libro(String titulo, String autor, int ISBN) {
        this.titulo = formatoEstandar(titulo);
        this.autor = formatoEstandar(autor);
        this.ISBN = ISBN;
    }

    private String formatoEstandar(String texto) {
        return texto.trim().toUpperCase();
    }

    public void setTitulo ( String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setISBN (int ISBN) {
        this.ISBN = ISBN;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getISBN() {
        return ISBN;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro otroLibro = (Libro) o;
        return ISBN == otroLibro.ISBN;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + " | Autor: " + autor + " | ISBN: " +ISBN;
    }
}
