package gr.ggeorgiadis.supportticketmanager;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicketSystem {
    private final Deque<Ticket> tickets = new LinkedList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        int choice;
        do {
            System.out.println("\n1. Add Ticket\n2. Add Priority Ticket\n3. Serve Next\n4. View Queue\n5. Search Ticket\n6. Exit");
            System.out.print("Choose an option: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                choice = -1; // or any invalid option
            }

            switch (choice) {
                case 1 -> addTicket(false);
                case 2 -> addTicket(true);
                case 3 -> serveNext();
                case 4 -> viewQueue();
                case 5 -> searchTicket();
                case 6 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }

    private void addTicket(boolean vip) {
        System.out.print("Customer name: ");
        String name = scanner.nextLine();
        System.out.print("Issue: ");
        String issue = scanner.nextLine();
        Ticket ticket = new Ticket(name, issue);
        if (vip) {
            tickets.addFirst(ticket);
        } else {
            tickets.addLast(ticket);
        }
        System.out.println("Ticket added: " + ticket);
    }

    private void serveNext() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets to serve.");
        } else {
            Ticket ticket = tickets.pollFirst();
            System.out.println("Serving ticket: " + ticket);
        }
    }

    private void viewQueue() {
        if (tickets.isEmpty()) {
            System.out.println("No pending tickets.");
        } else {
            System.out.println("Pending tickets:");
            tickets.forEach(System.out::println);
        }
    }

    private void searchTicket() {
        System.out.print("Enter ticket ID to search: ");
        int id = Integer.parseInt(scanner.nextLine());

        tickets.stream()
                .filter(ticket -> id == ticket.getId())
                .findFirst()
                .ifPresentOrElse(
                        ticket -> System.out.println("Found: " + ticket),
                        () -> System.out.println("Ticket not found.")
                );

    }
}
