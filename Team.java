import java.util.Scanner;

public class Team {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int problemsSolved = 0;
        while (n != -1){
            int oneCounter = 0;
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            for (String value : arr) {
                if (value.equals("1")) {
                    oneCounter++;
                }

            }
            if (oneCounter >= 2){
                problemsSolved++;
            }
            n--;
        }
        System.out.println(problemsSolved);

    }
}
