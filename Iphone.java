class Iphone
{
	public static void main(String[] args)
	{
	String productname="iphone14";
	System.out.println("productname="+productname);
	double prize=79900;
        double offer=14.0/100;
        double discount=(14.0/100)*79900;
        System.out.println(discount);
        double actprize=prize-discount;
        System.out.println("actualprize="+actprize);
	double pack=99.0;	
	double finalprize=actprize+pack;
	System.out.println("finalprize="+ finalprize);
        double bankoffer=(5.0/100)*finalprize;
        System.out.println("bankoffer="+ bankoffer);
        double totalprize=finalprize-bankoffer;
        System.out.println("totalprize=" +totalprize);
	double exchangeprize=7000;
	double lastprize=totalprize-exchangeprize;
	System.out.println("lastprize="+ lastprize);
	}
}
	
	
	
	