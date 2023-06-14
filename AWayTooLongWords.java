import java.util.Scanner;

public class AWayTooLongWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n != -1){
            String input = sc.nextLine();
            String output = "";
            if (input.length() <= 10){
                System.out.println(input);
            }else{
                output = input.charAt(0) +String.valueOf(input.length()-2)+ input.charAt(input.length()-1);
                System.out.println(output);

            }


            n--;
        }

    }
}
