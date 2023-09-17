package com.brayanvargas.app;

import com.brayanvargas.domain.Dispensador;
import com.brayanvargas.domain.Producto;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);

        //int cantidadSacar = Integer.parseInt(String.valueOf(scanner.nextInt())) ;
        //Integer aumentarCant = scanner.nextInt();

        Dispensador dispensador = new Dispensador("dispensador");

        Producto product1 = Producto.crearProductoBV("papitas", 5, 2000);
        Producto product2 = Producto.crearProductoBV("yogurt", 1, 1000);
        Producto product3 = Producto.crearProductoBV("arepas", 5, 1300);
        Producto product4 = Producto.crearProductoBV("pasteles", 1, 500);
        Producto product5 = Producto.crearProductoBV("chorizo", 4, 5000);
        Producto product6 = Producto.crearProductoBV("panzerotti", 2, 4000);
        Producto product7 = Producto.crearProductoBV("Doritos", 1, 2500);
        Producto product8 = Producto.crearProductoBV("Cafe", 1, 10000);
        Producto product9 = Producto.crearProductoBV("Pandequeso", 1, 300);
        Producto product10 = Producto.crearProductoBV("Choclitos", 1, 700);
        Producto product11 = Producto.crearProductoBV("ChesseTres", 1, 800);


        dispensador.agregarProductoBV(product1);
        dispensador.agregarProductoBV(product2);
        dispensador.agregarProductoBV(product3);
        dispensador.agregarProductoBV(product4);

        //PUNTO 1
        dispensador.sacarProductoBV("papitas");

        //PUNTO 2
        dispensador.productosAgotadosBV();

        //PUNTO 3
        int cantidadProducto1 = product1.getCantProductBV();
        System.out.println("la cantidad del producto " + product1.getNombreProductBV() + " es: " + cantidadProducto1);

        //PUNTO 4
        int totalProducts = product1.getCantProductBV() + product2.getCantProductBV() +
                product3.getCantProductBV() + product4.getCantProductBV();
        System.out.println("La cantidad total de unidades de los productos es: " + totalProducts);

        // PUNTO 5
        String nombreProducto = "papitas";
        int cantidadAumentar = 3;

        for (Producto producto : dispensador.getProductos()) {
            if (producto.getNombreProductBV().equals(nombreProducto)) {
                producto.setCantProductBV(producto.getCantProductBV() + cantidadAumentar);
                System.out.println("Se aumentó la cantidad de " + nombreProducto + " en " + cantidadAumentar + " unidades.");
                break;
            }
        }

        //PRUEBA DE VOLVER A SUMAR LAS CANTIDADES
        int cantidadProductoBV = product1.getCantProductBV();
        int totalProductsBV = product1.getCantProductBV() + product2.getCantProductBV() +
                product3.getCantProductBV() + product4.getCantProductBV();
        System.out.println("la cantidad del producto " + product1.getNombreProductBV() + " es: " + cantidadProductoBV);
        System.out.println("La cantidad total de unidades de los productos es: " + totalProductsBV);


    }
}
