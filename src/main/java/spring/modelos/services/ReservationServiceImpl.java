package spring.modelos.services;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import spring.modelos.model.ReservationDTO;

@Service
public class ReservationServiceImpl implements ReservationService{
	
	ArrayList<ReservationDTO> ReservationList = new ArrayList<ReservationDTO>();

	@Override
	public ReservationDTO reserveBook(Integer bookId, Integer userId) { 
		
		
		
		return null;
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
