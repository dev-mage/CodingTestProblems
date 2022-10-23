package programmers_level_1;

import java.util.HashMap;
import java.util.Map;

public class NumberStringsAndWords {
    public int solution(String s) {
        Map<String, String> numMap = new HashMap<>();
        numMap.put("zero", "0");
        numMap.put("one", "1");
        numMap.put("two", "2");
        numMap.put("three", "3");
        numMap.put("four", "4");
        numMap.put("five", "5");
        numMap.put("six", "6");
        numMap.put("seven", "7");
        numMap.put("eight", "8");
        numMap.put("nine", "9");

        int answer = 0;
        int asciiEndNum = 57;

        StringBuilder tempSb = new StringBuilder();
        StringBuilder answerSb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char letter = (s.charAt(i));
            if(letter > asciiEndNum) {
                tempSb.append(letter);
                if(tempSb.length() >= 3) {
                    String numStr = numMap.get(tempSb.toString());
                    if(numStr != null) {
                        answerSb.append(numStr);
                        tempSb.setLength(0);
                    }
                }
            } else {
                answerSb.append(letter);
            }
        }
        answer = Integer.parseInt(answerSb.toString());
        return answer;
    }

    public static void main(String[] args) {
        NumberStringsAndWords s = new NumberStringsAndWords();
        System.out.println(s.solution("one4seveneight"));
    }
}
