package edu.umg.programacion1.examen2.seriea;

/**
 * Serie A - Pregunta 10 (1 punto)
 * <p>
 * Tema: herencia ({@code extends}): subclase con atributos propios, constructor y método adicional
 *      que aprovecha datos de la superclase.
 * <p>
 * Instrucciones:
 * <ol>
 *   <li>Complete el constructor de {@code Revista} para que llame a {@code super(titulo, isbn)} y asigne
 *       {@code numeroEdicion}.</li>
 *   <li>Complete {@code fichaCorta()} para devolver un {@code String} que incluya al menos
 *       {@code titulo}, {@code isbn} y el número de edición (puede usar {@code titulo} e
 *       {@code isbn} heredados; no está obligado a un formato fijo, pero que sea claro de leer).</li>
 *   <li>En CONCEPTO: explique en una o dos frases qué aporta la subclase {@code Revista} frente
 *       a la superclase {@code Publicacion} (relación "es un/una…").</li>
 * </ol>
 */
public class Pregunta10HerenciaSubclase {

    static class Publicacion {
        protected String titulo;	
        protected String isbn;

        public Publicacion(String titulo, String isbn) {
            this.titulo = titulo;
            this.isbn = isbn;
        }
    }

    static class Revista extends Publicacion {
        private int numeroEdicion;

        public Revista(String titulo, String isbn, int numeroEdicion) {
            // TODO estudiante: reemplace por super(titulo, isbn) y asignación de numeroEdicion
            super(titulo, isbn);
            this.numeroEdicion = numeroEdicion;
        }

        public String fichaCorta() {
            // TODO estudiante: retornar texto con titulo, isbn y numero de edicion
            return "Título: " + titulo + " | ISBN: " + isbn + " | Edición: Nro. " + numeroEdicion;
        }
    }

    /*
     * CONCEPTO:
     * La subclase Revista aporta especialización frente a Publicacion mediante el atributo propio numeroEdicion. 
     * Se cumple la relación "una Revista es una Publicacion", heredando sus datos básicos y reutilizando su lógica.
     */
}