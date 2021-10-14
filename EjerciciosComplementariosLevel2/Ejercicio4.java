package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        List<String> estudiantes = new ArrayList<>();

        fillList(estudiantes);
        System.out.println("Lista Actual");
        printList(estudiantes);

        System.out.println("Lista dividida");
        splitList(estudiantes);
    }

    public static void fillList(List<String> lista) {
        
        lista.add("okisan");
        lista.add("moli");
        lista.add("ivan");
        lista.add("gringo");
        lista.add("rodri");
        lista.add("deby");
        lista.add("cari");
        lista.add("timon");
        lista.add("pumba");
        lista.add("walli");
        lista.add("mario");
        lista.add("luigi");
    }

    public static void printList(List<String> lista) {
        for (String contenido : lista) {
            if (lista.indexOf(contenido) == lista.size()-1) {
                System.out.print(contenido);
            }else{
                System.out.print(contenido + " - ");
            }
        }
        System.out.println();
    }

    public static void splitList(List<String> lista) {

        List<String> clase1 = lista.subList(0, 4);
        List<String> clase2 = lista.subList(4, 8);
        List<String> clase3 = lista.subList(8, 12);

        printList(clase1);
        printList(clase2);
        printList(clase3);
    }
}