package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        List<String> ciudades = new ArrayList<>();

        System.out.println("Ingresa tu top 3 de ciudades de argentina");
        for (int i = 0; i<3;i++){
            System.out.print("ciudad numero  " + (i+1) + ": ");
            ciudades.add(consola.nextLine());
        }

        printRanking(ciudades);
        consola.close();
    }
    
    public static void printRanking(List<String> ciudades) {
        
        for (String ciudad : ciudades) {
            System.out.println("#" +(ciudades.indexOf(ciudad)+1) + " - "  + ciudad);
        }
    }
}