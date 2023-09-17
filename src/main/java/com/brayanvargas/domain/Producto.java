package com.brayanvargas.domain;

public class Producto {
    private String nombreProductBV;
    private static int cantProductBV = 0;
    private int cantidadProductosBV;
    private static final Integer CANT_MAX_BV = 8;
    private int precioProductBV;

    private Producto(String nombreProductBV, int cantProductBV, int precioProductBV) {
        this.nombreProductBV = nombreProductBV;
        this.cantidadProductosBV = cantProductBV;
        this.precioProductBV = precioProductBV;

        cantProductBV += cantProductBV;
    }

    public static Producto crearProductoBV(String nombreProductBV, int cantProductBV, int precioProductBV) {
        if (cantProductBV < CANT_MAX_BV) {
            return new Producto(nombreProductBV, cantProductBV, precioProductBV);
        } else {
            System.out.println("Sólo se puede almacenar una cantidad máxima de 8 productos por producto");
            return null;
        }
    }

    public String getNombreProductBV() {
        return nombreProductBV;
    }

    public int getCantProductBV() {
        return cantidadProductosBV;
    }

    public int getPrecioProductBV() {
        return precioProductBV;
    }

    public void setCantProductBV(int cantProductBV) {
        this.cantidadProductosBV = cantProductBV;
        Producto.cantProductBV += cantProductBV;
    }

}
