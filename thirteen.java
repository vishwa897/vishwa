class Main
{
public static void main(String args[])
	{
	int n=7,i=1,x;
	while(i<=20)
	{
	x=n*i;
	{
	System.out.println(n+"x"+i+"="+x);
	i++;
	if(x%13==0)
	{
	System.out.println("divisible by 13");
	x++;
	}
	}
	}
	}
}