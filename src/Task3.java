import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double userSavingsGoal;
        double amountSaved = 0.00;
        int depositNum = 0;

        do {
            System.out.println("Please enter your savings goal:");
            userSavingsGoal = scan.nextDouble();
            if (userSavingsGoal <= 0) {
                System.out.println("Try again your goal must be a positive number.");
            }
        } while (userSavingsGoal <= 0);

        while (amountSaved < userSavingsGoal) {
            System.out.printf("Current savings total: $%.2f\n", amountSaved);
            double depositAmount;
            do {
                System.out.println("Please enter an amount without any letters or symbols.");
                depositAmount = scan.nextDouble();
                if (depositAmount <= 0) {
                    System.out.println("Your deposit must be a positive number.");
                }
            } while (depositAmount <= 0);

            amountSaved += depositAmount;
            depositNum++;
        }

        double excess = amountSaved - userSavingsGoal;

        System.out.println("\nNumber of Deposits: " + depositNum);
        System.out.println("Total Saved: $" + amountSaved);
        System.out.println("Excess: $" + excess);

    }
}