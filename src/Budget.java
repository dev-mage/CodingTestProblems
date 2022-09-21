import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        // 부서별 신청한 금액 오름차순 정렬
        Arrays.sort(d);

        for(int i : d) {
            // 예산에서 적은 금액부터 차감 후 부서 수 계산
            if(i <= budget) {
                budget -= i;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Budget budget = new Budget();
        System.out.println(budget.solution(new int[] {1,3,2,5,4}, 9));
    }
}
