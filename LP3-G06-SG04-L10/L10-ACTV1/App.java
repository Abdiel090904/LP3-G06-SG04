public class App {
    public static void main(String[] args) throws Exception {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'O', 'L', 'A'};
        Float[] floatArray = {1.8f, 2.3f, 3.5f, 4.8f, 5.6f};
        Boolean[] boolArray = {true, false, true, false};
        Persona[] personaArray = {
                new Persona("77223066", "Mirella", "Av Venezuela 102"),
                new Persona("41067941", "Jair", "Calle Ormeño 201")
        };
        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);

        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);

        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);
        
        System.out.printf("%nArray floatArray contiene:%n");
        imprimirArray(floatArray);

        System.out.printf("%nArray boolArray contiene:%n");
        imprimirArray(boolArray);

        System.out.printf("%nArray personaArray contiene:%n");
        imprimirArray(personaArray);
    }
//        public static void imprimirArray(Integer[] inputArray){
//            for (Integer elemento : inputArray) {
//                System.out.printf("%s ", elemento);
//            }
//            System.out.println();
//        }
//        public static void imprimirArray(Double[] inputArray){
//            for (Double elemento : inputArray) {
//                System.out.printf("%s ", elemento);
//            }
//            System.out.println();
//        }
//        public static void imprimirArray(Character[] inputArray){
//            for (Character elemento : inputArray){ 
//                System.out.printf("%s ", elemento);
//            }
//            System.out.println();            
//        }
        public static <T> void imprimirArray(T[] inputArray){
            for(T elemento : inputArray){
                System.out.printf("%s ", elemento);
            }
            System.out.println();
        }
}
