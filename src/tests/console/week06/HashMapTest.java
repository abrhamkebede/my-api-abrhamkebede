package tests.console.week06;

import utils.HashMap;
import utils.Map;

public class HashMapTest {
    public static void intro() {
        System.out.println();
        System.out.println();
        System.out.println("*****************");
        System.out.println();
        System.out.println();
        System.out.println(" \t \t \t \t  W E L C O M E  ");
        System.out.println();
        System.out.println(" \t H A S H   M A P ");
        System.out.println(" \t \t T E S T   P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("*****************");
        System.out.println();
        System.out.println();

    }

    public static void main(String[] args) {
        intro();
        Map<String, String> map = new HashMap<>();
        System.out.println("====================  A  D   D   ======================");
        //test your add method
        System.out.println(map);
        map.put("1", "Tim");
        System.out.println(map);
        map.put("2", "Bob");
        System.out.println(map);


        System.out.println("====================  S  I Z  E  ======================");
        // test for size
        System.out.println("Size of container: " + map.size());
        map.put("3", "Bart");
        System.out.println(map);
        map.put("4", "Bill");
        System.out.println(map);
        System.out.println("Size of container: " + map.size());

        System.out.println("====================  R E M O V E  ======================");
        // test our "remove" method
        System.out.println(map);
        System.out.println("Removing Bob");
        map.remove("2");
        System.out.println(map);
        System.out.println("Size of container: " + map.size());


        System.out.println("====================  C O N T A I N S  ======================");
        //test for our "contains" method
        System.out.println("Search for Bart: \t" + map.containsKey("3"));
        System.out.println("Search for Bob: \t" + map.containsKey("2"));


        System.out.println("====================  C L E A R  ======================");
        // test for the "clear" method
        System.out.println(map);
        map.clear();
        System.out.println(map);
        System.out.println("Size of container: " + map.size());


        System.out.println("====================  E M P T Y  ======================");
        // test for the "isEmpty" method
        System.out.println("Is container empty? \t" + map.isEmpty());
        map.put("1", "Tim");
        System.out.println(map);
        System.out.println("Is container empty? \t" + map.isEmpty());


    }
}



