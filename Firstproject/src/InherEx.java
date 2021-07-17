class Bank{
	double rateOfIntrest = 7.8;
}
class HDFC extends Bank{
	void intreastamout(double amount) {
		double intreastamount = (amount * rateOfIntrest)/100;
		System.out.println(intreastamount);
	}
}
public class InherEx {
public static void main(String[] args) {
	HDFC hdfc = new HDFC();
	hdfc.intreastamout(100000);
}
}
