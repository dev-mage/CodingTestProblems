public class FindRemainder1 {
    public int solution(int n) {
        int answer = 0;
//        for (int i = 2; i <= 1000000; i++)
        for (int i = 2; i < n; i++) { // i는 n보다 작다
            if(n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

}
