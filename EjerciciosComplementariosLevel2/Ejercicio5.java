package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> pagoxHoras = new ArrayList<>();

        try {
            System.out.println("Cargando datos: ");
            Thread.sleep(2000);
            cantidadHoras(horasTrabajadas);
            costexHora(pagoxHoras);

            System.out.println("Horas trabajadas: ");
            System.out.println(horasTrabajadas);

            System.out.println("Pago por Horas");
            System.out.println(pagoxHoras);

            System.out.println("\nProcesando Datos");
            Thread.sleep(3000);
            System.out.println("Pago fin: ");
            System.out.println(calculoTotalPorDia(horasTrabajadas, pagoxHoras));
            System.out.println("Total fin: $" + calcularPrecioTotal(calculoTotalPorDia(horasTrabajadas, pagoxHoras)));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static List<Integer> calculoTotalPorDia(List<Integer> horas, List<Integer> precios) {
        
        ArrayList<Integer> fullPrice = new ArrayList<>();
        horas.forEach(contenido -> {
            int result = contenido * precios.get(horas.indexOf(contenido)) ;
            fullPrice.add(result);
        });
        
        return fullPrice;
    }

    public static int calcularPrecioTotal(List<Integer> lista) {
        int resultado = 0;
        for (Integer contenido : lista) {
            resultado += contenido;
        }

        return resultado;
    }

    public static void cantidadHoras(List<Integer> lista){
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(4);
        lista.add(5);
    }

    public static void costexHora(List<Integer> lista){
        lista.add(350);
        lista.add(345);
        lista.add(550);
        lista.add(600);
        lista.add(320);
    }
}