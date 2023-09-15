package com.brayanvargas.app;

import com.brayanvargas.domain.Producto;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);

        //int cantidadSacar = Integer.parseInt(String.valueOf(scanner.nextInt())) ;
        //Integer aumentarCant = scanner.nextInt();

        Producto product1 = Producto.crearProductoBV("papitas", 5, 2000);
        Producto product2 = Producto.crearProductoBV("yogurt", 1, 2000);
        Producto product3 = Producto.crearProductoBV("arepas", 2, 2000);
        Producto product4 = Producto.crearProductoBV("pasteles", 1, 2000);

       // if (Producto. () <= 0) {
            List<Producto> agotados = new ArrayList<>();
            for (Producto producto : agotados) {
                System.out.println("Los productos agotados son: " + producto);
            }
       // }

        int cantidadProducto1 = product1.getTotalProduct();
        System.out.println("la cantidad del producto uno es: " + cantidadProducto1);

        int totalProducts = product1.getCantProductBV() + product2.getCantProductBV() + product3.getCantProductBV() +
                product4.getCantProductBV();
        System.out.println("La cantidad total de productos es: " + totalProducts);

    }
}
