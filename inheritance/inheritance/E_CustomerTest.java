package inheritance;

public class E_CustomerTest {
	public static void main(String[] asdfasdfsda)
	{
		E_Customer customerLee = new E_Customer(10010,"�̼���");
		//customerLee.setCustomerID(10010);
		//customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		E_Customer customerKim = new E_VIPCustomer(10020,"������",34324);	// <- (���� Ŭ������)e = new (����Ŭ������) ���� �����ϱ� ������. ����->���� �� ��ȯ�� ���������� �̷������ ����.
		//customerKim.setCustomerID(10020);
		//customerKim.setCustomerName("������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());	
		
	}
}
