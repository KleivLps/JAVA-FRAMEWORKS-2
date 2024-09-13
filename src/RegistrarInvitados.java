import java.util.HashSet;
import java.util.Scanner;

public class RegistrarInvitados {
    public static Scanner scanner = new Scanner(System.in);

    static HashSet<String> nombresInvitados;

    public RegistrarInvitados() {
        nombresInvitados = new HashSet<>();
    }
    public void agregarInvitado (String nombre) {
        nombresInvitados.add(nombre);
        if (nombresInvitados.contains(nombre)) {
            System.out.println("El invitado ya ha sido agregado");
        } else {
            nombresInvitados.add(nombre);
            System.out.println("El invitado fue agregado.");
        }
    }
    public void eliminarInvitado(String nombre) {
        if (nombresInvitados.contains(nombre)) {
            nombresInvitados.remove(nombre);
            System.out.println("El invitado fue eliminado. ");
        } else {
            System.out.println("El invitado no esta en la lista.");
        }
    }
    public void mostrarInvitados () {
        System.out.println("Lista de invitados: ");
        int i = 0;
        if (nombresInvitados.isEmpty()) {
            System.out.println("--- LA LISTA DE INVITADOS ESTA VACIA ---");
            System.out.println();
        } else {
            for (Object invitado : nombresInvitados) {
                System.out.println((i+1) + ". "+ invitado);
                i++;
            }
            System.out.println();
        }
    }
}

