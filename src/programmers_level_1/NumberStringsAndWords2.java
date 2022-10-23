package programmers_level_1;

public class NumberStringsAndWords2 {
    final static String[] STR_ARR = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < 10; i++) {
            s = s.replaceAll(STR_ARR[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        NumberStringsAndWords2 s = new NumberStringsAndWords2();
        System.out.println(s.solution("one4seveneight"));
    }
}
