package opgave2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] arg){

        int m =mindsteTalAfTo(2,3);
        System.out.println("Mindste tal af to = " + m);
        størsteTalAfTo(2, 5);
        mindsteAfTreTal(5, 10, 50);
        størsteAfTreTal(60, 61, 10);
        int[] array = new int [30];
        array[0] = 10;
        array[1] = 20;
        array[2] = 3;
        array[3] = 5;
        int m1 = mindsteTalAfArray(array, 4);
        System.out.println("Det mindste tal i arrayet er : " + m1);
        int m3 =starsteTalIArray(array, 4);
        System.out.println("Det største tal i array = " + m3);
        int m4 = sumAfArray(array, 4);
        System.out.println("Summen af array = " + m4);
        double m5 = snitAfArray(array, 4);
        System.out.println("Snittet af arrayet er = " + m5);
    }
    // TODO Metode der returnerer det mindste tal af 2 input fra parameterliste - Done
    public static int mindsteTalAfTo (int tal1, int tal2 ){

        if (tal1<tal2){
            return tal1;
        }
        else {
            return tal2;
        }
    }

// TODO Metode der returnerer det største tal af 2 input fra parameterliste - Done
    public static int størsteTalAfTo(int tal1, int tal2 ) {
        if (tal1>tal2){
            return tal1;
        }
        else {
            return tal2;
        }
    }
    //TODO Metode der returnerer det mindste tal af 3 input fra parameterliste - Done
    public static int mindsteAfTreTal (int tal1, int tal2,int tal3 ){

        if (tal1<tal2 && tal1<tal3){
            return tal1;
        }
        if (tal2<tal1 && tal2<tal3){
            return tal2;
        }
        else {
            return tal3;
        }
    }
    //TODO Metode der returnerer det største tal af 3 input fra parameterliste -Done
    public static int størsteAfTreTal (int tal1, int tal2,int tal3 ){

        if (tal1>tal2 && tal1>tal3){
            return tal1;
        }
        if (tal2>tal1 && tal2>tal3){
            return tal2;
        }
        else {
            return tal3;
        }
    }
    //TODO Metode der returnerer det mindste tal i et array input fra parameterliste -Done
    public static int mindsteTalAfArray(int[] ArrayNumbers, int antal){

        int mindsteTal = ArrayNumbers[0];
        for (int i = 1; i < antal; i++) {
            if (mindsteTal > ArrayNumbers[i]) {
                mindsteTal = ArrayNumbers[i];
            }
        }
        return mindsteTal;
    }

//TODO Metode der returnerer største tal i et array input fra parameterliste - Done
    public static int starsteTalIArray(int[] ArrayNumbers,int antal){

        int starsteTal = ArrayNumbers[0];
        for (int i = 1; i < antal; i++) {
            if(starsteTal < ArrayNumbers[i]){
                starsteTal = ArrayNumbers[i];
            }
        }

        return starsteTal;
    }

//TODO Metode der returnerer summen af tal i et array input fra parameterliste
    public static int sumAfArray(int[] ArrayNumbers,int antal3){
        int sum = 0;
        int i;

        for (i = 0; i < antal3; i++)
        sum += ArrayNumbers[i];

        return sum;
    }
// TODO Metode der returnerer gennemsnittet tal i et array input fra parameterliste
    public static double snitAfArray(int[] ArrayNumbers,int antal4){
        double sum = 0;
        int i;
        double snit= 0;
        for (i = 0; i < antal4; i++) {
            sum += ArrayNumbers[i];
        }
        snit = sum / antal4;
        //System.out.format("hej %f.2",snit);
        return snit;
    }
}
