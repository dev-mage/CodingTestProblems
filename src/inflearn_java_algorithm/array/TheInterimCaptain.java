package inflearn_java_algorithm.array;

import java.util.Scanner;

public class TheInterimCaptain {
    public static int solution(int totalStudents, int[][] students) {
        int answer = 0;
        int[][] classes = new int[5][totalStudents];
        int count = 0;
        int largest = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < totalStudents; j++) {
                classes[i][j] = students[j][i];
            }
        }
        for (int h = 0; h < totalStudents; h++) {
            for (int i = 0; i < 5; i++) {
                int tempClass = classes[i][h];
                for (int j = 0; j < totalStudents; j++) {
                    if (h != j) {
                        if (classes[i][j] == tempClass) count++;
                    }
                }
            }
            if (count > largest) {
                largest = count;
                answer = h + 1;
            }
            count = 0;
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalStudents = in.nextInt();
        int[][] grid = new int[totalStudents][5];
        for (int i = 0; i < totalStudents; i++) {
            for (int j = 0; j < 5; j++) {
                grid[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(totalStudents, grid));
    }
}
