package inflearn_java_algorithm.string;

import java.util.*;

public class RemoveDuplicatedLetters {
    public static String solution(String word) {
//        StringBuilder answer = new StringBuilder();
//
//        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(word.split("")));
//        for (String s : set) {
//            answer.append(s);
//        }
//        return answer.toString();

        String answer = "";
        for (int i = 0; i < word.length(); i++) {
            if(word.indexOf(word.charAt(i)) == i) answer += word.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(solution(in.next()));
    }
}
