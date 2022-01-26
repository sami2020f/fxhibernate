package control;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PeliculaGenero {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPeliculaGenero;
	
	

	@ManyToOne
	@JoinColumn(name="idPelicula")
	private Peliculas pelicula;
	
	@ManyToOne
	@JoinColumn(name="idDirector")
	private Genero genero;

}
