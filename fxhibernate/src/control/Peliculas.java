package control;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



public class Peliculas {

	// Comentario mas grande
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPeliculas;

	@Column
	private String titulo;

	@Column
	private String Año;

	@Column
	private int Duracion;

	@Column
	private Compañia Compañia;

	@Column
	private String Descripcion;

	@Column
	private String Cartel;

	@Column
	private String Directores;

	@Column
	private Actor Actores;

	@Column
	private String Valoracion_IMDB;

	@Column
	private String ValorUsuario;

	@Column
	private String Fecha_Visualizacion_usuario;

	@Column
	private String Comentarios_usuario;

	@ManyToOne
	@JoinColumn(name = "idLocalizacion")

	@Column
	private LocalizacionPelicula Localizacion_pelicula;

	@OneToMany(mappedBy = "peliculas", cascade = CascadeType.ALL)
	private Set<PeliculaActor> peliculaActor;
	@OneToMany(mappedBy = "peliculas", cascade = CascadeType.ALL)
	private Set<PeliculaDirector> peliculadirector;
	@OneToMany(mappedBy = "peliculas", cascade = CascadeType.ALL)
	private Set<PeliculaGenero> peliculagenero;

//	Arreglaaaaaaaaaaaaaar

//	@ManyToMany(cascade = { CascadeType.ALL })
//	@JoinTable(name = "PeliculaDirector", joinColumns = { @JoinColumn(name = "idPeliculas") }, inverseJoinColumns = {
//			@JoinColumn(name = "idDirectores") })
//	private Set<Director> directores = new HashSet();
//
//	@ManyToMany(cascade = { CascadeType.ALL })
//	@JoinTable(name = "PeliculaActor", joinColumns = { @JoinColumn(name = "idPeliculas") }, inverseJoinColumns = {
//			@JoinColumn(name = "idActor") })
//	private Set<Actor> actores = new HashSet();
//		
//	@ManyToMany(cascade = { CascadeType.ALL })
//	@JoinTable(name = "PeliculaGenero", joinColumns = { @JoinColumn(name = "idPeliculas") }, inverseJoinColumns = {
//			@JoinColumn(name = "idGenero") })
//	private Set<Genero> generos = new HashSet();
}
