import java.util.Arrays;

class Heap {
    static void heapify(int[] arr, int N, int index) {
        int left = index << 1;// (2*i+1);
        int right = (index << 1) | 1;// (2*i+2);
        int largest = index;
        if (left < N && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < N && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != index) {
            swap(arr, largest, index);
            heapify(arr, N, largest);
        }
    }

    static void perculateDown(int[] arr, int N, int index) {
        heapify(arr, N, index);
    }

    static void perculateUp(int[] arr, int N, int index) {
        while (index > 1 && arr[index / 2] < arr[index]) {
            swap(arr, index, index / 2);
            index = index / 2;
        }
    }

    static void buildHeap(int[] arr, int N) {
        int mid = (N >> 1) + (N & 1);
        for (int index = mid; index >= 1; index--) {
            heapify(arr, N, index);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int heap_pop(int[] arr, int N) {
        int max = arr[1];
        arr[1] = arr[N - 1];
        N--;
        perculateDown(arr, N, 1);
        return max;
    }

    static void heap_push(int[] arr, int N, int value) {
        arr[N++] = value;
        perculateUp(arr, N, N - 1);
    }

    static void increase_key(int[] arr, int N, int index, int diff) {
        if (diff < 0) {
            return;
        }
        arr[index] += diff;
        perculateUp(arr, N, index);
    }

    static void decrease_key(int[] arr, int N, int index, int diff) {
        if (diff > 0) {
            return;
        }
        arr[index] += diff;
        perculateDown(arr, N, index);
    }

    static int[] heapSort(int[] arr, int N) {
        buildHeap(arr, N);
        int heapSize = N;
        int[] res = new int[N - 1];
        for (int i = 1; i < N; i++) {
            res[i - 1] = heap_pop(arr, heapSize);
            heapSize--;
        }
        return res;
    }
}

public class Heap_Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        arr = Heap.heapSort(arr, N);
        System.out.println(Arrays.toString(arr));
    }
}