import java.util.Scanner;
public class assignmentPorseni12 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        String[] Sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};
        String[][] atletName = new String[Sports.length][5];
        System.out.println("Politeknik");

        for(int i = 0; i < Sports.length; i++){
            System.out.println("Enter the Athlete Name For Sports "+ Sports[i] + ":");
            for(int j = 0; j < 5; j++) {
                System.out.print("Atlet" + (j+1) + ": ");
                atletName [i][j] = input12.nextLine();

            }
            
        }
    }
    
}
