package inflearn_java_algorithm.array;

public class GeneratingPrimeNumbers {
    public static int solution(int[] nums) {
        int answer = 0;
        int numLeng = nums.length;
        for (int i = 0; i < numLeng; i++) {
            for (int j = i + 1; j < numLeng; j++) {
                for (int k = j + 1; k < numLeng; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) answer++;
                }
            }
        }

        return answer;
    }

    public static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,7,6,4}));
    }
}
