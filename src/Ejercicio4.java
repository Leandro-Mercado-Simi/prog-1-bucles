/*
Una tienda desea registrar las ventas realizadas cada día durante una semana. El programa debe calcular el total de ventas al final de la semana.
Usa un bucle para registrar las ventas diarias durante 7 días.
Al final del bucle, muestra el total de ventas de la semana.
*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int totalVentas = 0;

        for (int i = 0; i < dias.length; i++) {
            System.out.print("Cantidad de ventas para el día " + dias[i] + ": ");
            totalVentas += s.nextInt();
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("Cantidad total de ventas en la semana: " + totalVentas);
        System.out.println("-----------------------------------------------------");

    }
}
