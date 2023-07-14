package Emloyee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Temp")
@PrimaryKeyJoinColumn(name="eid")
public class TemporaryEmp extends Emp 
{
	@Column
	float extrapay;
	@Column
	float taxes;
	
	
	
	
	public TemporaryEmp(String name, String email, String contactno, float basic, float extrapay, float taxes) {
		super(name, email, contactno, basic);
		this.extrapay = extrapay;
		this.taxes = taxes;
	}

	public float getExtrapay() {
		return extrapay;
	}
	
	public void setExtrapay(float extrapay) {
		this.extrapay = extrapay;
	}
	
	public float getTaxes() {
		return taxes;
	}
	
	public void setTaxes(float taxes) {
		this.taxes = taxes;
	}
	
	@Override
	public String toString() {
		return "TemporaryEmp [extrapay=" + extrapay + ", taxes=" + taxes + "]";
	}
	
	
}
