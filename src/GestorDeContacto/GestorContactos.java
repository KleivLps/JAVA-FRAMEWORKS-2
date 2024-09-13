package GestorDeContacto;

import java.util.ArrayList;
import java.util.HashSet;

public class GestorContactos {

    private final ArrayList<Contacto> contactoArrayList;
    private final HashSet<Contacto> contactoHashSet;

    public GestorContactos() {
        contactoArrayList = new ArrayList<>();
        contactoHashSet = new HashSet<>();
    }

    public void agregarContactosArrayList(Contacto contacto) {
        if (!contactoArrayList.contains(contacto)) {
            contactoArrayList.add(contacto);
            System.out.println("Contacto agregado al ArrayList. ");
        } else {
            System.out.println("El contacto ya existe en el ArrayList. ");
        }
    }

    public void eliminarContactosArrayList(Contacto contacto) {
        if (contactoArrayList.remove(contacto)) {
            System.out.println("Contacto eliminado del ArrayList. ");
        } else {
            System.out.println("El contacto no se encontro en el ArrayList. ");
        }
    }

    public void agregarContactosHashSet(Contacto contacto) {
        if (contactoHashSet.add(contacto)) {
            System.out.println("Contacto agregado al HashSet. ");
        } else {
            System.out.println("El contacto ya existe en el HashSet.");
        }
    }

    public void eliminarContactosHashSet(Contacto contacto) {
        if (contactoHashSet.remove(contacto)) {
            System.out.println("Contacto elimnado del HashSet. ");
        } else {
            System.out.println("El contacto no se encontró en el HashSet. ");
        }
    }

    public void mostrarContactosArrayList() {
        System.out.println("Contactos en ArrayList: ");
        for (Contacto contacto : contactoArrayList) {
            System.out.println(contacto);
        }
    }

    public void mostrarContactosHashSet() {
        System.out.println("Contactos en HashSet: ");
        for (Contacto contacto : contactoHashSet) {
            System.out.println(contacto);
        }
    }
}
