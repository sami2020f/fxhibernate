package control;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class LocalizacionPelicula {
	@Id
	@Column(name = "idLocalizacion")
	private int idLocalizacion;

	@Column(name = "Localizacion")
	private String Localizacion;
	
	@OneToMany(mappedBy = "localizacion", cascade = CascadeType.ALL)
	
	@JoinColumn(name="idLocalizacion")
	private Set<Peliculas> peliculas;
	
}
