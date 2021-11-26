package EjerciciosComplementariosLevel3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Estudiantes> alumnos = new ArrayList<>();
        completarLista(alumnos);
        Map<String, Integer> resultMap = alumnos.stream()
                            .collect(Collectors.toMap(s -> s.getApellido()+" "+s.getNombre(), 
                            s -> LocalDate.now().compareTo(s.getNacimiento())));        
        System.out.println("Lista de Alumnos: ");
        alumnos.forEach(s -> System.out.println(s));
        System.out.println("Edad de los Alumnos: ");
        resultMap.forEach((k,v)-> System.out.println((k +" = " + v )));
        };

    public static void completarLista(List<Estudiantes> list) {
        list.add(new Estudiantes("Sosa", "Oscar", LocalDate.of(1991, 7, 26)));
        list.add(new Estudiantes("Ortiz", "Ricardo", LocalDate.of(1993, 1, 5)));
        list.add(new Estudiantes("Riquelme", "Carina", LocalDate.of(1998, 12, 31)));
        list.add(new Estudiantes("Molinas", "Moli", LocalDate.of(1965, 6, 15)));
        list.add(new Estudiantes("Mancuello", "Rodrigo", LocalDate.of(1876, 1, 19)));   
    }
}
class Estudiantes{
    private String apellido;
    private String nombre;
    private LocalDate nacimiento;    
    public Estudiantes(String apellido, String nombre, LocalDate nacimiento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getNacimiento() {
        return nacimiento;
    }
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
    @Override
    public String toString() {
        return "{ "+ apellido + ", " + nombre + " | Fecha de cumpleanios: " + nacimiento + " }";
    }  
}

