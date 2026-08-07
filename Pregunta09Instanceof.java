package edu.umg.programacion1.examen2.seriea;

/**
 * Serie A - Pregunta 9 (1 punto)
 * <p>
 * Tema: {@code instanceof} y conversiones seguras (cast) cuando el polimorfismo no basta.
 * <p>
 * Instrucciones:
 * <ol>
 *   <li>Complete {@code describir} para que, si el objeto es {@code Avion}, imprima también {@code getAltitudCrucero()}.</li>
 *   <li>Use {@code instanceof} (o patrón moderno equivalente si su JDK lo permite) antes de convertir.</li>
 *   <li>En CONCEPTO: indique en qué caso típico se usa {@code instanceof} en lugar de confiar solo en un método virtual común.</li>
 * </ol>
 */
public class Pregunta09Instanceof {

    static class Transporte {
        protected String id;

        public Transporte(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    static class Avion extends Transporte {
        private final double altitudCrucero;

        public Avion(String id, double altitudCrucero) {
            super(id);
            this.altitudCrucero = altitudCrucero;
        }

        public double getAltitudCrucero() {
            return altitudCrucero;
        }
    }

    public static void describir(Transporte t) {
        System.out.println("Id: " + t.getId());
        // TODO estudiante: si t es Avion, mostrar también altitud de crucero
        if(t instanceof Avion) {
        	System.out.println(((Avion) t).getAltitudCrucero());
        }

    }

    /*
     * CONCEPTO:
     *
     *
     */
}
