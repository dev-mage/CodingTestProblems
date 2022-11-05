package inflearn_java_algorithm.array;

import java.util.Scanner;

public class Ranking {
    public static int[] solution(int totalStudents, int[] grades) {
        int[] answer = new int[totalStudents];
        for(int i = 0; i < totalStudents; i++) {
            int tempRank = 1;
            for (int j = 0; j < totalStudents; j++) {
                if (grades[i] < grades[j]) {
                    tempRank++;
                }
            }
            answer[i] = tempRank;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalStudents = in.nextInt();
        int[] grades = new int[totalStudents];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = in.nextInt();
        }
        for (int i : solution(totalStudents, grades)) {
            System.out.print(i + " ");
        }
    }
}
