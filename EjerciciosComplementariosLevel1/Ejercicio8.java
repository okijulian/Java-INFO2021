package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String nombreCompleto, direccion, ciudad;
        int edad;
        
        System.out.print("Nombre: ");
        nombreCompleto = consola.nextLine();

        System.out.print("Edad: ");
        edad = consola.nextInt();

        System.out.print("Ciudad: ");
        ciudad = consola.nextLine();
        
        System.out.print("Direccion: ");
        direccion = consola.nextLine();

        
        System.out.println(imprimirConFormato(nombreCompleto, direccion, ciudad, edad));
        
    }

    public static String imprimirConFormato(String nombreCompleto, String direccion, String ciudad, int edad) {
        
        return String.format("%s - %s - %d - %s", ciudad, direccion, edad, nombreCompleto);
    }



    
}
