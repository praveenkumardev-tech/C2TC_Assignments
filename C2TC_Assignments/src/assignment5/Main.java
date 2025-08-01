package assignment5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading CSV input for booking
        String[] bookingDetails = sc.nextLine().split(",");
        String stageEvent = bookingDetails[0];
        String customer = bookingDetails[1];
        int noOfSeats = Integer.parseInt(bookingDetails[2]);

        // Create TicketBooking object
        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        // Read payment mode
        int paymentMode = Integer.parseInt(sc.nextLine());

        switch (paymentMode) {
            case 1: // Cash
                double amount1 = Double.parseDouble(sc.nextLine());
                booking.makePayment(amount1);
                break;

            case 2: // Wallet
                double amount2 = Double.parseDouble(sc.nextLine());
                String wallet = sc.nextLine();
                booking.makePayment(amount2, wallet);
                break;

            case 3: // Credit Card
                String holderName = sc.nextLine();
                double amount3 = Double.parseDouble(sc.nextLine());
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(holderName, amount3, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
