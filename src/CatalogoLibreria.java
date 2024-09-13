import java.util.Scanner;

public class CatalogoLibreria {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Libreria libreria = new Libreria();

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- MENU DE GESTION DE LA LIBRERIA ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Mostrar catalogo");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> AgregarLibro();
                case 2 -> EliminarLibro();
                case 3 -> libreria.MostrarCatalogo();
                case 4 -> {
                    continuar = false;
                    System.out.println("Saliendo del sistema...");
                }
                default -> System.out.println("Opcion invalida, intenta nuevamente. ");
            }
        }
    }

    private static void AgregarLibro() {
        System.out.println("Ingresa el titulo del libro: ");
        String titulo = scanner.nextLine();
        System.out.println("Ingresa el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.println("Ingrese el numero del ISBN del libro: ");
        int ISBN = scanner.nextInt();
        Libro libro = new Libro( titulo,autor, ISBN);
        libreria.AgregarLibro(libro);
    }

    private static void EliminarLibro() {
        System.out.println("Ingrese el numero de ISBN del libro a eliminar: ");
        int ISBN = scanner.nextInt();
        libreria.EliminarLibro(ISBN);
    }
}
