package inflearn_java_algorithm.array;

import java.util.Scanner;

public class RockScissorsPaper {
    public static char[] solution(int totalRounds, int[] a, int[] b) {
        char[] answer = new char[totalRounds];

        for (int i = 0; i < totalRounds; i++) {
            if (a[i] == b[i]) {
                answer[i] = 'D';
            } else if ((a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 3) || (a[i] == 3 && b[i] == 1)) {
                answer[i] = 'B';
            } else {
                answer[i] = 'A';
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalRounds = in.nextInt();
        int[] a = new int[totalRounds];
        int[] b = new int[totalRounds];
        for (int i = 0; i < totalRounds; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < totalRounds; i++) {
            b[i] = in.nextInt();
        }
        for (char c : solution(totalRounds, a, b)) {
            System.out.println(c);
        }
        in.close();
    }
}
