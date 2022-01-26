package control;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


public class Genero {

	@Id
	@Column(name = "idGenero")
	private int idCorreo;

	@Column(name = "genero")
	private String genero;

//	@ManyToMany(cascade = {CascadeType.ALL},mappedBy="generos")
//	
//	private Set<Peliculas> peliculas=new HashSet();
	
}
