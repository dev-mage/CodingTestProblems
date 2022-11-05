package inflearn_java_algorithm.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversedPrimeNumbers {
    public static ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int number : numbers) {
            int rev = reverseNumber(number);
            if (isPrime(rev)) {
                answer.add(rev);
            }
        }

        return answer;
    }

    public static int reverseNumber(int OriginalNumber) {
        int reversedNumber = 0;
        while (OriginalNumber != 0) {
            reversedNumber = reversedNumber * 10 + OriginalNumber % 10;
            OriginalNumber /= 10;
        }
        return reversedNumber;
    }

    public static boolean isPrime(int number) {
        if (number == 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        for (int i : solution(numbers)) {
            System.out.print(i + " ");
        }
    }
}
