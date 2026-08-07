package edu.umg.programacion1.examen2.seriea;

/**
 * Serie A - Pregunta 4 (1 punto)
 * <p>
 * Tema: herencia, {@code extends} y llamada a constructores con {@code super(...)}.
 * <p>
 * Instrucciones:
 * <ol>
 *   <li>Complete la clase {@code Vendedor} para que herede de {@code Empleado}.</li>
 *   <li>El constructor de {@code Vendedor} debe recibir {@code nombre}, {@code salarioBase} y {@code comision}, y llamar al constructor de la superclase con los dos primeros datos.</li>
 *   <li>Implemente {@code salarioTotal()} retornando salario base más comisión.</li>
 *   <li>En CONCEPTO: explique qué hace {@code super(nombre, salarioBase)} y por qué debe ser la primera línea útil del constructor.</li>
 * </ol>
 */
public class Pregunta04HerenciaSuper {

    static class Empleado {
        protected String nombre;
        protected double salarioBase;

        public Empleado(String nombre, double salarioBase) {
            this.nombre = nombre;
            this.salarioBase = salarioBase;
        }
    }

    /**
     * TODO estudiante: complete esta clase según el enunciado (hereda de Empleado).
     */
    static class Vendedor extends Empleado {
        private double comision;

        public Vendedor(String nombre, double salarioBase, double comision) {
            // TODO estudiante: reemplace estas líneas por la llamada correcta a super(...) y la asignación de comision
            super("PENDIENTE", 0);
            this.comision = 0;
        }

        public double salarioTotal() {
            // TODO estudiante: retornar salario base + comision (use los atributos heredados y comision)
            return 0;
        }
    }

    /*
     * CONCEPTO:
     *
     *
     */
}
