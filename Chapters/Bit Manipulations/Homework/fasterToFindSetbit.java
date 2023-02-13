package Bit

import java.util.Scanner;

Manipulations.Homework;

public class fasterToFindSetbit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.print(count);
    }
    // O(log n) Amortzed time
    // faster to find number of setbit on runtime
}
