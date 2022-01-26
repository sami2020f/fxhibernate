package control;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


public class Director {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPeliculas;

	@Column
	private String nombre;

	@Column
	private String apellidos;
	
	@OneToMany(mappedBy = "director", cascade = CascadeType.ALL)
	private Set<PeliculaDirector> peliculaDirector;

//	@ManyToMany(cascade = {CascadeType.ALL},mappedBy="directores")
//	
//	private Set<Peliculas> peliculas=new HashSet();
	
	
	
}