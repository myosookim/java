package inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		E_Customer customerLee = new E_Customer(10010,"�̱���");
		customerLee.bonusPoint = 1000;
		
		E_Customer customerKim = new E_VIPCustomer(10020,"��主��",3424);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + "���� �����ؾ� �� �ݾ��� " + customerLee.calcPrice(price) + "���Դϴ�.");
		System.out.println(customerKim.getCustomerName() + "���� �����ؾ� �� �ݾ��� " + customerKim.calcPrice(price) + "���Դϴ�.");
	}

}
