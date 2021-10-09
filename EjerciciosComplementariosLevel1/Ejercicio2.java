package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese el 1er Numero:");
    
        int numero1 = consola.nextInt();

        System.out.println("Ingrese el 2do Numero:");
        
        int numero2 = consola.nextInt();

        System.out.println(numero1+ " + " + numero2 + "= " +(numero1+numero2));
        System.out.println(numero1+ " - " + numero2 + "= " + (numero1-numero2));
        System.out.println(numero1+ " * " + numero2 + "= "  + (numero1*numero2));
        System.out.println(numero1+ " / " + numero2 + "= " + (numero1/numero2));
        System.out.println(numero1+ " % " + numero2 + "= "  + (numero1%numero2));


    }  
}
