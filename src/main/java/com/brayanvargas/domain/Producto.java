package com.brayanvargas.domain;

public class Producto {
    private String nombreProductBV;
    private static int cantProductBV = 0;
    private static final Integer CANT_MAX_BV = 8;
    private int precioProductBV;
    private int cantSacarBV;
    private static int totalProduct;

    private Producto(String nombreProductBV, int cantProductBV, int precioProductBV) {
        this.nombreProductBV = nombreProductBV;
        this.cantProductBV = cantProductBV;
        this.precioProductBV = precioProductBV;

    }

    public static Producto crearProductoBV(String nombreProductBV, int cantProductBV, int precioProductBV) {
        totalProduct += cantProductBV;
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

    public static int getCantProductBV() {
        return cantProductBV;
    }

    public int getPrecioProductBV() {
        return precioProductBV;
    }

    public int getCantSacarBV() {
        return cantSacarBV;
    }

    public int getTotalProduct() {
        return totalProduct;
    }

    public void setCantSacarBV(int cantSacarBV) {
        this.cantSacarBV = cantSacarBV;
    }

}
