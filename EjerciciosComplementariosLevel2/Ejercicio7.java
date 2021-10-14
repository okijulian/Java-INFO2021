package EjerciciosComplementariosLevel2;

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int inicio,fin;

        System.out.print("Ingrese el primer Numero ");
        inicio = scan.nextInt();
        System.out.print("Imgrese el ultimo Numero: ");
        fin = scan.nextInt();


        try {
            System.out.println("\nCreando Lista");
            Thread.sleep(2500);
            int[] list = createList(inicio, fin);

            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + " ");
            }

            System.out.println("\nCargando");
            Thread.sleep(2500);
            fizzBuzzFunction(list);
        } catch (InterruptedException e) {
            System.err.println("uff algo salio mal. :(");
        }

        scan.close();
    }

    public static int[] createList(int inicio, int fin) {
        int finDeLaLista = fin - inicio;
        int[] arr = new int[finDeLaLista];

        for (int i = inicio; i < fin; i++) {
            arr[i-inicio] = i;
        }

        return arr;
    }

    public static void fizzBuzzFunction(int[] lista) {
        String[] cantidadDeLetras = new String[lista.length];

        for (int i = 0; i < lista.length; i++) {
            if(lista[i] % 2 == 0 && lista[i] % 3 == 0){
                cantidadDeLetras[i] = "FizzBuzz";
            }else if (lista[i] % 2 == 0) {
                cantidadDeLetras[i] = "Fizz";
            }else if (lista[i] % 3 == 0){
                cantidadDeLetras[i] = "Buzz";
            }else{
                cantidadDeLetras[i] = ""+lista[i];
            }
        }

        for (int i = 0; i < cantidadDeLetras.length; i++) {
            System.out.print(cantidadDeLetras[i] + " ");
        }
    }

}