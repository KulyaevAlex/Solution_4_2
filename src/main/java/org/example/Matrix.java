package org.example;

public class Matrix {
    int rows;
    int cols;
    int[][] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }

    public Matrix(int[][] data) {
        int xLength = data.length;
        int yLength = data[0].length;

        this.rows = xLength;
        this.cols = yLength;
        this.data = new int[xLength][yLength];

        for (int i = 0; i < xLength; i++) {
            System.arraycopy(data[i], 0, this.data[i], 0, yLength);
        }
    }

    public Matrix(Matrix otherMatrix) {
        this.rows = otherMatrix.rows;
        this.cols = otherMatrix.cols;
        this.data = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.arraycopy(otherMatrix.data[i], 0, this.data[i], 0, cols);
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    /**
     * Метод возвращает значение элемента по i и j
     */
    public int get(int i, int j) {
        return data[i][j];
    }

    /**
     * Метод возвращает значение элемента по i и j
     */
    public int set(int i, int j, int value) {
        return data[i][j] = value;
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Метод сложения матриц
     */
    public Matrix add(Matrix otherMatrix) {
        if (otherMatrix == null) {
            throw new IllegalArgumentException("otherMatrix не может быть пустой");
        }

        if (this.rows != otherMatrix.rows || this.cols != otherMatrix.cols) {
            throw new IllegalArgumentException(
                    "Несовместимые размеры матриц"
            );
        }

        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = data[i][j] + otherMatrix.data[i][j];
            }
        }
        return result;
    }

    /**
     * Метод умножения матриц
     */
    public Matrix multiply(Matrix otherMatrix) {
        if (otherMatrix == null) {
            throw new IllegalArgumentException("otherMatrix не может быть пустой");
        }

        if (this.cols != otherMatrix.rows) {
            throw new IllegalArgumentException(
                    "Несовместимые размеры матриц"
            );
        }

        int resultRows = this.rows;
        int resultCols = otherMatrix.cols;
        Matrix result = new Matrix(resultRows, resultCols);
        for (int i = 0; i < resultRows; i++) {
            for (int j = 0; j < resultCols; j++) {
                int sum = 0;
                for (int k = 0; k < this.cols; k++) {
                    sum += this.data[i][k] * otherMatrix.data[k][j];
                }
                result.data[i][j] = sum;
            }
        }
        return result;
    }
}