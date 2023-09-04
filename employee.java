 class Main
{
	public static void main(String[] args) 
	{
	    int empid=1276;
	    String empname="mk";
	    char empdept='c';
	    int basicsalary=15000,tax=200,pf=1800,bonus=917;
	    double ta,da,hra;
	    ta=10.0/100*basicsalary;
	    da=15/100.0*basicsalary;
	    hra=20/100.0*basicsalary;
	    System.out.println(ta);
	    System.out.println(da);
	    System.out.println(hra);
	      double specialallowances=ta+da+hra;
	      double grosssalary=basicsalary+specialallowances;
	      double monthlysalary=grosssalary-pf-tax+bonus;
	      System.out.println(monthlysalary);
	}
}