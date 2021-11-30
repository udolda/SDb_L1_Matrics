package com.SeaRune;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[][] m1Elems = {
                {1, 2, 3},
                {4, 5, 6},
                {4, 5, 6},
        };
        Matrix m1 = new Matrix(m1Elems);
        double[][] m2Elems = {
                {1, 2, 1},
                {1, 4, 4},
                {1, 6, 9},
        };
        Matrix m2 = new Matrix(m2Elems);

        Matrix m1Xm2 = m1.multiply(m2);
        m1Xm2.print();

        System.out.println();
        m1Xm2.transposition();
        m1Xm2.print();

        System.out.println();
        m1.add(m2);
        m1.print();

        System.out.println();
        m2.subtract(m1);
        m2.print();
    }
}
