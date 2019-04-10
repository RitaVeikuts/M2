package lesson3.classes;

public class Main {
    public static void main(String[] args) {

        String result = newMethod (10,12);

        System.out.println(result);
    }
    private static String newMethod(int a, int b) {

        if (a==b)
            return "equal";

        System.out.printf("a=%d, b=%d\n", a, b);
        return String.valueOf(a - b);


    }

}
