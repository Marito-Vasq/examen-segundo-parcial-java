package edu.umg.programacion1.examen2.seriea;

/**
 * Serie A - Pregunta 6 (1 punto)
 * <p>
 * Tema: modificador {@code protected} y herencia.
 * <p>
 * Instrucciones:
 * <ol>
 *   <li>Complete {@code ContadorHijo.incrementarDesdeHijo(int delta)} para que aumente {@code cuenta} definido en la superclase (use el acceso permitido por {@code protected}).</li>
 *   <li>No agregue getters/setter públicos nuevos solo para “romper” el encapsulamiento: use {@code protected} como está planteado.</li>
 *   <li>En CONCEPTO: indique quién puede acceder a un miembro {@code protected} en Java (desde qué lugares del programa).</li>
 * </ol>
 */
public class Pregunta06Protected {

    static class Contador {
        protected int cuenta;

        public Contador(int inicial) {
            this.cuenta = inicial;
        }

        public int getCuenta() {
            return cuenta;
        }
    }

    static class ContadorHijo extends Contador {

        public ContadorHijo(int inicial) {
            super(inicial);
        }

        public void incrementarDesdeHijo(int delta) {
            // TODO estudiante: modificar cuenta sumando delta


        }
    }

    /*
     * CONCEPTO:
     *
     *
     */
}
