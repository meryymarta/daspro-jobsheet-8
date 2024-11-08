import java.util.Scanner;
public class Square12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.print("Enter value N = ");
        int N = input12.nextInt();

        for(int iOuter=1; iOuter <=N; iOuter++) {
            for(int i=1; i<=N; i++){
            System.out.print("*");
        }
        System.out.println();
        }


    }
    
}
