package com.bl.linecomparison;

import java.util.Scanner;

public class Method {

    static int x1;
    static int y1;
    static int x2;
    static int y2;

    public static double length;
    public static double length1;
    public static double length2;

    public void inputCoordinates() {

        Scanner scan = new Scanner(System.in);
        x1 = scan.nextInt();
        y1 = scan.nextInt();

        x2 = scan.nextInt();
        y2 = scan.nextInt();

        System.out.println("(" +x1+ "," +y1+ ")");
        System.out.println("(" +x2+ "," +y2+ ")");
    }

    public static double calLength() {

        length = Math.sqrt((Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
        return length;

    }


    public static void lineComparison() {

        if (length1 == length2) {
            System.out.println("Lines are equal");
        }
        else if(length1 > length2){
            System.out.println("Line1 is greater than Line2");
        }
        else {
            System.out.print("Line2 is greater than Line1");
        }
    }
}
