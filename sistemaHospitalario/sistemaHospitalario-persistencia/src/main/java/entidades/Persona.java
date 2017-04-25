package entidades;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entidad que representa a todas las personas que usan el aplicativo
 * 
 */
@Entity
@Table(name = "Persona")
public class Persona implements Serializable{
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="Numero_Identificacion",nullable = false,length=15)
	private String numeroIdentificacion;
	
	@Column(name="Tipo_Identificacion",nullable = false,length=20)
	private String tipoIdentificacion;
	
	@Column(name="Nombre",nullable = false,length=20)
	private String nombre;
	
	@Column(name="Apellido",nullable = false,length=20)
	private String apellido;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Fecha_Nacimiento",nullable = false)
	private Date fechaNacimiento;
	
	@Column(name="Genero")
	private boolean genero;
	
	@Column(name="Correo",nullable = false,length=50)
	private String correo;
	
	@Column(name="telefono",nullable = false,length=20)
	private String telefono;
	
	@JoinColumn(name="Ciudad")
	@ManyToOne(cascade={})
	private Ciudad ciudad;
}
