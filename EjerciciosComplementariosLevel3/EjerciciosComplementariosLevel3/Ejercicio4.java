package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);
        List<Integer> factorialNumeros = numeros.stream()
            .map(n -> factorial(n))
            .distinct()
            .collect(Collectors.toList());
                  
        numeros.forEach(num-> System.out.println(num)); 
        System.out.println("Factorial de la lista de numeros: ");       
        factorialNumeros.forEach(num-> System.out.println(num));
    }
    public static int factorial(int num) {
        if(num == 1) return 1;
        return num * factorial(num-1);
    }
}