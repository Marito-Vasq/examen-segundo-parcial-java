package edu.umg.programacion1.examen2.seriea;

/**
 * Punto de entrada para <strong>probar en conjunto</strong> los ejercicios de la Serie A.
 * <p>
 * Ejecute esta clase tras completar (o mientras completa) cada {@code Pregunta0X...}.
 * Cada bloque se ejecuta de forma aislada: si una pregunta lanza error, las demás siguen.
 * <p>
 * Terminal (desde la raíz del proyecto):
 * <pre>
 * javac -encoding UTF-8 -d bin $(find src -name "*.java")
 * java -cp bin edu.umg.programacion1.examen2.seriea.SerieAMain
 * </pre>
 */
public final class SerieAMain {

    private SerieAMain() {
    }

    public static void main(String[] args) {
        System.out.println("========== Serie A — ejecución de prueba ==========\n");

        ejecutar("Pregunta 1 — encapsulamiento", SerieAMain::probarPregunta01);
        ejecutar("Pregunta 2 — constructores", SerieAMain::probarPregunta02);
        ejecutar("Pregunta 3 — getters/setters", SerieAMain::probarPregunta03);
        ejecutar("Pregunta 4 — herencia y super()", SerieAMain::probarPregunta04);
        ejecutar("Pregunta 5 — @Override", SerieAMain::probarPregunta05);
        ejecutar("Pregunta 6 — protected", SerieAMain::probarPregunta06);
        ejecutar("Pregunta 7 — polimorfismo", SerieAMain::probarPregunta07);
        ejecutar("Pregunta 8 — super.metodo()", SerieAMain::probarPregunta08);
        ejecutar("Pregunta 9 — instanceof", SerieAMain::probarPregunta09);
        ejecutar("Pregunta 10 — herencia (subclase)", SerieAMain::probarPregunta10);

        System.out.println("\n========== Fin Serie A ==========");
    }

    private static void ejecutar(String titulo, Runnable prueba) {
        System.out.println("--- " + titulo + " ---");
        try {
            prueba.run();
            System.out.println("[OK] Sin excepciones.\n");
        } catch (Throwable t) {
            System.out.println("[ERROR] " + t.getClass().getSimpleName() + ": " + t.getMessage());
            t.printStackTrace(System.out);
            System.out.println();
        }
    }

    private static void probarPregunta01() {
        Pregunta01Encapsulamiento p = new Pregunta01Encapsulamiento();
        p.setEdad(20);
        p.setEdad(-5);
        System.out.println("  edad tras set 20 y luego -5: " + p.getEdad());
    }

    private static void probarPregunta02() {
        Pregunta02Constructores a = new Pregunta02Constructores("A1", "Lápiz", 2.5);
        Pregunta02Constructores b = new Pregunta02Constructores();
        System.out.println("  con args: " + a.getCodigo() + " | " + a.getNombre() + " | " + a.getPrecio());
        System.out.println("  sin args: " + b.getCodigo() + " | " + b.getNombre() + " | " + b.getPrecio());
    }

    private static void probarPregunta03() {
        Pregunta03GettersSetters p = new Pregunta03GettersSetters();
        p.setNombre("Cuaderno");
        p.setPrecio(10);
        p.setPrecio(-1);
        p.setStock(5);
        p.setStock(-2);
        System.out.println("  precio=" + p.getPrecio() + ", stock=" + p.getStock());
    }

    private static void probarPregunta04() {
        Pregunta04HerenciaSuper.Vendedor v =
                new Pregunta04HerenciaSuper.Vendedor("Luis", 3000, 400);
        System.out.println("  salarioTotal (esperado ~3400 si está bien): " + v.salarioTotal());
    }

    private static void probarPregunta05() {
        Pregunta05Override.Perro perro = new Pregunta05Override.Perro();
        System.out.print("  sonido: ");
        perro.hacerSonido();
    }

    private static void probarPregunta06() {
        Pregunta06Protected.ContadorHijo h = new Pregunta06Protected.ContadorHijo(10);
        h.incrementarDesdeHijo(7);
        System.out.println("  cuenta tras +7: " + h.getCuenta());
    }

    private static void probarPregunta07() {
        Pregunta07Polimorfismo.probar();
    }

    private static void probarPregunta08() {
        Pregunta08SuperMetodo.CuentaBonificada c = new Pregunta08SuperMetodo.CuentaBonificada(100);
        c.depositar(50);
        System.out.println("  saldo tras depositar 50 (con bonificación 1% si está completo): " + c.getSaldo());
    }

    private static void probarPregunta09() {
        Pregunta09Instanceof.describir(new Pregunta09Instanceof.Avion("GT-502", 12000));
    }

    private static void probarPregunta10() {
        Pregunta10HerenciaSubclase.Revista r =
                new Pregunta10HerenciaSubclase.Revista("Ciencia Hoy", "978-3-16-148410-0", 12);
        System.out.println("  fichaCorta: " + r.fichaCorta());
    }
}
