package edu.umg.programacion1.examen2.seriea;

/**
 * Serie A - Pregunta 3 (1 punto)
 * <p>
 * Tema: getters, setters y validación en métodos de acceso.
 * <p>
 * Instrucciones:
 * <ol>
 *   <li>Complete {@code setPrecio} para que solo acepte valores estrictamente mayores que cero; si el valor es inválido, no modifique {@code precio}.</li>
 *   <li>Complete {@code setStock} para que solo acepte valores mayores o iguales a cero.</li>
 *   <li>En CONCEPTO: explique por qué validar en el setter suele ser preferible a validar en {@code main} cada vez que se asigna el atributo.</li>
 * </ol>
 */
public class Pregunta03GettersSetters {

    private String nombre;
    private double precio;
    private int stock;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        // TODO estudiante


    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        // TODO estudiante


    }

    /*
     * CONCEPTO:
     *
     *
     */
}
