package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		E_Customer vc = new E_VIPCustomer(10030,"달팽이",2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName()+"님이 지불해야 하는 금액은 "+vc.calcPrice(10000) + "원 입니다.");
		
		// vc.calcPrice(); 에서 calcPrice() 재정의 안 된 경우 Customer 클래스의 calcPrice() 를 호출하지만, calcPrice() 재정의 된 경우 VIPCustomer 클래스에서 재정의한 calcPrice 를 호출한다.
	}

}
