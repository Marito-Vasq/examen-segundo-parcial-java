package edu.umg.programacion1.examen2.seriea;

/**
 * Serie A - Pregunta 2 (1 punto)
 * <p>
 * Tema: constructores y uso de {@code this}.
 * <p>
 * Instrucciones:
 * <ol>
 *   <li>Complete el constructor con parámetros para inicializar los tres atributos.</li>
 *   <li>Complete el constructor sin argumentos para que deje el producto con código {@code "SIN-COD"}, nombre {@code "Sin nombre"} y precio {@code 0.0} (puede llamar al otro constructor con {@code this(...)}).</li>
 *   <li>En CONCEPTO: explique la diferencia entre un constructor vacío implícito y un constructor sin parámetros que usted define explícitamente.</li>
 * </ol>
 */
public class Pregunta02Constructores {

    private String codigo;
    private String nombre;
    private double precio;

    // TODO estudiante: constructor con (codigo, nombre, precio) — asigne a this.codigo, this.nombre, this.precio
    public Pregunta02Constructores(String codigo, String nombre, double precio) {

    }

    // TODO estudiante: valores por defecto "SIN-COD", "Sin nombre", 0.0 (recomendado: use this(...))
    public Pregunta02Constructores() {

    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    /*
     * CONCEPTO:
     *
     *
     */
}
