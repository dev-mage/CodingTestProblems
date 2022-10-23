package inflearn_java_algorithm.string;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWords {
    public static ArrayList<String> solution(String[] words) {
        ArrayList<String> answer = new ArrayList<>();

        for (String word : words) {
            char[] letters = word.toCharArray();
            int left = 0;
            int right = letters.length - 1;
            while(left < right) {
                char temp = letters[left]; // 왼쪽 글자 임시 저장
                letters[left] = letters[right]; // 왼쪽 글자를 오른쪽 글자로
                letters[right] = temp; // 오른쪽 글자를 왼쪽 글자로 치환
                left++;
                right--;
            }
            answer.add(String.valueOf(letters));
        }
//        for (String word : words) {
//            answer.add(new StringBuilder(word).reverse().toString());
//        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String[] words = new String[count];
        for (int i = 0; i < count; i++) {
            words[i] = in.next();
        }
        for(String s : solution(words)) {
            System.out.println(s);
        }
    }
}
