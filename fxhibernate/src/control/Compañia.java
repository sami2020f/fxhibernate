package control;

import javax.persistence.Column;
import javax.persistence.Id;

public class Compañia {

	
	
	@Id
	@Column(name = "idGenero")
	private int idGenero;

	@Column(name = "Compañia")
	private String compañia;
}
