class Main
{
	public static void main(String args[])
	{
	char temp='a';
	int temp1=(int)temp,t=0;
	if(temp1>65)
	{
	if(temp1<=90)
	{
	t=temp1+32;
	}
	else if(temp1>=97)
	{
	if(temp1<=122)
	{
	t=temp-32;
	}
	}
	}
	t=(char)t;
	System.out.println(t);
	}
	}
	
	