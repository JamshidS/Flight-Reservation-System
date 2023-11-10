package Service;

import model.Ticket;

import java.util.List;

public interface TicketService {
    void createTicket(Ticket ticket);
    Ticket getTicketByTicketNo(long ticketNo);
    List<Ticket> getAllTickets();
    String cancelTicket(long ticketNo);

}
