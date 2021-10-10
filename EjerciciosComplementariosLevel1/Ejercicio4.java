package EjerciciosComplementariosLevel1;
import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        
        int num;

        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa el numero y te dire su Factorial: ");
        num = consola.nextInt();       
        System.out.println("El factorial de " + num + " es: " + Factorial(num));
    
    }
    public static int Factorial(int num) {
        if (num == 1) return 1;
        return num * Factorial(num-1);
    }
}
    
    





