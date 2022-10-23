package inflearn_java_algorithm.string;

import java.util.Scanner;

public class NumberExtraction {
    public static int solution(String str) {
        int answer = 0;
//        String match = "[^0-9]";
//        answer = Integer.parseInt(str.replaceAll(match, ""));
        for (char c : str.toCharArray()) {
            // if (c > 47 && c < 58) answer = answer * 10 + (c - 48);
            if (Character.isDigit(c)) answer = answer * 10 + (c - 48);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(solution(in.next()));
    }
}
