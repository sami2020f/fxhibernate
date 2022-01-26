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

public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idActor;

	@Column
	private String nombre;

	@Column
	private String apellidos;

	@OneToMany(mappedBy = "actor", cascade = CascadeType.ALL)
	private Set<PeliculaActor> peliculaActor;

//	@ManyToMany(cascade = {CascadeType.ALL},mappedBy="actores")
//	
//	private Set<Peliculas> peliculas=new HashSet();

}
