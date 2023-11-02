package spring.modelos.services;

import java.time.LocalDate;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.modelos.model.BookDTO;
import spring.modelos.model.ReservationDTO;

@Service
public class ReservationServiceImpl implements ReservationService {

	ArrayList<ReservationDTO> ReservationList = new ArrayList<ReservationDTO>();

	@Autowired
	BookService bookService;

	Integer cont = 1;

	@Override
	public ReservationDTO reserveBook(Integer bookId, Integer userId) {

		// Verificar si el libro
		// Saber si está reservado mirando el boolean
		// cambiar el estado del boolean
		// Creamos un nuevo registro de reserva

		BookDTO book = bookService.getBookById(bookId);

		if (book != null) {
			if (!book.getReservado()) {
				book.setReservado(true);
				ReservationDTO reservation = new ReservationDTO(cont, bookId, userId, LocalDate.now(), null);
				ReservationList.add(reservation);
				cont++;
				return reservation;
			} else {
				throw new RuntimeException(); // ReservationConflictExcepcion
			}

		} else {
			throw new RuntimeException(); // BookNotFoundException
		}
	}

	
	@Override
	public void cancelReservation(Integer bookId, Integer userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<ReservationDTO> getAllReservations(Integer userId) {
		// TODO Auto-generated method stub
		return ReservationList;
	}

}
