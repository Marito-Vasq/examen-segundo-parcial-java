package edu.umg.programacion1.examen2.seriea;

/**
 * Serie A - Pregunta 1 (1 punto)
 * <p>
 * Tema: encapsulamiento y control de acceso ({@code private}).
 * <p>
 * Instrucciones:
 * <ol>
 *   <li>Complete el setter {@code setEdad} para que no acepte valores negativos (ignore el cambio o use un valor por defecto; indique su criterio en el comentario de concepto).</li>
 *   <li>Escriba debajo, en el bloque "CONCEPTO", en sus propias palabras qué problema resuelve el encapsulamiento frente a dejar {@code edad} como {@code public}.</li>
 * </ol>
 */
public class Pregunta01Encapsulamiento {

    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        // TODO estudiante: validar edad >= 0
        if (edad >= 0) {
            this.edad = edad;
        }
    }

    /*
     * CONCEPTO (escriba aquí su explicación breve, 2-4 líneas):
     * El encapsulamiento evita la corrupción de datos y el acceso descontrolado desde el exterior. 
     * Al dejar la edad como public, cualquier clase podría asignarle un valor negativo o ilógico. 
     * Al usar private y un setter, se centraliza el control y se garantiza la validez del estado interno del objeto.
     */
}
