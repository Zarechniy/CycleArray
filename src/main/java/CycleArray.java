import java.util.Scanner;

public class CycleArray {
    public static void main(String[] args) {
        final int x = 2;
        final int y = 4;
        final int z = 8;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = scanner.nextInt();

        int[] array = new int[length];
        System.out.println("Создан массив размером " + length);

        System.out.println("Заполняем массив элементами:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Произвожу поиск констант в массиве");
        for(int element: array) {
            if(element == x) {
                System.out.println("Данное значение имеется в константах " + x);
                break;
            }
            else if (element == y) {
                System.out.println("Данное значение имеется в константах " + y);
                break;
            }
            else if (element == z) {
                System.out.println("Данное значение имеется в константах " + z);
                break;
            }
        }
    }
}
