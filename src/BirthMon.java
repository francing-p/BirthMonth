import java.util.Scanner;

public class BirthMon {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int month = 0; // define variables

        System.out.print("Enter your birth month as a number. ");

        if (in.hasNextInt()){ // checks to make sure input was integer
            month = in.nextInt();
            if (month>=1 && month<=12){ // makes sure it is between 1-12
            System.out.println("Your birth month is: " + month);

                }
            else{ // response if not between 1-12
                System.out.println("Number out of range. Please rerun and try again");
            }
        }
        else{ // response if not an integer
            System.out.println("Invalid input. Your input should be an integer.");
            System.out.println("Please rerun and try again.");
            in.nextLine();
        }

    }

}
