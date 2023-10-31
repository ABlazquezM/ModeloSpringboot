package spring.modelos.model;
import lombok.Data;

@Data
public class BookDTO {

	private Integer id;
	private String titulo;
	private String autor;
	private Boolean reservado;
	
	
	private String code;
}
