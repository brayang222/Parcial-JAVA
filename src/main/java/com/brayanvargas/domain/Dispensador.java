package com.brayanvargas.domain;

import java.util.ArrayList;
import java.util.List;
import com.brayanvargas.domain.Producto;

public class Dispensador {
    private String nombreMaquinaBV;
    private static final Integer CAPACIDAD_BV = 10;
    private List<Producto> productosBV;

    public Dispensador(String nombreMaquinaBV) {
        this.nombreMaquinaBV = nombreMaquinaBV;
        this.productosBV = new ArrayList<>();

        if (productosBV.size() > CAPACIDAD_BV) {
            System.out.println("no se pueden tener más de 10 productos");
        }
    }

    public void agregarProductoBV(Producto producto) {
        if (productosBV.size() < CAPACIDAD_BV) {
            productosBV.add(producto);
            System.out.println("Producto '" + producto.getNombreProductBV() + "' agregado a la máquina dispensadora.");
        } else {
            System.out.println("No se pueden agregar más productos. La máquina está llena.");
        }
    }

    public void sacarProductoBV(String nombreProductBV) {

        for (Producto producto : productosBV) {
            if (producto.getNombreProductBV().equals(nombreProductBV)) {

                if (producto.getCantProductBV() > 0) {
                    producto.setCantProductBV(producto.getCantProductBV() - 1);
                    System.out.println("Has sacado una unidad de " + nombreProductBV);
                    return;
                } else {
                    System.out.println("No hay unidades disponibles de " + nombreProductBV);
                    return;
                }
            }
        }
        // Si el producto no se encuentra en la lista
        System.out.println("El producto " + nombreProductBV + " no existe en esta máquina dispensadora.");
    }

    public void productosAgotadosBV() {
        List<String> productosAgotados = new ArrayList<>();

        for (Producto producto : productosBV) {
            if (producto.getCantProductBV() == 0) {
                productosAgotados.add(producto.getNombreProductBV());
            }
        }

        if (productosAgotados.isEmpty()) {
            System.out.println("No hay productos agotados en esta máquina dispensadora.");
        } else {
            System.out.println("Los productos agotados son: " + String.join(", ", productosAgotados));
        }
    }

    public String getNombreMaquina() {
        return nombreMaquinaBV;
    }

    public List<Producto> getProductos() {
        return productosBV;
    }

    public String getNombreMaquinaBV() {
        return nombreMaquinaBV;
    }

    public List<Producto> getProductosBV() {
        return productosBV;
    }

}
