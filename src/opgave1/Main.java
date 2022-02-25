package opgave1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        int number;
        number=f(1);
        udskriv (number,"ja");
        */
    }
    public static int f(int tal) {
        if(tal<7)
            return 1;
        else if(tal<9)
            return 2;
        else if(tal<13)
            return 3;
        else
            return 4;
    }

    public String udskriv(int nr, String besked) {
        System.out.println(nr);
        if (nr < 100) {
            if (besked == "ja")
                return "Godkendt 1";
        }
        if (nr > 100) {
            if (besked == "ja")
                return "Godkendt 2";
        }
        if (nr < 100) {
            if (besked == "nej")
                return "Ikke Godkendt 3";
        }
        if (nr > 100) {
            if (besked == "nej")
                return "Ikke Godkendt 4";
        }
        if (nr == 100) {
            return "Godkendt";
        }
        return null;
    }


}
