/*
Una empresa desea calcular el salario semanal de sus empleados basándose en las horas trabajadas y una tarifa fija por hora.
Pide al usuario ingresar la cantidad de empleados.
Para cada empleado, pide ingresar las horas trabajadas.
Usa un bucle para calcular el salario de cada empleado (suponiendo una tarifa fija de $15 por hora).
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cantidadEmpleados = 0;
        double cantidadHoras = 0;
        double tarifaPorHora = 15;
        int contador = 0;

        System.out.print("Ingrese la cantidad de empleados: ");
        cantidadEmpleados = s.nextInt();

        do {
            contador++;
            System.out.print("Ingrese la cantidad de horas trabajadas del empleado " + contador + ": ");
            cantidadHoras = s.nextDouble();
            System.out.println("El salario del empleado " + contador + " Es de: $" + cantidadHoras * tarifaPorHora);
        } while (contador != cantidadEmpleados);


    }

}
