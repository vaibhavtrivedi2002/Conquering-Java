import java.util.Scanner;

public class movieticket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] seats = {
            {1, 1, 1, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0},
        };

        System.out.println("Welcome to Theater Booking System!");

        while (true) {
            System.out.println("\n1. Show Seats");
            System.out.println("2. Book Ticket");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showSeats(seats);
                    break;
                case 2:
                    bookTicket(seats, scanner);
                    break;
                case 3:
                    System.out.println("Exiting Theater Booking System.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void showSeats(int[][] seats) {
        System.out.println("\nSeat Chart:");
        for (int[] row : seats) {
            for (int seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }

    public static void bookTicket(int[][] seats, Scanner scanner) {
        System.out.println("\nBooking Ticket:");

        int row, seat;
        do {
            System.out.print("Enter row number (1-" + seats.length + "): ");
            row = scanner.nextInt() - 1;
            if (row < 0 || row >= seats.length) {
                System.out.println("Invalid row number. Please try again.");
            }
        } while (row < 0 || row >= seats.length);

        do {
            System.out.print("Enter seat number (1-" + seats[row].length + "): ");
            seat = scanner.nextInt() - 1;
            if (seat < 0 || seat >= seats[row].length || seats[row][seat] == 0) {
                System.out.println("Invalid seat number or seat is already booked. Please try again.");
            }
        } while (seat < 0 || seat >= seats[row].length || seats[row][seat] == 0);

        seats[row][seat] = 0; // Mark seat as booked
        System.out.println("Ticket booked successfully!");
    }
}
