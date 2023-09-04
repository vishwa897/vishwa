class Main
{
	public static void main(String args[])
	{
	int number=7,multiple=1,v=20;
	System.out.println("multiplication of 7 from 1to 20:");
	while(multiple<=20)
	{
	System.out.println(number+"x"+multiple+"="+(number*multiple));
	multiple++;
	}
	System.out.println("multiplication of 7 from 20 to 1:");
	while(v>=1)
	{
	System.out.println(number+"x"+v+"="+(number*v));
	v--;
	}
	}
}


