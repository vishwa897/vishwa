class Main
{
	public static void main(String args[])
	{
	String name="vishwa",grade;
	char sec='c';
	int scholarship,donation,fee=7400;
	int s1=75,s2=65,s3=76,s4=44,s5=90,s6=37;
	int total = s1+s2+s3+s4+s5+s6;
	System.out.println("total="+total);
	double percentage=(total/600.0)*100;
	System.out.println("percentage="+percentage);
	String pformat=String.format("%.2f",percentage);
	System.out.println("pformat="+ pformat);
	if(percentage>80)
	{
	sec='A';
	scholarship=10000;
	donation=0;
	grade="distinction";
	}
	else
	{
	sec='B';
	scholarship=0;
	donation=15000;
	grade="fail";
	}
	fee=fee+donation-scholarship;
	System.out.println(grade+ "total fee to be paid is"+ fee + " " + sec);
	}
}