package inflearn_java_algorithm.array;

import java.util.Scanner;

public class CalculateScores {
    public static int solution(int[] numbers) {
        int answer = 0;
        int tempScore = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                tempScore++;
                answer += tempScore;
            } else {
                tempScore = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        System.out.println(solution(numbers));
    }
}
