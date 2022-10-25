import java.util.*;

public class Main {
    public static void bubbleSort(int[] array) {
        int N = array.length;
        for (int i = N - 1; i > 0; i--) {
            boolean isSwapped = false;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (isSwapped == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        bubbleSort(array);
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}