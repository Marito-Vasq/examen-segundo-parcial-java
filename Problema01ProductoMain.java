package edu.umg.programacion1.examen2.serieb;

/**
 * Serie B - Problema 1 (2.5 puntos)
 * <p>
 * Practica: encapsulamiento, getters/setters y reglas de negocio en métodos.
 * <p>
 * Objetivo:
 * Modele un producto de inventario con atributos privados: código (String), nombre (String),
 * precio (double, &gt; 0) y stock (int, &gt;= 0). Debe poder:
 * <ul>
 *   <li>Crear productos con datos válidos (rechazar precio &lt;= 0 o stock negativo en constructores o setters, según su diseño).</li>
 *   <li>Vender {@code n} unidades con un método {@code vender(int n)} que descuente el stock si hay suficiente y devuelva {@code true};
 *       si no hay stock suficiente, no modifique nada y devuelva {@code false}.</li>
 *   <li>Mostrar en consola un resumen del producto (código, nombre, precio, stock).</li>
 * </ul>
 * <p>
 * En {@link #main(String[])} demuestre al menos: creación de dos productos, una venta exitosa and una venta fallida.
 * <p>
 * Nota: puede crear las clases adicionales que necesite en este paquete ({@code edu.umg.programacion1.examen2.serieb})
 * u organizar subpaquetes si lo considera necesario.
 */
class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.setPrecio(precio);
        this.setStock(stock);
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            this.precio = 1.0;
        }
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            this.stock = 0;
        }
    }

    public boolean vender(int n) {
        if (n > 0 && this.stock >= n) {
            this.stock -= n;
            return true;
        }
        return false;
    }

    public void mostrarResumen() {
        System.out.println("Código: " + this.codigo + " | Nombre: " + this.nombre + " | Precio: Q" + this.precio + " | Stock: " + this.stock);
    }
}

public class Problema01ProductoMain {

    public static void main(String[] args) {
        // 1. Creación de dos productos con datos válidos
        Producto p1 = new Producto("P001", "Laptop Dell", 4500.0, 10);
        Producto p2 = new Producto("P002", "Mouse Óptico", 150.0, 5);

        System.out.println("=== ESTADO INICIAL ===");
        p1.mostrarResumen();
        p2.mostrarResumen();
        System.out.println();

        // 2. Demostración de una venta exitosa
        System.out.println("=== INTENTO DE VENTA EXITOSA ===");
        boolean venta1 = p1.vender(3);
        System.out.println("¿Venta realizada con éxito?: " + (venta1 ? "SÍ" : "NO"));
        p1.mostrarResumen();
        System.out.println();

        // 3. Demostración de una venta fallida por falta de stock
        System.out.println("=== INTENTO DE VENTA FALLIDA ===");
        boolean venta2 = p2.vender(8);
        System.out.println("¿Venta realizada con éxito?: " + (venta2 ? "SÍ" : "NO"));
        p2.mostrarResumen();
    }
}
