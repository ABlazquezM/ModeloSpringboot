package spring.modelos.services;

import spring.modelos.model.BookDTO;

public interface BookService {

	BookDTO getBookById(Integer id);
}
