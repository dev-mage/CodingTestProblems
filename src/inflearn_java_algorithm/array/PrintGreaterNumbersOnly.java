package inflearn_java_algorithm.array;

import java.util.Scanner;

public class PrintGreaterNumbersOnly {
    public static String solution(int[] nums) {
        StringBuilder sb = new StringBuilder(nums[0] + " ");
        int temp = nums[0];
        for (int i : nums) {
            if(i > temp) sb.append(i).append(" ");
            temp = i;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalNums = in.nextInt();
        int[] nums = new int[totalNums];
        for (int i = 0; i < totalNums; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(solution(nums));
        in.close();
    }
}
