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

@Entity(name="tasks")
public class Task implements Serializable{
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length=45)
	private String name;
	@Column (length=45)
	private String description;
	@Temporal(TemporalType.DATE)
	@Column (name="date_created")
	private Date dateCreated;
	private boolean finished;
	
	public Task(String name, String description, Date dateCreated, boolean finished) {
		super();
		this.name = name;
		this.description = description;
		this.dateCreated = dateCreated;
		this.finished = finished;
	}

	public Task() {
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

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreaated) {
		this.dateCreated = dateCreaated;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	@Override
	public String toString() {
		return "tasks [id=" + id + ", name=" + name + ", description=" + description + ", dateCreated=" + dateCreated
				+ ", finished=" + finished + "]";
	}

}
