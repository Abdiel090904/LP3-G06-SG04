public class App {

    public static void main(String[] args) throws Exception {
        System.out.printf("Minimo de %d, %d, %d y %d es %d%n", 
                3, 4, 5, 6, minimo(3, 4, 5, 6));
        System.out.printf("Minimo de %.1f, %.1f, %.1f y %.1f es %.1f%n", 
                6.6, 7.7, 8.8, 9.9, minimo(6.6, 7.7, 8.8, 9.9));
        System.out.printf("Minimo de %s, %s, %s y %s es %s%n", 
                "pera", "zanahoria", "uva", "manzana", minimo("pera", "zanahoria", "uva", "manzana"));

        Persona persona1 = new Persona("Mirella");
        Persona persona2 = new Persona("Juana");
        Persona persona3 = new Persona("Ana");
        Persona persona4 = new Persona("Zahir");

        System.out.printf("Minimo de %s, %s, %s y %s es %s%n", 
                persona1, persona2, persona3, persona4, minimo(persona1, persona2, persona3, persona4));
    }

    public static <T extends Comparable<T>> T minimo(T w, T x, T y, T z) {
        T min = w;
        if (x.compareTo(min) < 0)
            min = x;
        
        if (y.compareTo(min) < 0)
            min = y;

        if (z.compareTo(min) < 0)
            min = z;

        return min;
    }

    static class Persona implements Comparable<Persona> {
        private String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public int compareTo(Persona otraPersona) {
            return this.nombre.compareTo(otraPersona.nombre);
        }

        @Override
        public String toString() {
            return nombre;
        }
    }
}

