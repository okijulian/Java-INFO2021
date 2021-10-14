package EjerciciosComplementariosLevel2;

import java.util.*;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        Set<Empleado> empleados = new HashSet<>();

        try {
            System.out.println("Cargar empleados");
            Thread.sleep(2500);

            System.out.println(" Empleados ");
            listaEmpleados(empleados);
            printList(empleados);

            System.out.println("\nCalculating Salaries...");
            Thread.sleep(3000);
            Map<Integer, Integer> salaries = calcularSalario(empleados);
            for (Map.Entry<Integer, Integer> employee : salaries.entrySet()) {
                System.out.println(String.format(
                    "DNI: %d | Salary: $%d", 
                    employee.getKey(), employee.getValue())
                );
            }
        } catch (InterruptedException e) {
            System.err.println("Something went wrong. :(");
        }

    }

    public static void listaEmpleados(Set<Empleado> set) {
        set.add(new Empleado("okisan sosa", 94919292, 19, 1650));
        set.add(new Empleado("cari riquelme", 45687322, 20, 1400));
        set.add(new Empleado("los totora", 984576495, 30, 500));
        set.add(new Empleado("rick y marti", 33445566, 40, 300));
        set.add(new Empleado("capitan america", 11223344, 50, 100));
    }

    public static Map<Integer, Integer> calcularSalario(Set<Empleado> set) {
        Map<Integer, Integer> salaries = new HashMap<>();
        set.forEach(emp ->{
            int salario = emp.getPrecioPorHora()*emp.getHorasTrabajadas();
            salaries.put(emp.getDni(), salario);
        });

        return salaries;
    }

    public static void printList(Set<Empleado> set) {
        for (Empleado empleado : set) {
            System.out.println(empleado);
        }
    }
}

class Empleado{

    private String nombreCompleto;
    private int dni;
    private int horasTrabajadas;
    private int precioPorHora;

    public Empleado(String nombreCompleto, int dni, int horasTrabajadas, int precioPorHora) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.precioPorHora = precioPorHora;
    }


    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setnombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getHorasTrabajadas() {
        return this.horasTrabajadas;
    }

    public void sethorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getPrecioPorHora() {
        return this.precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    @Override
    public String toString() {
        return String.format(
            "%s %d  %d  $%d", 
            getNombreCompleto(), getDni(), getHorasTrabajadas(), getPrecioPorHora()
        );
    }


}
