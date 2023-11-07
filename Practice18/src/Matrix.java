public class Matrix<T extends Number> {
    private T[][] data;
    private int rows;
    private int cols;

    public Matrix(T[][] data) {
        this.data = data;
        this.rows = data.length;
        this.cols = data[0].length;
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix<T> summ(Matrix<T> other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Размеры матриц должны совпадать для вычитания.");
        }

        T[][] resultData = (T[][]) new Number[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Выполняем поэлементное вычитание
                resultData[i][j] = (T) new Integer(data[i][j].intValue() + other.data[i][j].intValue());
            }
        }

        return new Matrix<>(resultData);
    }

    public Matrix<T> subtract(Matrix<T> other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Размеры матриц должны совпадать для вычитания.");
        }

        T[][] resultData = (T[][]) new Number[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Выполняем поэлементное вычитание
                resultData[i][j] = (T) new Integer(data[i][j].intValue() - other.data[i][j].intValue());
            }
        }

        return new Matrix<>(resultData);
    }

    public static void main(String[] args) {
        Integer[][] matrixData1 = {
                {1, 2},
                {3, 4}
        };
        Integer[][] matrixData2 = {
                {5, 6},
                {7, 8}
        };

        Matrix<Integer> matrix1 = new Matrix<>(matrixData1);
        Matrix<Integer> matrix2 = new Matrix<>(matrixData2);

        System.out.println("Matrix 1:");
        matrix1.printMatrix();

        System.out.println("Matrix 2:");
        matrix2.printMatrix();

        Matrix<Integer> sumMatrix = matrix1.summ(matrix2);
        System.out.println("Sum Matrix:");
        sumMatrix.printMatrix();

        Matrix<Integer> subMatrix = matrix1.subtract(matrix2);
        System.out.println("Sum Matrix:");
        subMatrix.printMatrix();
    }
}
