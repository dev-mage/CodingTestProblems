package inflearn_java_algorithm.array;

import java.util.Scanner;

public class VisibleStudents {
    public static int solution(int[] students) {
        int answer = 0;
        int temp = 0;
        for (int i : students) {
            if (i > temp) {
                answer++;
                temp = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalStudents = in.nextInt();
        int[] students = new int[totalStudents];
        for (int i = 0; i < totalStudents; i++) {
            students[i] = in.nextInt();
        }
        System.out.println(solution(students));
        in.close();
    }
}
