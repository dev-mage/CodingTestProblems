package programmers_level_1;

public class FindingPrimeNumbers {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(100));
    }
}
