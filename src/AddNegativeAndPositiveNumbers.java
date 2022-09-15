public class AddNegativeAndPositiveNumbers {
    public int solution(int[] absolutes, boolean[] signs) {
        // 숫자가 음수이면 * -1
        int answer = 0;
//        for(int i = 0; i < absolutes.length; i++) {
//            int tempNum = absolutes[i];
//            if(!signs[i]) {
//                tempNum *= -1;
//            }
//            answer += tempNum;
//        }

        for(int i = 0; i < absolutes.length; i++) {
            answer += signs[i] ? absolutes[i] : absolutes[i] * -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        AddNegativeAndPositiveNumbers numbers = new AddNegativeAndPositiveNumbers();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        System.out.println(numbers.solution(absolutes, signs));
    }
}
