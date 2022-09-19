public class CalculateOfInsufficientMoney {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        for(int i = 1; i <= count; i++) {
            total += (long) price * i;
        }
        // if(total - money > 0) {
        //     answer = total - money;
        // }
        // return answer;

//        return total - money < answer ? answer : total - money;
        return Math.max(total - money, answer);
    }

    public static void main(String[] args) {
        CalculateOfInsufficientMoney cal = new CalculateOfInsufficientMoney();
        System.out.println(cal.solution(3, 20, 4));
    }
}
