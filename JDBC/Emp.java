package demos;

public class Emp implements Comparable<Emp>
{
	private int empno;
	private String name;
	private float sal;
	
	
	public Emp(int empno, String name, float sal)
	{
		super();
		this.empno = empno;
		this.name = name;
		this.sal = sal;
	}


	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getSal() {
		return sal;
	}


	public void setSal(float sal) {
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", sal=" + sal + "]";
	}


	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		if(this.sal<o.sal)
			return 1;
		else if(this.sal>o.sal)
			return -1;
		else
			return (this.empno-o.empno);
	
	}
	
	

}
