package boots.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity (name="enterprices")
public class Enterprice implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length=50)
	private String name;
	@Column (length=45)
	private String description;
	@Temporal (TemporalType.DATE)
	@Column (name="date_fundation")
	private Date dateFundation;
	private boolean status;
	
	public Enterprice(String name, String description, Date dateFundation, boolean status) {
		super();
		this.name = name;
		this.description = description;
		this.dateFundation = dateFundation;
		this.status = status;
	}
	public Enterprice() {
		this("","",new Date(),false);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateFundation() {
		return dateFundation;
	}
	public void setDateFundation(Date dateFundation) {
		this.dateFundation = dateFundation;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "enterprices [id=" + id + ", name=" + name + ", description=" + description + ", dateFundation="
				+ dateFundation + ", status=" + status + "]";
	}
	
	
}
