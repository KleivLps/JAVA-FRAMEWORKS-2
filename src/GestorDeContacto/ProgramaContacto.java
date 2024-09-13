package GestorDeContacto;

import java.util.Scanner;

public class ProgramaContacto {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GestorContactos gestor = new GestorContactos();
        boolean salir = false;

        while (!salir) {
            System.out.println(" --- SELECCIONE UNA OPCION ---");
            System.out.println("1. Agregar contactos al ArrayList");
            System.out.println("2. Eliminar contacto del ArrayList");
            System.out.println("3. Agregar contacto al HashSet");
            System.out.println("4. Eliminar contacto del HashSet");
            System.out.println("5. Mostrar contactos del ArrayList");
            System.out.println("6. Mostrar contactos de Hashset");
            System.out.println("7. Salir.");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    gestor.agregarContactosArrayList(crearContacto(scanner));
                    gestor.mostrarContactosArrayList();
                }
                case 2 -> {
                    gestor.eliminarContactosArrayList(crearContactoParaEliminar(scanner));
                    gestor.mostrarContactosArrayList();
                }
                case 3 -> {
                    gestor.agregarContactosHashSet(crearContacto(scanner));
                    gestor.mostrarContactosHashSet();
                }
                case 4 -> {
                    gestor.eliminarContactosHashSet(crearContactoParaEliminar(scanner));
                    gestor.mostrarContactosHashSet();
                }
                case 5 -> gestor.mostrarContactosArrayList();
                case 6 -> gestor.mostrarContactosHashSet();
                case 7 -> salir = true;
                default -> System.out.println("Opcion invalida. Intente nuevamente.");
                }
            }
        scanner.close();
        }
        private static Contacto crearContacto(Scanner scanner) {
            System.out.println("Ingrese el nombre del contacto: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el numero del telefono del contacto: ");
            String telefono = scanner.nextLine();
            System.out.println("Ingrese el correo electronico del contacto: ");
            String email = scanner.nextLine();

            return new Contacto(nombre, telefono, email);
    }

    private static Contacto crearContactoParaEliminar(Scanner scanner) {
        System.out.println("Ingrese el nombre del contacto a eliminar: ");
        String nombre = scanner.nextLine();

        return new Contacto(nombre, " ", "");
    }
}
