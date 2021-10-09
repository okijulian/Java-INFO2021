package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        System.out.println("Ingrese su Nombre: ");

        Scanner consola = new Scanner(System.in);

        String nombre = consola.nextLine();

        System.out.println("HOLA " + nombre);

    }

}