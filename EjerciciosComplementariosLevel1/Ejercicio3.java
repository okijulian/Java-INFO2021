package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int num;
        String numeroString = "";

        System.out.print("Ingresa un Numero: ");
        num = consola.nextInt();      
        
        for (int i = 1; i <= num; i++){
            numeroString += i;
            System.out.println(numeroString);
        }
        
    }
}