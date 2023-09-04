 class Googlepay
{
	public static void main(String[] args)
	{
	String appname="GOOGLEPAY";
	System.out.println("appname="+ appname);
	long login=6304143569L;
	long addbankaccount=45614224L;
	System.out.println("bank_account_number="+ addbankaccount);
	System.out.println("set_your_upi_pin");
	double bankbalance=45500;
	System.out.println("bankbalance="+ bankbalance);
	double transaction_p1=1500;
	System.out.println("first transaction="+transaction_p1);
        bankbalance=bankbalance-transaction_p1;
	System.out.println("after_transaction1_bankbalance="+ bankbalance);
	int scratch_card=150;
	System.out.println("scratch_card_on_first_transaction="+ scratch_card);
	bankbalance=bankbalance+scratch_card;
	System.out.println("after_adding_scrathcard_to_bankbalance="+ bankbalance);
	double referal_friend=100;
	System.out.println("for_every_referal="+ referal_friend);
	bankbalance=bankbalance+referal_friend;
	System.out.println("after_referal_friend="+ bankbalance);
	double mobile_recharge=249;
	System.out.println("mobile_recharge="+ mobile_recharge);
	double gst_for_recharge=1;
	bankbalance=bankbalance-mobile_recharge-(1/100);
	System.out.println("after_recharge_bankbalance="+ bankbalance);
	System.out.println("scratch_card_is_obtained_from_recharge_25percentcoupon_for_swiggyorder");
	int transaction_processingamount=10000;
	System.out.println("transaction_processingamount=" +transaction_processingamount);
	bankbalance=bankbalance-transaction_processingamount;
	System.out.println("debit_processing_amount_after_processing_transaction="+bankbalance);
	int failed_transaction=10000;
	bankbalance=bankbalance+failed_transaction;
	System.out.println("transaction_failed_after_24hours_amountrefunded="+ bankbalance);
	double creditamount=100000;
	System.out.println("creditamount="+ creditamount);
	bankbalance=bankbalance+creditamount;
	System.out.println("bankbalance_after_creditamount="+ bankbalance);
	double new_transaction=120000;
	System.out.println("transaction_failed_due_to_dailylimit="+ new_transaction);
	double daily_limit=100000;
	System.out.println("daily_limit="+ daily_limit);
	bankbalance=bankbalance-daily_limit;
	System.out.println("bankbalance="+bankbalance);
	}
}