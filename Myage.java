 class Myage
{
	public static void main(String[] args)
	{
	int dob=2000;
	int currentyear=2023;
	int age=currentyear-dob;
	System.out.println("age="+ age);
	int year=365;
	int days=year*age;
	System.out.println("days="+ days);
	int perdayhours=24;
	int hours=days*perdayhours;
	System.out.println("hours="+ hours);
	int minutes=60;
	int seconds=60*60;
	int totalminutes=hours*minutes;
	System.out.println("totalminutes="+ totalminutes);
	int sec=totalminutes*seconds;
	System.out.println("sec=" + sec);
	}
}
	
