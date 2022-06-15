package tests.console.week10;

import functions.F1;
import functions.F2;
import functions.F3;

public class Function01Test {

    static F1 square = (int x) -> x * x;
    static F1 areaOfCircle = (radius) -> {
        return Math.PI * radius * radius;
    };    static F1 volOfSphere = (radius) -> {
        return (4 * Math.PI * radius * radius) / 3;
    };
    //    static F2 add = Integer::sum;
    static F2 add = (a, b) -> {
        return a + b;
    };
    static F2 sub = (a, b) -> {
        return a - b;
    };
    static F2 mul = (a, b) -> {
        return a * b;
    };
    //typecasting one of the integer argument to double so that
    // integer division doesn't happen and we don't lose the decimal digits
    // integer division truncates the decimal points and hence may show wrong result
    static F2 div = (a, b) -> {
        return (double) a / b;
    };
    static F2 volOfCylinder = (radius, height) -> {
        return Math.PI * radius * radius * height;
    };
    static F3 volOf3DBox = (width, length, height) -> {
        return length * width * height;
    };

    public static void main(String[] args) {
        testSquareFunction(square, 10);
        testOperators(add,"Sum of values are","+",10,20);
        testOperators(sub,"Substraction of values are","-",10,20);
        testOperators(mul,"Multiplication of values are","*",10,20);
        testOperators(div,"Division of values are","/",10,20);
        testVolumeOfBox(volOf3DBox, 10, 20, 30);
        testVolumeOfCylinder(volOfCylinder, 10, 20);
        testVolumeOfSphere(volOfSphere, 10);

    }


    //TODO: Update To Pass Function and Radius Value
    public static void testSquareFunction(F1 f, int value) {
        System.out.println();
        System.out.println("======== R E S U L T S ==========");
        System.out.println();
        System.out.printf("The Square of the value is : %s",f.f(value));
        System.out.println();
        System.out.println("================================");
    }


    //TODO: Update To Pass Function, Operation Message, Symbol and Values
    public static void testOperators(F2 f, String msg, String op, int x, int y) {

        System.out.println();
        System.out.println("============= " + msg + " =============");


        System.out.println();
        if (op.equals("/")) System.out.printf("%d %s %d = %.1f", y, op, x, f.f(x, y));
        else System.out.printf("%d %s %d = %.1f", x, op, y, f.f(x, y));

        System.out.println();
        System.out.println("==================================================");
    }


    //TODO: Update To Pass Function and Dimension Values
    public static void testVolumeOfBox(F3 f, int width, int length, int height) {
        System.out.println();
        System.out.println("======== R E S U L T S==========");
        System.out.println();
        System.out.printf("The volume of the box is: %s",f.f(width, length, height));
        System.out.println();
        System.out.println("================================");
    }


    //TODO: Update To Pass Function and Dimension Values
    public static void testVolumeOfCylinder(F2 f, int radius, int height) {
        System.out.println("======== R E S U L T S==========");
        System.out.println();
        System.out.printf("Volume of cylinder is: %s ",f.f(radius, height));
        System.out.println();
        System.out.println("================================");
    }


    //TODO: Update To Pass Function and Radius Value
    public static void testVolumeOfSphere(F1 f, int radius) {
        //TODO: Update TO PRINT result to console
        System.out.println("======== R E S U L T S ==========");
        System.out.println();
        System.out.printf("Volume of sphere is: %s", f.f(radius));
        System.out.println();
        System.out.println("==================================");
    }

}



