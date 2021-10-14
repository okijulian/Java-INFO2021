package EjerciciosComplementariosLevel2;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<Integer>();

        numeros.add(44);
        numeros.add(7);
        numeros.add(26);
        numeros.add(65);
        numeros.add(187);

        System.out.println("lista actual de numeros");
        printList(numeros);

        System.out.println("Nueva lista con 1 numero insertado al principio");
        insertAtfirst(numeros, 26);
        printList(numeros);

        
        System.out.println("Nueva lista con 1 numero insertado al fin");
        insertAtfin(numeros, 1991);
        printList(numeros);

    }

    public static void insertAtfirst(List<Integer> lista, int numero) {
        lista.add(0, numero);
    }
    public static void insertAtfin(List<Integer> lista, int numero) {
        lista.add(lista.size(), numero);
    }

    public static void printList(List<Integer> lista){
        for (Integer numero : lista) {
            System.out.print(numero + " ");
        }
    }
}