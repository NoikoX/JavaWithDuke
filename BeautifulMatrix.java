import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        /*
        0 0 0 0 0
        0 0 0 1 0
        0 0 0 0 0
        0 0 0 0 0
        0 0 0 0 0
         */
        int i = 1;
        int j = 1;
        for (i = 1 ; i <= 5; i++){
            if (sc.nextInt() == 1){
                break;
            }
            if (i == 5){
                j++;
                i = 0;
            }
        }
        System.out.println(Math.abs(i-3) + Math.abs(j-3));


    }

}
