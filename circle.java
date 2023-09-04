class Main
{
    public static void main(String[] args) 
	{
        	double radius = 5.0; // The radius of the circle
        
     	        //Calculate the area of the circle: A = π * r^2
         	double area = Math.PI * Math.pow(radius, 2);
     		System.out.println("Area of the circle: " + area);
        	// Calculate the circumference of the circle: C = 2 * π * r
      	        double circumference = 2 * Math.PI * radius;
                System.out.println("Circumference of the circle: " + circumference);
    }
}
