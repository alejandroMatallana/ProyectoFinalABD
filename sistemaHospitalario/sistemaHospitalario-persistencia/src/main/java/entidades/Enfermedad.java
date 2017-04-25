package entidades;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Enfermedad")
public class Enfermedad implements Serializable{
	@Id
	@Column(name="Id_Enfermedad")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Nombre",nullable = false,length=50)
	private String nombre;
	
	@JoinColumn(name="Sintomas_Id_Sintomas")
	@ManyToOne(cascade={})
	private Sintoma sintomas;
		
	@JoinColumn(name="Tratamiento_Id_Tratamiento")
	@ManyToOne(cascade={})
	private Tratamiento tratamiento;

	public Enfermedad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enfermedad(String nombre, Sintoma sintomas, Tratamiento tratamiento) {
		super();
		this.nombre = nombre;
		this.sintomas = sintomas;
		this.tratamiento = tratamiento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Sintoma getSintomas() {
		return sintomas;
	}

	public void setSintomas(Sintoma sintomas) {
		this.sintomas = sintomas;
	}

	public Tratamiento getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enfermedad other = (Enfermedad) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nombre;
	}
}
