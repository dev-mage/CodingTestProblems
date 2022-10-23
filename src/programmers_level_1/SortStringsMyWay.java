package programmers_level_1;

import java.util.*;

public class SortStringsMyWay {

    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        answer = new String[strings.length];

        Map<String, Character> map = new HashMap<>();

        for(int index = 0; index < strings.length; index++) {
            map.put(strings[index], strings[index].charAt(n));
        }

        List<Map.Entry<String, Character>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(new Comparator<Map.Entry<String, Character>>() {
            @Override
            public int compare(Map.Entry<String, Character> o1, Map.Entry<String, Character> o2) {
                if(o1.getValue() < o2.getValue()) {
                    return -1;
                } else if(o1.getValue() == o2.getValue()) {
                    if(o1.getKey().compareTo(o2.getKey()) < 0) {
                        return -1;
                    }
                }
                return 1;
            }
        });

        for(int index = 0; index < strings.length; index++) {
            answer[index] = entryList.get(index).getKey();
        }

        System.out.println(Arrays.toString(answer));

        for(Map.Entry<String, Character> entry : entryList){
            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
        }

//        for (Map.Entry<String, Character> entrySet : map.entrySet()) {
//            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
//        }

        return answer;
    }

    public static void main(String[] args) {
        SortStringsMyWay s = new SortStringsMyWay();
        String[] strings = {"abce", "abcd", "cdx"};
        s.solution(strings, 2);
    }
}
