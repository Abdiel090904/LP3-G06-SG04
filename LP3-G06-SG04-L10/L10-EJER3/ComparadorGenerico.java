public class ComparadorGenerico {

    public static <T> boolean isEqualTo(T obj1, T obj2) {
        return obj1 != null && obj1.equals(obj2);
    }

    public static void main(String[] args) {
        String str1 = "cuaderno";
        String str2 = "taza";
        String str3 = new String("cuaderno");

        Integer num1 = 48;
        Integer num2 = 42;

        Double dbl1 = 3.14;
        Double dbl2 = 3.14;

        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("Comparando Strings:");
        System.out.println("str1 == str2: " + isEqualTo(str1, str2)); 
        System.out.println("str1 == str3: " + isEqualTo(str1, str3)); 

        System.out.println("\nComparando Enteros:");
        System.out.println("num1 == num2: " + isEqualTo(num1, num2)); 

        System.out.println("\nComparando Doubles:");
        System.out.println("dbl1 == dbl2: " + isEqualTo(dbl1, dbl2)); 

        System.out.println("\nComparando Objects:");
        System.out.println("obj1 == obj2: " + isEqualTo(obj1, obj2));
    }
}
