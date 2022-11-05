package inflearn_java_algorithm.array;

import java.util.Scanner;

public class PrimeNumbers {
    public static int solution(int number) {
        int answer = 0;
        int[] numbers = new int[number + 1];

        for (int i = 2; i <= number; i++) {
            if (numbers[i] == 0) {
                answer++;
                for (int j = i; j <= number; j = j + i) {
                    numbers[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(solution(num));
    }
}
