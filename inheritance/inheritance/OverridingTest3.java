package inheritance;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		E_Customer customerLee = new E_Customer(10010,"이서방");
		System.out.println(customerLee.getCustomerName() + "님이 지불하셔야 할 금액은 " + customerLee.calcPrice(price) + "원 입니다." );
		
		
		E_VIPCustomer customerKim = new E_VIPCustomer(10020,"김서방",12345);
		System.out.println(customerKim.getCustomerName() + "님이 지불하셔야 할 금액은 " + customerKim.calcPrice(price) + "원 입니다." );
		
		E_Customer vc = new E_VIPCustomer(10030,"달팽서방",3000);
		System.out.println(vc.getCustomerName() + "님이 지불하셔야 할 금액은 " + vc.calcPrice(price) + "원 입니다." );
		
	
	}

}
