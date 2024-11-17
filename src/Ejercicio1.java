/*
Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado.
*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double tiempo = 0;
        String[] actividades = {"estudiar", "leer", "hacer ejercicios", "tiempo libre"};

        for (int i = 0; i < actividades.length; i++) {
            System.out.print("¿Cuántas horas le dedica diariamente a " + actividades[i] + "? ");
            tiempo += s.nextDouble();
        }

        System.out.println("Total de horas: " + tiempo);

    }
}
