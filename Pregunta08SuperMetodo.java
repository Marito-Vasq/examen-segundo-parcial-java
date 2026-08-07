package edu.umg.programacion1.examen2.seriea;

/**
 * Serie A - Pregunta 8 (1 punto)
 * <p>
 * Tema: uso de {@code super.nombreMetodo(...)} dentro de un método sobreescrito.
 * <p>
 * Instrucciones:
 * <ol>
 *   <li>La clase {@code CuentaBonificada} sobreescribe {@code depositar}: primero debe aplicar la lógica extra (bonificación del 1% sobre el monto),
 *       y luego debe delegar en {@code Cuenta.depositar} el depósito del monto original (no del bonificado), usando {@code super}.</li>
 *   <li>Complete el cuerpo de {@code depositar} en {@code CuentaBonificada}.</li>
 *   <li>En CONCEPTO: explique la diferencia entre llamar {@code depositar(monto)} dentro de la subclase y llamar {@code super.depositar(monto)}.</li>
 * </ol>
 */
public class Pregunta08SuperMetodo {

    static class Cuenta {
        protected double saldo;

        public Cuenta(double saldoInicial) {
            this.saldo = saldoInicial;
        }

        public void depositar(double monto) {
            if (monto > 0) {
                saldo += monto;
            }
        }

        public double getSaldo() {
            return saldo;
        }
    }

    static class CuentaBonificada extends Cuenta {

        public CuentaBonificada(double saldoInicial) {
            super(saldoInicial);
        }

        @Override
        public void depositar(double monto) {
            // TODO estudiante: si monto > 0, sumar bonificación 0.01*monto al saldo, luego super.depositar(monto)


        }
    }

    /*
     * CONCEPTO:
     *
     *
     */
}
