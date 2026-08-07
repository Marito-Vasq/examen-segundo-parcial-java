package edu.umg.programacion1.examen2.seriea;

/**
 * Serie A - Pregunta 5 (1 punto)
 * <p>
 * Tema: sobreescritura de métodos y {@code @Override}.
 * <p>
 * Instrucciones:
 * <ol>
 *   <li>Complete {@code Perro.hacerSonido()} para que imprima un mensaje distinto al de {@code Animal} (por ejemplo que ladre).</li>
 *   <li>Agregue la anotación adecuada sobre {@code hacerSonido} en {@code Perro}.</li>
 *   <li>En CONCEPTO: explique qué ventaja tiene marcar un método sobreescrito con {@code @Override} frente a no hacerlo.</li>
 * </ol>
 */
public class Pregunta05Override {

    static class Animal {
        public void hacerSonido() {
            System.out.println("Sonido genérico");
        }
    }

    static class Perro extends Animal {
        @Override
        public void hacerSonido() {
            // TODO estudiante: reemplace el mensaje por uno propio de perro


        }
    }

    /*
     * CONCEPTO:
     *
     *
     */
}
