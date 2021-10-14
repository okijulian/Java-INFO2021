package EjerciciosComplementariosLevel1;

import java.util.Scanner;
public class Ejercicio9 {

    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        String texto;
        char letra;

        System.out.print("Ingrese un texto para analizar: ");
        texto = consola.nextLine();
        System.out.print("ingrese la letra para buscar: ");
        letra = consola.next().charAt(0);
        
        System.out.println(contadorLetras(texto, letra));

        consola.close();
    }

    public static int contadorLetras(String texto, char letra) {
        
        int letraEncontrada = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) letraEncontrada++;
        }
        return letraEncontrada;
    }
    
}
