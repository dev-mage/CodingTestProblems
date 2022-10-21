package inflearn_java_algorithm;

import java.util.Scanner;

public class Palindrome2 {
    public static String solution(String palindrome) {
        String match = "[^a-zA-Z]";
        palindrome = palindrome.replaceAll(match, "");
        return new StringBuilder(palindrome).reverse().toString().equalsIgnoreCase(palindrome) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(solution(in.nextLine()));
    }
}
