package com.SeaRune;

/**
 * <h1>Basic matrices operations app</h1>
 * <p>Constructor Matrix() makes matrix out of 2d array.</p>
 * <p>Method add() adds matrix to current one.</p>
 * <p>Method subtract() subtracts matrix from current one.</p>
 * <p>Method multiply() multiplplies one matrix to another. It generates <b>new result matrix</b></p>
 * <p>Method print() prints matrix to the console.</p>
 * @author goncharov
 * @version 1.0
 */
public class Matrix {
    double[][] elems;

    /**
     * @param elems - двумерный массив, хранящий значения элементов в матрице
     */
    Matrix(double[][] elems) {
        for (int i = 0; i < elems.length; i++)
            for (int j = 0; j < elems[i].length; j++)
                this.elems = elems;
    }

    /**
     * @param summand - матрица, прибавляемая к исходной
    */
    public void add(Matrix summand) {
        for (int i = 0; i < elems.length; i++)
            for (int j = 0; j < elems[i].length; j++)
                elems[i][j] += summand.elems[i][j];
    }

    /**
     * @param subtrahand - матрица, вычитаемая из текущей
     */
    public void subtract(Matrix subtrahand) {
        for (int i = 0; i < elems.length; i++)
            for (int j = 0; j < elems[i].length; j++)
                elems[i][j] -= subtrahand.elems[i][j];
    }

    /**
     *
     * @param multiplier - матрица, на которую производится умножение
     * @return матрица-результат умножения
     */
    public Matrix multiply (Matrix multiplier) {
        double[][] res = new double[elems.length][multiplier.elems[0].length];
        for (int i=0; i < elems.length; i++) //rows from m1
            for (int j=0; j < multiplier.elems[0].length; j++) //columns from m2
                for (int k=0; k < elems[0].length; k++)  { //columns from m1
                    res[i][j] += elems[i][k] * multiplier.elems[k][j]; }

        Matrix mRes = new Matrix(res);
        return mRes;
    }

    /**
     * Метод печати матрицы в консоль
     */
    public void print () {
        for (int i = 0; i < elems.length; i++) {
            System.out.println();
            for (int j = 0; j < elems[i].length; j++)
                System.out.print(elems[i][j] + " ");
        }
    }

}
