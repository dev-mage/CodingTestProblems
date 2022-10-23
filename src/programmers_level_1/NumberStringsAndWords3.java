package programmers_level_1;

import java.util.HashMap;
import java.util.Map;

public class NumberStringsAndWords3 {
    final static Map<String, String> NUM_MAP = new HashMap<String, String>(){{
        put("zero", "0");
        put("one", "1");
        put("two", "2");
        put("three", "3");
        put("four", "4");
        put("five", "5");
        put("six", "6");
        put("seven", "7");
        put("eight", "8");
        put("nine", "9");
    }};

    public int solution(String s) {
        int answer = 0;
        int asciiEndNum = 57;

        StringBuilder tempSb = new StringBuilder();
        StringBuilder answerSb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char letter = (s.charAt(i));
            if(letter > asciiEndNum) {
                tempSb.append(letter);
                if(tempSb.length() >= 3 && NUM_MAP.containsKey(tempSb.toString())) {
                    answerSb.append(NUM_MAP.get(tempSb.toString()));
                    tempSb.setLength(0);
                }
            } else {
                answerSb.append(letter);
            }
        }
        answer = Integer.parseInt(answerSb.toString());
        return answer;
    }

    public static void main(String[] args) {
        NumberStringsAndWords3 s = new NumberStringsAndWords3();
        System.out.println(s.solution("23four5six7"));
    }
}
