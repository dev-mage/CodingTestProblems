import java.util.*;

public class AddTwoNumbers {
//    public int[] solution(int[] numbers) {
//        // 1. 결과를 담을 배열 선언
//        int[] answer = {};
//
//        // 2. numbers 안의 모든 경우의 수를 뽑아 더하기
//        int arrLeng = numbers.length; // 2-a. numbers 길이 구하기
//        List<Integer> tempList = new ArrayList<Integer>(); // 2-b. 더한 숫자를 담을 임시 리스트(tempList) 선언
//
//        // 2-c. numbers를 순회하면서 해당 인덱스와 인덱스를 제외한 숫자 더하기
//        for(int tempIdx1 = 0; tempIdx1 < arrLeng; tempIdx1++) {
//            for(int tempIdx2 = 0; tempIdx2 < arrLeng; tempIdx2++) {
//                if(tempIdx1 != tempIdx2) {
//                    int num = numbers[tempIdx1] + numbers[tempIdx2];
//                    tempList.add(num);
//                }
//            }
//        }
//
//        // 3. 오름차순 정렬
//        Collections.sort(tempList);
//
//        // 4. 중복 제거
//        LinkedHashSet<Integer> tempSet = new LinkedHashSet<>(tempList);
//
//        // 5. tempSet를 answer로 변환
//        answer = new int[tempSet.size()];
//        int tempIdx3 = 0;
//        for(Integer integer : tempSet) {
//            answer[tempIdx3] = integer.intValue();
//            tempIdx3++;
//        }
//
//        return answer;
//    }

    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                System.out.println(j);
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.solution(numbers);
    }
}
