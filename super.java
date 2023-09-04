class Main
{
	public static void main(String args[])
	{
	int year=1947,v=0,n=0;
	while(year<=2024)
	{
	if(year%4==0&&year%100!=0||year%400==0)
	{
	System.out.println(year+"leap year");
	}
	year++;
	}
	}
}