package EjerciciosComplementariosLevel1;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        String palabra;

        System.out.print("Ingrese una Palabra: ");
        palabra = consola.next();

        System.out.println(enMayusculas(palabra));
        
    }

    public static String enMayusculas(String palabra) {
        final int diferenciaConElMayus = 32;
        String palabraMayus = "";
        char letras;

        for (int i = 0; i < palabra.length(); i++) {
            letras = (char) (palabra.charAt(i) - diferenciaConElMayus);
            palabraMayus += letras;
        }

        return palabraMayus;
    }
    

}
