package day4;

public class Employee1 {
	int empid;
	String empfname;
	String emplname;
	
	
	public Employee1(int empid, String empfname, String emplname) {
		this.empid = empid;
		this.empfname = empfname;
		this.emplname = emplname;
	}


	
	
	@Override
	public String toString() {
		return "EMPID=" + empid + ", EMP_FIRST_NAME=" + empfname + ", EMP_LAST_NAME=" + emplname;
	}
	

}