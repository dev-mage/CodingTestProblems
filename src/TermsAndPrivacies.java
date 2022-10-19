import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TermsAndPrivacies {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        int prvcLeng = privacies.length;

        String[][] termsArr = new String[terms.length][2];
        for(int i = 0; i < terms.length; i++) {
            String[] tempArr = terms[i].split(" ");
            termsArr[i][0] = tempArr[0];
            termsArr[i][1] = tempArr[1];
        }

        int date = Integer.parseInt(today.replace(".", ""));

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < prvcLeng; i++) {
            String privacy = privacies[i];
            for(String[] s : termsArr) {
                String privacyTerm = String.valueOf(privacy.charAt(privacy.length() - 1));
                if(s[0].equals(privacyTerm)) {
                    int tempYear = Integer.parseInt(privacy.substring(0, 4));
                    int tempMonth = Integer.parseInt(privacy.substring(5, 7)) + Integer.parseInt(s[1]);
                    int tempDay = Integer.parseInt(privacy.substring(8, 10)) - 1;

                    if(tempDay == 0) {
                        tempMonth--;
                        tempDay = 28;
                    }

                    if(tempMonth > 12) {
                        int countYear = tempMonth / 12;
                        tempYear += countYear;
                        tempMonth -= (countYear * 12);
                    }
                    int tempDate = Integer.parseInt(tempYear + String.format("%02d", tempMonth) + String.format("%02d", tempDay));
                    if(tempDate < date) {
                        list.add(i + 1);
                    }
                }
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        new TermsAndPrivacies().solution(
                                "2022.05.19",
                                new String[]{"A 6", "B 12", "C 3"},
                                new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"}
                        )
                )
        );
    }
}
