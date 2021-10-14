package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.stream.events.EndElement;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        final int maximoCartas = 20;
        List<Integer> cartasEspanol = new ArrayList<>();

        for (int i = 1; i <= maximoCartas; i++) {
            cartasEspanol.add(i);
        }

        printList(cartasEspanol);
        System.out.println("Lista invertida");
        printReversed(cartasEspanol);
        System.out.println("Lista Desordenada");
        printdisordered(cartasEspanol);
    }

    public static void printList(List<Integer> lista) {
        for (Integer carta : lista) {
            System.out.print(carta + " ");
        }
        System.out.println();
    }

    public static void printReversed(List<Integer> lista){
        List<Integer> listaAuxiliar = lista;
        Collections.reverse(listaAuxiliar);
        printList(listaAuxiliar);
    }

    public static void printdisordered(List<Integer> lista) {
        List<Integer> listaAuxiliar = lista;
        Collections.shuffle(listaAuxiliar);
        printList(listaAuxiliar);
    }
}