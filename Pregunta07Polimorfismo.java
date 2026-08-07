package edu.umg.programacion1.examen2.seriea;

/**
 * Serie A - Pregunta 7 (1 punto)
 * <p>
 * Tema: polimorfismo: referencia de supertipo y objeto de subtipo.
 * <p>
 * Instrucciones:
 * <ol>
 *   <li>Complete el método {@code imprimirEtiqueta} para que imprima el color y el área usando solo la referencia {@code Figura f}
 *       (no use {@code instanceof} ni conversiones; confíe en el método {@code area()} sobreescrito).</li>
 *   <li>En {@code probar}, complete la línea que asigna a {@code f} un rectángulo de base 3 y altura 4.</li>
 *   <li>En CONCEPTO: en una o dos oraciones, explique qué significa “el método que se ejecuta depende del objeto real, no del tipo de la referencia”.</li>
 * </ol>
 */
public class Pregunta07Polimorfismo {

    static abstract class Figura {
        protected String color;

        protected Figura(String color) {
            this.color = color;
        }

        public abstract double area();

        public String getColor() {
            return color;
        }
    }

    static class Rectangulo extends Figura {
        private final double base;
        private final double altura;

        public Rectangulo(String color, double base, double altura) {
            super(color);
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double area() {
            return base * altura;
        }
    }

    public static void imprimirEtiqueta(Figura f) {
        // TODO estudiante: imprimir color y área usando f.getColor() y f.area()

    }

    public static void probar() {
        // TODO estudiante: asegure base 3 y altura 4 (puede cambiar el color)
        Figura f = new Rectangulo("azul", 3, 4);
        imprimirEtiqueta(f);
    }

    /*
     * CONCEPTO:
     *
     *
     */
}
