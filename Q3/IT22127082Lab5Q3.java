
import java.util.Scanner;

public class IT22127082Lab5Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");
            input.close();
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            input.close();
            return;
        }

        int daysReserved = endDate - startDate;
        double totalAmount = daysReserved * ROOM_CHARGE;

        if (daysReserved >= 5) {
            totalAmount = totalAmount * (1 - DISCOUNT_20);
        } else if (daysReserved >= 3) {
            totalAmount = totalAmount * (1 - DISCOUNT_10);
        }

        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE);
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);

        input.close();
    }
}
