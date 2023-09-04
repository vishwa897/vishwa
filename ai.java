class Main
 {
    public static void main(String[] args)
	 {
        String health = "excellent";
        int age = 30;
        boolean city = true;
        String gender = "male";
        int policyAmount = 150000;
        if (health == "excellent" && age >= 25 && age <= 35 && city && gender == "male") {
        if (policyAmount <= 200000) 
	{
         double premium = (policyAmount / 1000.0) * 4;
        System.out.println("Premium amount: Rs. " + premium);
         }
	 else
	 {
          System.out.println("Policy amount cannot exceed Rs. 2 lakhs.");
         }
        } 
	else if (health != "excellent") 
	{
         System.out.println("Health condition is not excellent.");
        } 
	else if (!(age >= 25 && age <= 35)) 
	{
         System.out.println("Age should be between 25 and 35.");
        }
	 else if (!city) 
	{
         System.out.println("Person does not live in a city.");
        } 
	else if (gender != "male") {
     	System.out.println("Person is not male.");
        }
    }
}