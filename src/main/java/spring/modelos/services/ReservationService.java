package spring.modelos.services;

import java.util.ArrayList;

import spring.modelos.model.ReservationDTO;

public interface ReservationService {
	
	ReservationDTO reserveBook(Integer bookId, Integer userId);
	
	void cancelReservation(Integer bookId, Integer userId);
	
	ArrayList<ReservationDTO> getAllReservations(Integer userId);

}
