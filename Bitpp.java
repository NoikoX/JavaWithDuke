import java.util.Scanner;

public class Bitpp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int result = 0;

        int n = sc.nextInt();
        sc.nextLine();
        while (n != 0){
            String statement = sc.nextLine();
            if (statement.equals("++X") || statement.equals("X++")){
                ++result;
            }else{
                result--;
            }
            n--;
        }
        System.out.println(result);

    }
}
