package service.Impl;

import model.Reservation;
import service.ReservationService;

import java.util.ArrayList;
import java.util.List;

public class ReservationServiceImp implements ReservationService {

    private List<Reservation> reservations = new ArrayList<>();
    private long nextReservationId = 1;

    //add a new reservation
    @Override
    public String addReservation(Reservation reservation){
        //this part every reservation which is added assigns a new id
        reservation.setReservationId(nextReservationId++);
        //and adds the new reservation to the first list
        reservations.add(reservation);
        return "Reservation added!";

    }

    //Scanning all list and tries to find reservation
    @Override
    public Reservation getReservationById(long reservationId){
        for(Reservation reservation : reservations){
            if(reservation.getReservationId() == reservationId){
                return reservation;
            }else{
                System.out.println("Reservation does not exist!");
            }
        }
        return null;
    }

    @Override
    public String updateReservation(Reservation updatedReservation) {
        //This line represents which reservation we want to update.
        long reservationId = updatedReservation.getReservationId();
        //if they matches remove the reservation
        reservations.removeIf(reservation -> reservation.getReservationId() == reservationId);
        //update it
        reservations.add(updatedReservation);
        return "Reservation updated!";
    }

    //delete
    @Override
    public String deleteReservationById(long reservationId) {
        reservations.removeIf(reservation -> reservation.getReservationId() == reservationId);
        return "Reservation deleted!";
    }

    //this for save the original list , returns the copied one
    @Override
    public List<Reservation> getAllReservations() {
        return new ArrayList<>(reservations);
    }
}

