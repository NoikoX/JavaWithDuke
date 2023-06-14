import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] twoNums = input.split(" ");

        int result = 0;

        int n = Integer.parseInt(twoNums[0]);
        int k = Integer.parseInt(twoNums[1]);

        String[] points = sc.nextLine().split(" ");
        List<Integer> intList = Arrays.stream(points)
                .map(Integer::parseInt)
                .toList();
        int kthPoints = intList.get(k-1);
        for (Integer integer : intList) {
            if (integer >= kthPoints && integer > 0) {
                result++;
            }
        }
        System.out.println(result);



    }
}
