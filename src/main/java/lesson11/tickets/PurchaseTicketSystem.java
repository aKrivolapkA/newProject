package src.main.java.lesson11.tickets;

public class PurchaseTicketSystem<T extends iTicket> { // может использовать какой имплиментирует

    T[] tickets;

    public PurchaseTicketSystem(T[] tickets) {
        this.tickets = tickets;
    }
    public void purchaseTicketSystemInfo() {
        for(iTicket ticket : tickets){
            System.out.println(ticket.getType());
        };
    }
}
