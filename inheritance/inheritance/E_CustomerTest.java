package inheritance;

public class E_CustomerTest {
	public static void main(String[] asdfasdfsda)
	{
		E_Customer customerLee = new E_Customer(10010,"이순신");
		//customerLee.setCustomerID(10010);
		//customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		E_Customer customerKim = new E_VIPCustomer(10020,"김유신",34324);	// <- (상위 클래스형)e = new (하위클래스형) 으로 선언하기 가능함. 하위->상위 형 변환이 묵시적으로 이루어지기 때문.
		//customerKim.setCustomerID(10020);
		//customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());	
		
	}
}
