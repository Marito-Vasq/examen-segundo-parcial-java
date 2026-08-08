package edu.umg.programacion1.examen2.serieb;

/**
 * Serie B - Problema 3 (2.5 puntos)
 * <p>
 * Practica: herencia y sobreescritura ({@code @Override}) con reglas distintas por subtipo.
 * <p>
 * Objetivo:
 * <ul>
 *   <li>Clase {@code Cuenta} con saldo (double). Métodos {@code depositar(double m)} y {@code retirar(double m)} con {@code m &gt; 0};
 *       {@code retirar} no debe dejar saldo negativo (si no hay fondos, no cambie el saldo y puede retornar {@code false}, o use el criterio que documente en comentarios).</li>
 *   <li>Clase {@code CuentaAhorro} que extienda {@code Cuenta} y agregue una tasa de interés anual (double, por ejemplo 0.03 para 3%).</li>
 *   <li>Sobreescriba {@code depositar} en {@code CuentaAhorro} para que, además del depósito normal, acredite intereses simples sobre el monto depositado: {@code m * tasa}
 *       (solo como ejemplo de regla adicional; ajuste si prefiere otra fórmula, pero documente).</li>
 *   <li>Proporcione {@code double getSaldo()} coherente en toda la jerarquía.</li>
 * </ul>
 * <p>
 * En {@link #main(String[])} cree una cuenta simple y una cuenta de ahorro, realice depósitos y muestre saldos finales.
 */
class Cuenta {
    protected double saldo;

    public Cuenta(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0.0;
        }
    }

    public void depositar(double m) {
        if (m > 0) {
            this.saldo += m;
        }
    }

    public boolean retirar(double m) {
        if (m > 0 && (this.saldo - m) >= 0) {
            this.saldo -= m;
            return true;
        }
        return false; // Si no hay fondos suficientes, el saldo no se modifica
    }

    public double getSaldo() {
        return this.saldo;
    }
}

class CuentaAhorro extends Cuenta {
    private double tasaInteres;

    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        if (tasaInteres >= 0) {
            this.tasaInteres = tasaInteres;
        } else {
            this.tasaInteres = 0.0;
        }
    }

    @Override
    public void depositar(double m) {
        if (m > 0) {
            // Acredita el depósito normal usando la lógica del padre
            super.depositar(m);
            // Regla adicional: acredita un interés simple extra sobre el monto depositado (m * tasa)
            double interesExtra = m * this.tasaInteres;
            this.saldo += interesExtra;
        }
    }
}

public class Problema03CuentaMain {

    public static void main(String[] args) {
        // 1. Creación de una cuenta simple y una cuenta de ahorro (con tasa del 3% -> 0.03)
        Cuenta cuentaSimple = new Cuenta(500.0);
        CuentaAhorro cuentaAhorro = new CuentaAhorro(500.0, 0.03);

        System.out.println("=== SALDOS INICIALES ===");
        System.out.println("Saldo Cuenta Simple: Q" + cuentaSimple.getSaldo());
        System.out.println("Saldo Cuenta Ahorro: Q" + cuentaAhorro.getSaldo());
        System.out.println();

        // 2. Realizar depósitos en ambas cuentas
        System.out.println("=== REALIZANDO DEPÓSITOS DE Q100 ===");
        cuentaSimple.depositar(100.0); // Sube a 600
        cuentaAhorro.depositar(100.0);  // Sube a 600 + (100 * 0.03) = 603
        System.out.println();

        // 3. Mostrar saldos finales coherentes
        System.out.println("=== SALDOS FINALES ===");
        System.out.println("Saldo Final Cuenta Simple: Q" + cuentaSimple.getSaldo());
        System.out.println("Saldo Final Cuenta Ahorro: Q" + cuentaAhorro.getSaldo());
    }
}
