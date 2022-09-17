import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddNonexistentNumbers {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        for(int i = 0; i < 10; i++) {
            if(!list.contains(i)) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        AddNonexistentNumbers anen = new AddNonexistentNumbers();
        System.out.println(anen.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
    }
}
