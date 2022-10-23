package inflearn_java_algorithm.string;

import java.util.Scanner;

public class ChangeCase {
    public static String solution(String word) {
        StringBuilder answer = new StringBuilder();
        for(char c : word.toCharArray()) {
//            c = c < 97 ? Character.toLowerCase(c) : Character.toUpperCase(c);
//            c = Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
            c = (char) (c < 97 ? c + 32 : c - 32);
            answer.append(c);
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        System.out.println(solution(input1));
    }
}
