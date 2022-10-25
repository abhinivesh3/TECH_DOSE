import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		a = countSort(a, n);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static int[] countSort(int[] a, int n) {
		int max = a[0];
		for (int i = 1; i < n; i++) {
			max = Math.max(max, a[i]);
		}
		int[] hash = new int[max + 1];
		for (int i = 0; i < n; i++) {
			hash[a[i]]++;
		}
		for (int i = 1; i <= max; i++) {
			hash[i] += hash[i - 1];
		}
		int[] arr = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			int pos = --hash[a[i]];
			arr[pos] = a[i];
		}
		return arr;
	}

}