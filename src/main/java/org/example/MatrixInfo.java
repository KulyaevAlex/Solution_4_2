package org.example;

import org.w3c.dom.ls.LSOutput;

public class MatrixInfo {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        Matrix matrix2 = new Matrix(new int[][]{
                {9, 8},
                {7, 3}
        });
        int[][] newMatrix = {
                {2, 2, 2},
                {2, 2, 2},
        };
        Matrix matrix3 = new Matrix(newMatrix);
        Matrix matrix4 = new Matrix(new int[][]{
                {4, 3},
                {3, 7}
        });

        System.out.println("Значение элемента матрицы с индексами 1 и 1 : " + matrix1.get(1, 1));
        matrix1.printMatrix();
        System.out.println();
        System.out.println("Установить значение 6 в поле матрицы с индексами 1 и 1 :" + matrix2.set(1, 1, 6));
        matrix2.printMatrix();
        System.out.println();
        System.out.println("Сумма матриц: ");
        Matrix sumOfMatrix = matrix1.add(matrix3);
        sumOfMatrix.printMatrix();
        System.out.println();
        System.out.println("Произведение матриц: ");
        Matrix productOfMatrices = matrix2.multiply(matrix4);
        productOfMatrices.printMatrix();
        System.out.println();
        System.out.println("Проверяем, что копирующий конструктор создаёт независимую копию");
        Matrix mainMatrix = new Matrix(newMatrix);
        mainMatrix.printMatrix();
        System.out.println();
        System.out.println("Создадим копию матрицы");
        Matrix copyMatrix = new Matrix(mainMatrix);
        System.out.println("Изменим значания в копии");
        copyMatrix.set(0, 0, 9);
        copyMatrix.printMatrix();
        System.out.println();
        System.out.println("Выведем основную матрицу");
        mainMatrix.printMatrix();
    }
}