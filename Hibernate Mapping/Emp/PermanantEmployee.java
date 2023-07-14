package Emloyee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Permanant")
@PrimaryKeyJoinColumn(name="eid")
public class PermanantEmployee extends Emp 
{
	@Column
	float allownces;
	@Column
	float bonus;
	@Column
	float dedution;
	
	



	public PermanantEmployee(String name, String email, String contactno, float basic, float allownces, float bonus,
			float dedution) {
		super(name, email, contactno, basic);
		this.allownces = allownces;
		this.bonus = bonus;
		this.dedution = dedution;
	}


	public float getAllownces() {
		return allownces;
	}


	public void setAllownces(float allownces) {
		this.allownces = allownces;
	}


	public float getBonus() {
		return bonus;
	}


	public void setBonus(float bonus) {
		this.bonus = bonus;
	}


	public float getDedution() {
		return dedution;
	}


	public void setDedution(float dedution) {
		this.dedution = dedution;
	}
	 
	
	
	
	

}
