package product;
import java.lang.*;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="category")

public class Category  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cid;
	@Column
	String cname;
	@Column
	String cdesc;
	@OneToMany(mappedBy = "cat")
	@Cascade(value = (CascadeType.ALL))
	Set<Product>items;
	
	
	
	public Category(String cname, String cdesc) {
		super();
		this.cname = cname;
		this.cdesc = cdesc;
	
	}
	public Set<Product> getItems() {
		return items;
	}
	public void setItems(Set<Product> items) {
		this.items = items;
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCdesc() {
		return cdesc;
	}
	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}
	
	
	
	
	
	
	
	
	
	

	

}
