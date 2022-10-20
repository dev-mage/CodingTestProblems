package inflearn_java_algorithm;

import java.util.Scanner;

public class ReverseOnlyAlphabets {
    public static String solution(String word) {
        char[] charArr = word.toCharArray();
        int begin = 0;
        int end = charArr.length - 1;
        while (begin < end) {
            char left = charArr[begin];
            char right = charArr[end];
            if (!Character.isAlphabetic(left)) begin++;
            else if (!Character.isAlphabetic(right)) end--;
            else {
                charArr[begin] = right;
                charArr[end] = left;
                begin++;
                end--;
            }
        }
        return String.valueOf(charArr);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(solution(in.next()));
    }
}
