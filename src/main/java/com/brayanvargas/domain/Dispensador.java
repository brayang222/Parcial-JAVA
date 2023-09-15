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

    public void sacarProducto(int cantSacarBV) {
        int cantProductBV = Producto.getCantProductBV();
        if (cantSacarBV > cantProductBV) {
            System.out.println("No puedes sacar " + cantSacarBV + " productos, porque no hay suficientes");
        } else {
            System.out.println("Sacaste " + cantSacarBV);
            cantProductBV -= cantSacarBV;
        }
        if (cantProductBV == 0) {
            System.out.println("producto agotado");
        }
    }

    public String getNombreMaquina() {
        return nombreMaquinaBV;
    }

    public List<Producto> getProductos() {
        return productosBV;
    }

    public void setProductos(List<Producto> productosBV) {
        this.productosBV = productosBV;
    }
}
