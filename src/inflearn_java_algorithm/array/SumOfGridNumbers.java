package inflearn_java_algorithm.array;

import java.util.Scanner;

public class SumOfGridNumbers {
    public static int solution(int total, int[][] grid) {
        int answer = 0;
        /*
        for (int[] ints : grid) {
            int tempSum = 0;
            for (int i : ints) {
                tempSum += i;
            }
            if (tempSum > answer) answer = tempSum;
        }

        int location = 0;
        while (location < total) {
            int tempSum = 0;
            for (int i = 0; i < total; i++) {
                tempSum += grid[i][location];
            }
            if (tempSum > answer) answer = tempSum;
            location++;
        }

        int tempSum = 0;
        for (int i = 0; i < total; i++) {
            tempSum += grid[i][i];
        }
        if (tempSum > answer) answer = tempSum;

        tempSum = 0;
        for (int i = total - 1; i >= 0; i--) {
            tempSum += grid[i][i];
        }
        if (tempSum > answer) answer = tempSum;
        **/

        int temp1 = 0;
        int temp2 = 0;

        for (int i = 0; i < total; i++) {
            temp1 = 0;
            temp2 = 0;
            for (int j = 0; j < total; j++) {
                temp1 += grid[i][j];
                temp2 += grid[j][i];
            }
            answer = Math.max(answer, temp1);
            answer = Math.max(answer, temp2);
        }

        temp1 = 0;
        temp2 = 0;
        for (int i = 0; i < total; i++) {
            temp1 += grid[i][i];
            temp2 += grid[i][total - i - 1];
        }
        answer = Math.max(answer, temp1);
        answer = Math.max(answer, temp2);

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = in.nextInt();
        int[][] grid = new int[total][total];
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                grid[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(total, grid));
    }
}
