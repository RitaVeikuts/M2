package lesson2.hw.ex1;

public class Main {
    public static void main(String[] args) {
        int x = 2;
        {
         /*   if ((x*2)>20) {
                System.out.println(x);
            } else  if ((x*2)<20) {
                System.out.println(-x);
            } else if ((x*2)==20) {
                System.out.println('0');
            }
         //123
        }*/

int result=0;

if (x*2<20)
    result = -x;
else if (x*2>20)
    result = x;
else
    result = 0;

            System.out.println(result);
        }
    }
}