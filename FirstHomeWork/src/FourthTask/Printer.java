package FourthTask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class Equation {
    public static String getSolution(String str) {

        return "0";
    }
}

public class Printer {
    public static void main(String[] args) {
        String file = "";

        if (args.length == 0) {
            file = "input.txt";
        } else {
            file = args[0];
        }

//        Equation eq = new Equation();
//        String result = eq.getSolution(file);
//        System.out.println(result);
    }
}
