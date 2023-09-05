class Main
{
	public static void main(String[] args) 
	{
	    int num=11,start=num,end=1,temp=0;
	    while(start>=end)
	    {
	        if(num%start==0)
	        {
	            temp++;
	        }
	        start--;
	    }
	    if(temp==2)
		System.out.println("prime");
		else
		System.out.println("not a prime");
	}
}
