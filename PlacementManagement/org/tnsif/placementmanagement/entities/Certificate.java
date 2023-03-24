package org.tnsif.placementmanagement.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="certificate")
public class Certificate {
	@Id
   private Integer id;
   private Integer year;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getYear() {
	return year;
}
public void setYear(Integer year) {
	this.year = year;
}
public Certificate() {
	super();
	// TODO Auto-generated constructor stub
}
public Certificate(Integer id, Integer year) {
	super();
	this.id = id;
	this.year = year;
}
@Override
public String toString() {
	return "Certificate [id=" + id + ", year=" + year + "]";
}

}

