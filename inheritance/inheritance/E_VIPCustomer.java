package inheritance;

public class E_VIPCustomer extends E_Customer {

	private int agentID;
	double saleRatio;
	
	public E_VIPCustomer(int customerID, String customerName, int agentID)
	{	super(customerID,customerName);
		customerGrade = "VIP"; // 상위 클래스에서 private 변수를 쓰면 오류가 발생.
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public int calcPrice(int price)
	{
		bonusPoint += price*bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
	
	public int getAgentID()
	{
		return agentID;
	}

}
