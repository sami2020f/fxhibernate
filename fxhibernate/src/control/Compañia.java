package control;

import javax.persistence.Column;
import javax.persistence.Id;

public class Compa�ia {

	
	
	@Id
	@Column(name = "idGenero")
	private int idGenero;

	@Column(name = "Compa�ia")
	private String compa�ia;
}
