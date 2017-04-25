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
@Table(name = "Farmacia")
public class Farmacia implements Serializable{
	@Id
	@Column(name="Id_Farmacia")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Nombre",nullable = false,length=30)
	private String nombre;
	
	@Column(name="Direccion",nullable = false,length=30)
	private String direccion;
	
	@Column(name="Telefono",nullable = false,length=15)
	private String telefono;
	
	@JoinColumn(name="Ciudad_Id_Ciudad")
	@ManyToOne(cascade={})
	private Ciudad ciudad;
	
	@JoinColumn(name="Farmaceutico")
	@ManyToOne(cascade={})
	private Farmaceutico farmaceutico;

	public Farmacia() {
		super();
		// TODO Auto-generated constructor stub
	}

}
