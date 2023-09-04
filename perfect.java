class Main
{
	public static void main(String args[])
	{
	int start=1,num=6,sum=0;
	while(start<num)//1<6  2<6
	{
	if(num%start==0)//6%1==0 6%2==0
	{
	sum=sum+start;
	}
	start++;
	}
	if(sum==num)
	System.out.println("perfect number");
	else
	System.out.println("not a perfect number");
	}
}