package entidades;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Farmaceutico")
public class Farmaceutico extends Persona implements Serializable{
	
	@Column(name="Tarjeta_Profesional",nullable = false,length=30)
	private String tarjetaProfesional;
}
