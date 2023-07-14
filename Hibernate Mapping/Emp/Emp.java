package Emloyee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="emp")
@Inheritance(strategy = InheritanceType.JOINED)
public class Emp 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String name;
	@Column
	String email;
	@Column
	String contactno;
	@Column
	float basic;
	
	
	public Emp(String name, String email, String contactno, float basic) {
		super();
		this.name = name;
		this.email = email;
		this.contactno = contactno;
		this.basic = basic;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public float getBasic() {
		return basic;
	}
	public void setBasic(float basic) {
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", email=" + email + ", contactno=" + contactno + ", basic=" + basic
				+ "]";
	}
	
	
}
