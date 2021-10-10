package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int num1, num2;

        System.out.println("Multiplicar sumas sucesivas");
        System.out.print("Ingresa el 1er número: ");
        num1 = consola.nextInt();
        System.out.print("Ingresa el 2do número: ");
        num2 = consola.nextInt();
        
        System.out.println(num1 + " x " + num2 + " = " + sumasSucesivas(num1, num2));
    }

    public static int sumasSucesivas(int num1, int num2) {
        
        int resultado = 0;

        for (int i = 1; i <= num2; i++) {
            resultado += num1;
        }

        return resultado;
    }
    
}
