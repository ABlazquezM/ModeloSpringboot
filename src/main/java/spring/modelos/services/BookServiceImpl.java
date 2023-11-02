package spring.modelos.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import spring.modelos.model.BookDTO;

@Service
public class BookServiceImpl implements BookService {

	ArrayList<BookDTO> bookList = new ArrayList<>(
			Arrays.asList(new BookDTO(1, "Cien años de soledad", "Gabriel García Márquez", false, "B1"),
					new BookDTO(2, "1984", "George Orwell", false, "B2"),
					new BookDTO(3, "Un mundo feliz", "Aldous Huxley", false, "B3"),
					new BookDTO(4, "El retrato de Dorian Gray", "Oscar Wilde", false, "B4"),
					new BookDTO(5, "Los pilares de la tierra", "Ken Follett", false, "B5")));

	@Override
	public BookDTO getBookById(Integer id) {

		for (BookDTO b : bookList) {
			if (b.getId() == id) {
				return b;
			}
		}
		return null;
	}

}
