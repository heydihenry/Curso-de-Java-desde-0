/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cursojava;

/**
 *
 * @author henry
 */
public class CursoJava {

    public static void main(String[] args) {
        String producto = "Cafe expreso";
        int stock = 20;
        int cantidad = 2;
        double precioUnitario = 50.0;
        boolean disponible = true;

        double totalVenta = cantidad * precioUnitario;
        System.out.println("El total de venta del "+producto +" es: " + totalVenta);

        if (cantidad >= 10) {
            double descuento = totalVenta * 0.20;
            totalVenta -= descuento;
            System.out.println("El total de venta del "+producto+" con descuento es: " + totalVenta);
        }
        if (cantidad <= stock) {
            System.out.println("La cantidad solicitada del producto "+producto+" es menor o igual que la cantidad real");
        }

        boolean vendido = false;
        if (disponible & stock > 0) {
            if (cantidad <= stock) {
                vendido = true;
                System.out.println("La venta del producto "+producto+" es permitida");
                stock -= cantidad;
                System.out.println("El stock actual del producto "+producto+" es: "+stock);
            }

        }
        
        String mensaje = vendido == true ? "valida" : "rechazada";
        System.out.println("La compra es "+mensaje);

    }
}
