package Service;

import model.Ticket;

import java.util.List;

public interface TicketService {
    void createTicket(Ticket ticket);

    void updateTicket(Ticket ticket);
    // Purchase olmadan önce update edilebiliyor olacak.
    // Örneğin: Bilet fiyatı güncellemesi (Bilet sayısı az ise bilet fiyatını artırsın: Toplam biletin %10 u kaldıysa fiyata %30 zam gibi)

    String cancelTicket(long ticketNo, long userID);
    // Eğer user, bilet'i cancel ettiyse %10 kesintili olacak şekilde iade olacak.

    void purchaseTicket(Ticket ticket);
    // Ticket almayı netleştireceği bir fonksiyon olmalı.
    // Buy sonrası hash map ile user tutulabilir. {ticket_no: user_id}

    Ticket getTicketByTicketNo(long ticketNo);

    List<Ticket> getTicketByUserID(int userID);
    // User'a ait ticket'ları listeleme.

    List<Ticket> getAllTickets();
}
