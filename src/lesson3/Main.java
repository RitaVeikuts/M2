package lesson3;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

//String array [][] = new String[4][3];  //3 столбца 4 строки
        /* String array [] = new String [3];
        array [0]="a";
        array [2]="c";
         */

  //String [] array = new String[]{"v1","v2","v3","v4"};
  //array[0] = "value1";
  //array[2] = "value3";

        /*System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);*/

        /*for (int i=0; i<array.length;i++){
            System.out.println(array[i]);*/

    //    for (String s : array) {
      //      System.out.println(s);


        String [][] array = new String[3][];
        array [0]= new String[3];
        array [1]= new String[2];
        array [2]= new String[1];

        for (String [] ar : array) {
            for (String s : ar) {
                s = "a";
                System.out.printf("%3s", s);
            }
            System.out.println();
        }
    }

}
