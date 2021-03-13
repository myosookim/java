package inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		E_Customer customerLee = new E_Customer(10010,"이기자");
		customerLee.bonusPoint = 1000;
		
		E_Customer customerKim = new E_VIPCustomer(10020,"김밥말이",3424);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + "님이 지불해야 할 금액은 " + customerLee.calcPrice(price) + "원입니다.");
		System.out.println(customerKim.getCustomerName() + "님이 지불해야 할 금액은 " + customerKim.calcPrice(price) + "원입니다.");
	}

}
