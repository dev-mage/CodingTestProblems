package inflearn_java_algorithm.array;

import java.util.Scanner;

public class FibonacciNumbers {
    public static String solution(int num) {
        StringBuilder sb = new StringBuilder();
        int[] fibo = new int[num];
        fibo[0] = 1;
        fibo[1] = 1;
        for (int i = 2; i < num; i++) {
            fibo[i] = fibo[i - 2] + fibo[i - 1];
        }

        for (int i : fibo) {
            sb.append(i).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(solution(num));

        in.close();
    }
}
