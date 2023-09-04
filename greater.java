class Main
{
	public static void main(String args[])
	{
		//int x=10,y=2;
		//if(x>y);
		//System.out.println("greater");
		//int x=10,y=2;
		//if(x%y==0)
		//System.out.println("x is divisible y");
		int x=10,y=2,z;
		System.out.println(x+" "+y);
		if(x%y==0)
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+" "+y);
	}
}