package IDK;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for a month: ");
        int month = sc.nextInt();
        int days = 0; 

        if (month == 2 ) {
            days = 28;
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } 

        if (days != 0)
            System.out.println("Number of days in " + month + " month is: " + days);
        else
            System.out.println("Invalid month, no answer can be provided");
    }
}
