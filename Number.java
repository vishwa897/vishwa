class Number
{
	public static void main(String args[])
	{
	int num=50001;
	if((num>=0)&&(num<9))
	System.out.println("single digit");
	else if((num>=10)&&(num<99))
	System.out.println("two digit");
	else if((num>=100)&&(num<999))
	System.out.println("three digit");
	else if((num>=1000)&&(num<9999))
	System.out.println("four digit");
	else
	System.out.println("not execute");
	}
}