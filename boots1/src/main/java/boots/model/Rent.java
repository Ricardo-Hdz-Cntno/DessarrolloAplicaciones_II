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


@Entity (name="rents")
public class Rent implements Serializable{
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	@Temporal (TemporalType.DATE)
	@Column (name="date_rent")
	private Date dateRent;
	@Column (length=50)
	private String description;
	@Column (length=6)
	private int valueRent;
	@Column (length=6)
	private int quantity;
	
	public Rent(Date dateRent, String description, int valueRent, int quantity) {
		super();
		this.dateRent = dateRent;
		this.description = description;
		this.valueRent = valueRent;
		this.quantity = quantity;
	}

	public Rent() {
		this(new Date(),"",0,0);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateRent() {
		return dateRent;
	}

	public void setDateRent(Date dateRent) {
		this.dateRent = dateRent;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getValueRent() {
		return valueRent;
	}

	public void setValueRent(int valueRent) {
		this.valueRent = valueRent;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Rents [id=" + id + ", dateRent=" + dateRent + ", description=" + description + ", valueRent=" + valueRent
				+ ", quantity=" + quantity + "]";
	}
	
	

	
}
