package homew1.ex4;

public class Main {
    public static void main(String[] args) {
        for (int x = 1; x < 10; x++) {
            for (int z = 1; z < 10; z++) {
                //System.out.print(x * z + "\t");
                if (x==1&z==1) {
                    System.out.print("\t");
                    continue;
                }
                System.out.printf(x*z +"\t");
            }

            System.out.println();
        }
    }
}