package tests.console.week10;

public class Function02Test {

    public static double add(int x, int y){
        return x + y;
    }

    public static double divide(int x, int y){
        if (x == 0)
            throw new IllegalArgumentException("Cannot Divide by Zero!");

        return (double) y / x;
    }

    public static double multiply(int x, int y){
        return x * y;
    }

    public static double subtract(int x, int y){
        return x - y;
    }


    public static void main(String[] args) {
        System.out.println("Sum of two numbers 10 & 20 is : " + add(10, 20));
        System.out.println("Substraction of two numbers 20 & 10 is : " + subtract(20, 10));
        System.out.println("Multiplication of two numbers 10 & 200 is : " + multiply(10, 20));
        System.out.println("Division of two numbers 45 & 9 is : " + divide(9, 45));



    }



}

