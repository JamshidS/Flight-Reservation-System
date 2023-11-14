package service;

import model.Reservation;

import java.util.List;

public interface ReservationService {
    public String addReservation(Reservation reservation);
    public Reservation getReservationById(long reservationId);
    public String updateReservation(Reservation updatedReservation);
    public String deleteReservationById(long reservationId);
    public List<Reservation> getAllReservations();
}
