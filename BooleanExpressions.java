
public class BooleanExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2
		Boolean isHotOutside= true;
		Boolean isWeekday= true;
		Boolean hasMoneyInPocket=true;
		//3
		double costOfMilk=1.99;
		double moneyInWallet=20.60;
		int thirstLevel=6 ;
		//4
		Boolean shouldBuyIcecream=isHotOutside && hasMoneyInPocket;
		//– this should be true if it is hot outside and there is money in your pocket
		Boolean willGoSwimming=isHotOutside && !isWeekday;
		//– this should be true if it is hot outside and it is not a weekday
		Boolean isAGoodDay=isHotOutside && hasMoneyInPocket && !isWeekday;
		//– this should be true if it is hot outside, there is money in your pocket, and it is not a weekday
		Boolean willBuyMilk=isHotOutside && thirstLevel>=3 && moneyInWallet>=costOfMilk*2;
		//– this should be true if it is hot outside, and thirstLevel is greater than or equal to 3, and moneyInWallet is greater than or equal to 2 times the cost of milk.
		
		System.out.println(shouldBuyIcecream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);			
	}

}
