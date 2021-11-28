package week1.day1;

public class Mobile {
	String mobileModel = "Samsung galaxy M31S";
	int mobileWeightInGrams = 198;
	boolean isFullCharge = true;
	double mobileCost = 20999.99;
	public void makeCall() {
System.out.println("calling");
	}
	public void sendMsg() {
		System.out.println("Message delivered");
	}
	public static void main(String[] args) {
		Mobile myMobile =new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();
		System.out.println(myMobile.mobileModel);
		System.out.println(myMobile.mobileWeightInGrams);
		System.out.println(myMobile.isFullCharge);
		System.out.println(myMobile.mobileCost);
	}

}
