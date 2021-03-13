package inheritance;

public class E_VIPCustomer extends E_Customer {

	private int agentID;
	double saleRatio;
	
	public E_VIPCustomer(int customerID, String customerName, int agentID)
	{	super(customerID,customerName);
		customerGrade = "VIP"; // ���� Ŭ�������� private ������ ���� ������ �߻�.
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ��");
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
