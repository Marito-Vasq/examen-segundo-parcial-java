package edu.umg.programacion1.examen2.serieb;

/**
 * Serie B - Problema 2 (2.5 puntos)
 * <p>
 * Practica: herencia, {@code super}, constructores en jerarquía.
 * <p>
 * Objetivo:
 * <ul>
 *   <li>Clase {@code Empleado} con nombre (String) y salario base (double &gt;= 0).</li>
 *   <li>Clase {@code Vendedor} que extienda {@code Empleado} y agregue comisión (double &gt;= 0).</li>
 *   <li>Método {@code double salarioTotal()} en {@code Vendedor} = salario base + comisión.</li>
 *   <li>Método {@code String resumen()} en ambas clases: en {@code Empleado} nombre y salario base; en {@code Vendedor} incluya también la comisión y el total.</li>
 * </ul>
 * <p>
 * En {@link #main(String[])} cree al menos un empleado y un vendedor, imprima el {@code resumen()} de cada uno.
 * <p>
 * Nota: defina las clases que hagan falta; respete el uso de {@code super} donde corresponda.
 */
class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            this.salarioBase = 0.0;
        }
    }

    public String resumen() {
        return "Empleado: " + this.nombre + " | Salario Base: Q" + this.salarioBase;
    }
}

class Vendedor extends Empleado {
    private double comision;

    public Vendedor(String nombre, double salarioBase, double comision) {
        super(nombre, salarioBase);
        if (comision >= 0) {
            this.comision = comision;
        } else {
            this.comision = 0.0;
        }
    }

    public double salarioTotal() {
        return this.salarioBase + this.comision;
    }

    @Override
    public String resumen() {
        return super.resumen() + " | Comisión: Q" + this.comision + " | Total: Q" + this.salarioTotal();
    }
}

public class Problema02HerenciaMain {

    public static void main(String[] args) {
        // 1. Creación de un empleado regular y un vendedor
        Empleado emp = new Empleado("Juan Pérez", 3500.0);
        Vendedor vend = new Vendedor("María López", 4000.0, 1500.0);

        // 2. Impresión del resumen de cada uno
        System.out.println("=== RESUMEN DE PERSONAL ===");
        System.out.println(emp.resumen());
        System.out.println(vend.resumen());
    }
}
