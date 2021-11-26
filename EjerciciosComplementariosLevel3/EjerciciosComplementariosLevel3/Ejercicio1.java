package EjerciciosComplementariosLevel3;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
        public static void main(String[] args) {
        List<String>listaPalabras= new ArrayList<>();
        listaPalabras.add("hola"); 
        listaPalabras.add(null);
        listaPalabras.add("Informatorio");
        listaPalabras.add("");               
        listaPalabras.forEach(x-> System.out.println(x));
        listaPalabras.stream()
                    .filter(palabra-> !(palabra==null) && (!("").equals(palabra)))
                    .collect(Collectors.toList())                                     
                    .forEach(x-> System.out.println(x));                    
    };
};
