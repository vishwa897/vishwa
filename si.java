class Main
{
	public static void main(String args[])
	{

	int p=700,t=5,r=30;
 	int si=p*t*r/100;
	System.out.println("simple_interest="+ si);
	double a=(1+r/100.0);
	System.out.println("a="+ a);
	double c=Math.pow(a,t);
	System.out.println(c);
        a=c*p;
	System.out.println("a="+ a);
   	double ci=a-p;
	System.out.println("compund _interest="+ ci);
	}
}
	