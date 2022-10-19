package inflearn_java_algorithm;

import java.util.Scanner;

public class FindTheLongestWordInTheSentence {
    public static String solution(String sentence) {
        String answer = "";
//        for (String word : sentence.split(" ")) {
//            if(answer.length() < word.length()) {
//                answer = word;
//            }
//        }
        int index = 0;
        while ((index = sentence.indexOf(' ')) != -1) {
            String word = sentence.substring(0, index);
            if (answer.length() < word.length()) answer = word;
            sentence = sentence.substring(index + 1);
        }

        if (answer.length() < sentence.length()) answer = sentence;
        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }
}
