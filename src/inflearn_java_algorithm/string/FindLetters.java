package inflearn_java_algorithm.string;
import java.util.Scanner;

public class FindLetters {
    public static int solution(String word, char letter) {
        int answer = 0;
//        for(int i = 0; i < word.length(); i++) {
//            if(String.valueOf(word.charAt(i)).equalsIgnoreCase(letter)) {
//                answer++;
//            }
//        }
        word = word.toUpperCase();
        letter = Character.toUpperCase(letter);
//        for(int i = 0; i < word.length(); i++) {
//            if(word.charAt(i) == letter) answer++;
//        }
        for(char c : word.toCharArray()) {
            if (c == letter) answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);
        System.out.println(solution(input1, input2));
    }
}
