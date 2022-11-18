package inflearn_java_algorithm.array;

import java.util.Scanner;

public class ThePeaks {
    public static int solution(int size, int[][] heights) {
        int answer = 0;
        int gridSize = size + 2;
        int[][] grid = new int[gridSize][gridSize];

        for (int i = 1; i <= size; i++) {
            /*
            for (int j = 1; j <= size; j++) {
                grid[i][j] = heights[i - 1][j - 1];
            }
            **/
            System.arraycopy(heights[i - 1], 0, grid[i], 1, size);
        }

        for (int i = 1; i<= size; i++) {
            for (int j = 1; j <= size; j++) {
                int current = grid[i][j];
                int left = grid[i][j - 1];
                int right = grid[i][j + 1];
                int up = grid[i - 1][j];
                int down = grid[i + 1][j];
                if (current > left && current > right && current > up && current > down) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] grid = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(size, grid));
    }
}
