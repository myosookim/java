package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		E_Customer vc = new E_VIPCustomer(10030,"������",2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName()+"���� �����ؾ� �ϴ� �ݾ��� "+vc.calcPrice(10000) + "�� �Դϴ�.");
		
		// vc.calcPrice(); ���� calcPrice() ������ �� �� ��� Customer Ŭ������ calcPrice() �� ȣ��������, calcPrice() ������ �� ��� VIPCustomer Ŭ�������� �������� calcPrice �� ȣ���Ѵ�.
	}

}
