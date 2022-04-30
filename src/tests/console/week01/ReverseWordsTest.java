package tests.console.week01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseWordsTest {

    public static void intro() {
        System.out.println();
        System.out.println();
        System.out.println("========================================================");
        System.out.println();
        System.out.println();
        System.out.println(" \t \t \t \t  W E L C O M E  ");
        System.out.println();
        System.out.println(" \t \t  R  E  V  E  R  S  E    F  I  L  E    T  E  S  T");
        System.out.println(" \t \t      T E S T    P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("========================================================");
        System.out.println();
        System.out.println();
    }

    public static void read(String inputLocation, List<String> list) throws FileNotFoundException {
        //TODO: READ IN DATA FROM INPUT FILE LOCATION

        File file = new File(inputLocation);
        Scanner input = new Scanner(file);

        //TODO: REVERSE LINES
        while (input.hasNext()) {
            String line = input.nextLine();
            int x = line.length();
            if (x > 0) {
                String reverseString = "";
                for (int i = x - 1; i >= 0; i--) {
                    reverseString += line.charAt(i);
                }

                list.add(reverseString);
            }
        }
            input.close();
        }




    public static void write(String outputLocation, List<String> list) throws FileNotFoundException {
        //TODO : WRITE TO OUTPUT FILE LOCATION
        PrintStream output = new PrintStream(outputLocation);
        for (String y : list) {
            output.println(y);
        }
        output.close();

    }


    public static void main(String[] args) throws FileNotFoundException{
        String inputLocation    = "." + File.separator + "data"
                                      + File.separator + "words.txt";
        String outputLocation   = "." + File.separator + "results"
                                      + File.separator + "reverse_words.txt";

        //TODO: update program to use an Array List

        List <String> list = new ArrayList<>();

        read(inputLocation,list);
        write(outputLocation,list);

    }
}
