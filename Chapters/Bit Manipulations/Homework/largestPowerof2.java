package Bit

import java.util.Scanner;

Manipulations.Homework;

public class largestPowerof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int bit = 0;
        while (n > 0) {
            n = n >> 1;
            bit++;
        }
        System.out.println(1 << (bit - 1));
    }
}
