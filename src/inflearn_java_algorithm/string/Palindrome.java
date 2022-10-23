package inflearn_java_algorithm.string;

import java.util.Scanner;

public class Palindrome {
    public static String solution(String palindrome) {
//        return new StringBuilder(palindrome).reverse().toString().equalsIgnoreCase(palindrome) ? "YES" : "NO";
        palindrome = palindrome.toUpperCase();
        int len = palindrome.length();
        for (int i = 0; i < len / 2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(len - 1 - i)) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(solution(in.next()));
    }
}
