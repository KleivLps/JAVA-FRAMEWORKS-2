import java.util.Scanner;

class ListaInvitados {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        RegistrarInvitados Invitados = new RegistrarInvitados();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- MENU DE REGISTRO DE INVITADOS ---");
            System.out.println("1. Agregar invitados");
            System.out.println("2. Eliminar invitados");
            System.out.println("3. Mostrar lista de invitados ");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opcion");
            System.out.println();

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Ingresa el nombre del invitado: ");
                        String nombre = scanner.nextLine();

                        Invitados.agregarInvitado(nombre);
                    }

                    case 2 -> {
                        System.out.println("Ingrese el nombre del invitado: ");
                        String nombre = scanner.nextLine();

                        Invitados.eliminarInvitado(nombre);
                    }

                    case 3 -> Invitados.mostrarInvitados();
                    case 4 ->{
                        continuar = false;
                        System.out.println("Saliendo del sistema...");
                    }
                    default -> System.out.println("Opcion invalida. Intente nuevamente.");
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada invalida. Intente nuevamente.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

}