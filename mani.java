class Main
{
	public static void main(String args[])
	{
	int n1=11,end=1,n2=n1,temp=0;
	while(n2>=end)
	{
	if(n1%n2==0)
	{
	temp++;
	}
	n2--;
	}
	if(temp==2)
	System.out.println("prime");
	else
	System.out.println("not a prime");
	}
}