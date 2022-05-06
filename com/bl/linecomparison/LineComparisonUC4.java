package com.bl.linecomparison;

public class LineComparisonUC4 extends Method {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        Method method = new Method();

        System.out.println("Enter the co-ordinates(x1,x2)&(y1,y2) for Line 1");
        method.inputCoordinates();
        length1 = calLength();
        System.out.println("Length of the Line 1 is: "+length);

        System.out.println("Enter the co-ordinates(x1,y1)&(x2,y2) for Line 2");
        method.inputCoordinates();
        length2 = calLength();
        System.out.println("Length of the Line 2 is: "+length);

        lineComparison();

    }

}
