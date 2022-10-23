package inflearn_java_algorithm.string;

import java.util.Scanner;

public class Password {
    public static String solution(int num, String password) {
//        String code = password.replaceAll("#", "1").replaceAll("\\*", "0");
        String code = password.replace('#', '1').replace('*', '0');
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < code.length(); i += 7) {
            char letter = (char) Integer.parseInt(code.substring(i, i + 7), 2);
            answer.append(letter);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println(solution(in.nextInt(), in.next()));
        System.out.println(solution(4, "#****###**#####**#####**##**"));
    }
}
