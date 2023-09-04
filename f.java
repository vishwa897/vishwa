class Main
 {
    public static void main(String args[])
	 {
       		double a = 80;
        	double b = Math.sqrt(a); 
      		String SquareRoot = String.format("%.3f", b);
        	System.out.println(SquareRoot); 
		if (a % b == 0) 	
		{	
            	System.out.println("is a perfect square");
       		 } 	
		else 
		{
            System.out.println("is not a perfect square");
        }
    }
}
