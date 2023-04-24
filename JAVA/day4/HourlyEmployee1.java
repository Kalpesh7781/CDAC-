package day4;

public class HourlyEmployee1 extends Employee1{

	float no_of_hours;
	double pay_per_hour;
	double total_pay;
	double over_time=100;
	double monthly_gross_salary;
	double monthly_net_salary;
	float n;

 HourlyEmployee1(int empid, String empfname, String emplname, float no_of_hours, double pay_per_hour,float n) {
		super(empid, empfname, emplname);
		this.no_of_hours=no_of_hours;
		this.pay_per_hour=pay_per_hour;
		this.n=n;
	}


	public void calculation() {
		total_pay = pay_per_hour*no_of_hours;
		monthly_gross_salary = total_pay+over_time*n;
		monthly_net_salary = monthly_gross_salary-(total_pay*0.12);
		}


	public void grosssalary() {
		calculation();
	    System.out.println("The gross salary for employee is ="+monthly_gross_salary);
	}

	public void netsalary() {
		 calculation();
		 System.out.println("The net salary for employee is ="+monthly_net_salary);
		
	}
}
