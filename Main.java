import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] oddNumbers = new int[9];
        float[] xArray = new float[14];
        double[][] resultArray = new double[9][14];

        // Заполнение массива нечётными числами от 3 до 19
        int oddNumber = 3;
        for (int i = 0; i < oddNumbers.length; i++) {
            oddNumbers[i] = oddNumber;
            oddNumber += 2;
        }9

        // Заполнение массива x случайными числами от -10.0 до 5.0
        Random random = new Random();
        for (int i = 0; i < xArray.length; i++) {
            xArray[i] = -10.0f + random.nextFloat() * 15.0f;
        }

        // Вычисление элементов двумерного массива
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 14; j++) {
                double x = xArray[j];
                if (oddNumbers[i] == 7) {
                    resultArray[i][j] = Math.asin(Math.pow(Math.sin(x), 2));
                } else if (oddNumbers[i] == 9 || oddNumbers[i] == 11 || oddNumbers[i] == 13 || oddNumbers[i] == 17) {
                    resultArray[i][j] = Math.pow(Math.PI * (Math.pow(Math.log(Math.abs(x)) - 2, 2) - 1), 3);
                } else {
                    resultArray[i][j] = Math.atan(Math.cos(Math.pow(0.5 * (1 - Math.atan(Math.sin(x))), 3)));
                }
            }
        }

        // Печать результатов в виде таблицы с фиксированной шириной
        System.out.println("Таблица Результатов:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 14; j++) {
                System.out.printf("%10.4f ", resultArray[i][j]);
            }
            System.out.println();
        }
    }
}
