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
        for (Ticket ticket : ticketList) {
            if (ticket.getTicketNo() == ticketNo) {
                return ticket;
            }
        }
        throw new IllegalArgumentException("Ticket not found with ticket no: " + ticketNo);
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketList;
    }

    @Override
    public String cancelTicket(long ticketNo) {
        String response = "Ticket not found. Unable to cancel.";
        for(Ticket ticket: ticketList) {
            if (ticket.getTicketNo() == ticketNo) {
                ticketList.remove(ticket);
                response = "Ticket with ticket no " + ticketNo + " has been canceled successfully.";
            }
        }
        return response;
    }

}
