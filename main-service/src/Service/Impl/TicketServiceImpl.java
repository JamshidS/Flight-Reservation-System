package Service.Impl;

import Service.TicketService;
import model.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketServiceImpl implements TicketService {

    private final List<Ticket> ticketList = new ArrayList<>();

    @Override
    public void createTicket(Ticket ticket) {
        ticketList.add(ticket);
        System.out.println("Ticket has been created with ticket no: " + ticket.getTicketNo());
    }

    @Override
    public Ticket getTicketByTicketNo(long ticketNo) {
        for(Ticket ticket: ticketList) {
            if (ticket.getTicketNo() == ticketNo) {
                return ticket;
            }
        }
        return null;
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketList;
    }

    @Override
    public String cancelTicket(long ticketNo) {
        String response = "Not able to delete. There is no ticket this ticket no.";
        for(Ticket ticket: ticketList) {
            if (ticket.getTicketNo() == ticketNo) {
                ticketList.remove(ticket);
                response = "Ticket has been deleted successfully";
            }
        }
        return response;
    }

}
