package com.spoj;

import java.util.Scanner;

public class PrimeGenerator {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = sc.nextInt();

        while (testCases > 0) {
            int lowerBound = sc.nextInt();
            int upperBound = sc.nextInt();

            for (int iterate = lowerBound; iterate<=upperBound;iterate++) {
                if (isPrime(iterate)) {
                    System.out.println(iterate);
                }
            }
            testCases--;

        }
    }

    private static boolean isPrime(int iterate) {

        if (iterate == 0 || iterate == 1) return false;
        if (iterate == 2) return true;
        if (iterate%2 == 0) return false;

        int max = (int)Math.floor(Math.sqrt(iterate));
        for (int i=2; i<=max;i++) {
            if (iterate%i == 0) return false;
        }
        return true;
    }
}
