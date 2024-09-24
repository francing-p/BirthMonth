import java.util.Scanner;

public class BirthMon {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int month = 0;

        System.out.print("Enter your birth month as a number. ");

        if (in.hasNextInt()){
            month = in.nextInt();
            if (month>=1 && month<=12){
            System.out.println("Your birth month is: " + month);

                }
            else{
                System.out.println("Number out of range. Please rerun and try again");
            }
        }
        else{
            System.out.println("Invalid input. Your input should be an integer.");
            System.out.println("Please rerun and try again.");
            in.nextLine();
        }

    }

}
