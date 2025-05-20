package gr.ggeorgiadis.supportticketmanager;

public class Ticket {
    private static int counter = 1;
    private final int id;
    private final String customerName;
    private final String issue;

    public Ticket(String customerName, String issue) {
        this.id = counter++;
        this.customerName = customerName;
        this.issue = issue;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Ticket #" + id + " | " + customerName + " | " + issue;
    }
}
