package entidades;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "Medicamento")
public class Medicamento implements Serializable{
	@Id
	@Column(name="Id_Medicamento")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Nombre",nullable = false,length=50)
	private String nombre;
	
	@Column(name="Descripcion",nullable = false,length=100)
	private String descripcion;
		
	@Column(name="Cantidad")
	private int cantidad;
	
	@JoinColumn(name="Tipo_Medicamento_Id_Tipo_Medicamento")
	@ManyToOne(cascade={})
	private TipoMedicamento tipoMedicamento;
	
	/* DUDA CON ESTOS CAMPOS */
	@Temporal(TemporalType.DATE)
	@Column(name="Fecha_Vencimiento",nullable = false)
	private Date fechaVencimiento;
	
	@JoinColumn(name="Farmacia_Id_Farmacia")
	@ManyToOne(cascade={})
	private Farmacia farmacia;
}
