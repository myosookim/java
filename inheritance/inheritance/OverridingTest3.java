package inheritance;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		E_Customer customerLee = new E_Customer(10010,"�̼���");
		System.out.println(customerLee.getCustomerName() + "���� �����ϼž� �� �ݾ��� " + customerLee.calcPrice(price) + "�� �Դϴ�." );
		
		
		E_VIPCustomer customerKim = new E_VIPCustomer(10020,"�輭��",12345);
		System.out.println(customerKim.getCustomerName() + "���� �����ϼž� �� �ݾ��� " + customerKim.calcPrice(price) + "�� �Դϴ�." );
		
		E_Customer vc = new E_VIPCustomer(10030,"���ؼ���",3000);
		System.out.println(vc.getCustomerName() + "���� �����ϼž� �� �ݾ��� " + vc.calcPrice(price) + "�� �Դϴ�." );
		
	
	}

}
