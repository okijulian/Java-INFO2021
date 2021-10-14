package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int base, exponente;

        System.out.println("Calcular potencia de un Numero");
        System.out.print("Ingresa tu numero: ");
        base = consola.nextInt();
        System.out.print("el " + base + " a que potencia quieres calcular?:  ");
        exponente = consola.nextInt();
        System.out.println(base + " elevado a " + exponente + " = " + calcularPotencia(base, exponente));

        
    }

    public static int calcularPotencia(int base, int exponente) {
        int resultado = 1;

        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }
    



}
