package inflearn_java_algorithm.string;

import java.util.Scanner;

public class TheShortestDistanceBetweenLetters {
    public static String solution(String word, char letter) {
        String answer = "";
        StringBuilder temp = new StringBuilder();
        int len = word.length();
        for (int i = 0; i < len; i++) {
            int cnt1 = 0;
            int cnt2 = 0;
            for (int j = i; j < len; j++) {
                if (word.charAt(j) != letter) {
                    cnt1++;
                } else {
                    break;
                }
            }
            for (int k = i; k >= 0; k--) {
                if (i == 0) {
                    cnt2 = cnt1;
                    break;
                } else if (word.charAt(k) != letter) {
                    cnt2++;
                } else {
                    break;
                }
            }
            if (i == len - 1) cnt1 = cnt2;
            temp.append(Math.min(cnt1, cnt2)).append(" ");
        }
        answer = temp.toString().trim();
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(solution(in.next(), in.next().charAt(0)));
    }
}
