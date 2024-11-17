/*
Una empresa desea calcular las horas extras trabajadas por sus empleados. Si un empleado trabaja más de 40 horas en la semana, las horas adicionales se consideran horas extras.

Pide al usuario ingresar el número de empleados.
Usa un bucle para ingresar las horas trabajadas por cada empleado.
Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras.
*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cantidadEmpleados = 0;
        int horasTrabajadas = 0;
        int horasSemana = 40;
        int contador = 0;

        System.out.print("Ingrese el número de empleados: ");
        cantidadEmpleados = s.nextInt();

        while (contador != cantidadEmpleados) {

            System.out.print("Cantidad de horas trabajadas por empleado N° " + (contador + 1) + ": ");
            horasTrabajadas = s.nextInt();

            if (horasTrabajadas > horasSemana) {
                System.out.println("El empleado N° " + (contador + 1) + " ha trabajado: " + (horasTrabajadas - horasSemana) + " horas extra");
            }

            contador++;
        }
    }
}
