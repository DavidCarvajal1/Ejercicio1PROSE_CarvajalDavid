package Ejercicio6;

import java.util.Scanner;

public class TicketCompra {
    public static void main(String[] args) {
        int codigoProducto, cantidad;
        double precioProducto;
        Scanner sc=new Scanner(System.in);
        codigoProducto= sc.nextInt();
        precioProducto=sc.nextDouble();
        cantidad=sc.nextInt();
        System.out.println(codigoProducto+" - "+precioProducto+" - "+cantidad+" - "+(precioProducto*cantidad));
    }
}
