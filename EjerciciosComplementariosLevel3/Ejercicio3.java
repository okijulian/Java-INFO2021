package EjerciciosComplementariosLevel3;

import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String>listaPalabras=List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        int palabraConB=(int)listaPalabras.stream()
            .filter(palabra-> palabra.toLowerCase().charAt(0)=='b')
            .count();
        
        listaPalabras.forEach(p-> System.out.println(p));
        System.out.println("Cantidad de palabras que inician con B/b:  "+ palabraConB );
    };
};
