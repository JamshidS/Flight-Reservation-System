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
        System.out.println("Ticket has been created. Ticket no: " + ticket.getTicketNo());
    }

    @Override
    public void updateTicket(Ticket ticket) {
        // İşlemler gelecek...
        System.out.println("Ticket has been updated. Ticket no: " + ticket.getTicketNo());
    }

    @Override
    public String cancelTicket(long ticketNo, long userID) {
        String response = "Ticket not found. Unable to cancel.";
        for(Ticket ticket: ticketList) {
            if (ticket.getTicketNo() == ticketNo) {
                ticketList.remove(ticket);
                response = "Ticket with ticket no " + ticketNo + " has been canceled successfully.";
            }
        }
        return response;
    }

    @Override
    public void purchaseTicket(Ticket ticket) {
        // İşlemler gelecek...
        System.out.println("You have successfully purchased ticket. Your ticket no is: " + ticket.getTicketNo());
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
    public List<Ticket> getTicketByUserID(int userID) {
        // İşlemler gelecek...
        return null;
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketList;
    }
}
