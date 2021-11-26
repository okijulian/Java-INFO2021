package EjerciciosComplementariosLevel3;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
   public static void main(String[] args) {
       List<Integer>listaNumeros = List.of(1,2,3,4,5);
       List<Integer>listaFinalNumeros=listaNumeros.stream()
            .map(numero->(int)Math.pow(numero, 2))
            .collect(Collectors.toList());
    
        listaNumeros.forEach(n->System.out.println(n + " "));
        listaFinalNumeros.forEach(n-> System.out.println(n + " "));        
    };    
};


