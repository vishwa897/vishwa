class Main
{
	public static void main(String args[])
	{
	String ename="vishwa";
	double basic_salary=25000.0,totalsalary,pf,tax,grosssalary;
	double fa=(15.0/100)*basic_salary;
	double da=(12.0/100)*basic_salary;
	double hra=(19.0/100)*basic_salary;
	 totalsalary=basic_salary+fa+da+hra;
	System.out.println(totalsalary);
	if(totalsalary>40000)
	{
	pf=(11/100)*basic_salary;
	tax=(5/100)*basic_salary;
	}
	else
	{
	pf=(7/100)*basic_salary;
	tax=(2.5/100)*basic_salary;
	}
	grosssalary=totalsalary-pf-tax;
	double total=(12*grosssalary);
	System.out.println("grosssalary for one month="+grosssalary);
	System.out.println("total="+ total);
	}
}