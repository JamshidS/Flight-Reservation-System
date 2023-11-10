package service;

import model.Reservation;

import java.util.List;

public interface ReservationService {
    public void addReservation(Reservation reservation);
    public Reservation getReservationById(long reservationId);
    public void updateReservation(Reservation updatedReservation);
    public void deleteReservationById(long reservationId);
    public List<Reservation> getAllReservations();
}
