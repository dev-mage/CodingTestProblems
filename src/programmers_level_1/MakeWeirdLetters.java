package programmers_level_1;

public class MakeWeirdLetters {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();

//        if(strArr.length == 1 && strArr[0].equals("")) {
//            return "";
//        }
        for(int i = 0; i < strArr.length; i++) {
            String word = strArr[i];
            if(word.equals("") && i != strArr.length - 1) {
                sb.append(" ");
            } else {
                for(int j = 0; j < word.length(); j++) {
                    char tempChar = word.charAt(j);
                    if(j % 2 == 0) {
                        sb.append(Character.toUpperCase(tempChar));
                    } else {
                        sb.append(Character.toLowerCase(tempChar));
                    }
                }
                if(i != strArr.length - 1) {
                    sb.append(" ");
                }
            }
        }

        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new MakeWeirdLetters().solution(" aBc   aBc   aBc "));
    }
}
