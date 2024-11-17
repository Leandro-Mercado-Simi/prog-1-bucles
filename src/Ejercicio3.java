/*
Una tienda necesita revisar el inventario de sus productos y determinar si algún artículo tiene menos de 5 unidades disponibles para realizar un pedido.
Pide al usuario ingresar el número de productos.
Usa un bucle para ingresar la cantidad disponible de cada producto
Si algún producto tiene menos de 5 unidades, muestra un mensaje indicando que es necesario realizar un pedido.
*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cantidadProductos = 0;
        int stockProducto = 0;
        int contador = 0;

        System.out.print("Ingrese la cantidad de productos: ");
        cantidadProductos = s.nextInt();

        while (contador != cantidadProductos) {
            System.out.println("Ingrese la cantidad disponible del producto " + (contador + 1) + ": ");
            stockProducto = s.nextInt();

            if (stockProducto < 5) {
                System.out.println("Es necesario realizar un pedido del producto");
            }

            contador++;
        }


    }
}
