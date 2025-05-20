# SupportTicketManager

A simple Java console application simulating a customer service ticketing system using a `LinkedList` as a queue.

## Overview

This project demonstrates the use of Java collections, classes, and methods in building a console-based support system.

Key features:

- Add support tickets with descriptions.
- View the queue of pending tickets.
- Serve tickets in the order they were added (FIFO).
- Search for a ticket by its unique ID.

It uses a `Deque` (LinkedList implementation) to model a queue and includes clean user input handling via `Scanner`.

## How to Run

1. Clone the repo and open it in your IDE (e.g., IntelliJ).
2. Run the `TicketSystem` class.
3. Interact with the menu options in the terminal.

## Sample Output
>1. Add Ticket
>2. Add Priority Ticket
>3. Serve Next
>4. View Queue
>5. Search Ticket
>6. Exit <br>
 >Choose an option: 1 <br>
 >Customer name: George <br>
 >Issue: Can't log in <br>
 >Ticket added: Ticket #1 | George | Can't log in

## Concepts Demonstrated

- Java Collections (`LinkedList`, `Deque`)
- Encapsulation
- Basic menu-driven console input
- Stream API (`ifPresent`)
- Method references and lambda expressions

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

Feel free to expand this project by adding ticket priorities, timestamps, or persistent storage!