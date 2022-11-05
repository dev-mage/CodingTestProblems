package inflearn_java_algorithm.string;

import java.util.Scanner;

public class StringCompression {
    public static String solution(String str) {
        String answer = "";
        /*
        StringBuilder sb = new StringBuilder();
        char letter = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (letter == temp) {
                count++;
            } else {
                sb.append(letter).append(count);
                letter = temp;
                count = 1;
            }
            if (i == str.length() - 1) {
                sb.append(letter).append(count);
            }
        }

        answer = sb.toString().replaceAll("1", "");
        */
        str += " ";
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) cnt++;
            else {
                sb.append(str.charAt(i));
                if (cnt != 1) sb.append(cnt);
                cnt = 1;
            }
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(solution(in.next()));
//        System.out.println(solution("KKHSSSSSSSE"));
    }
}
