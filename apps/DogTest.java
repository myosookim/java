package array;

public class DogTest {

	public static void main(String[] args) {
		
		Dog[] dog = new Dog[5];

		dog[0]=new Dog();
		dog[1]=new Dog();
		dog[2]=new Dog();
		dog[3]=new Dog();
		dog[4]=new Dog();
		
		dog[0].setName("����");
		dog[1].setName("����");
		dog[2].setName("����");
		dog[3].setName("����");
		dog[4].setName("����");
		
		dog[0].setType("�ҵ�");
		dog[1].setType("��Ʈ����");
		dog[2].setType("���");
		dog[3].setType("���޶�Ͼ�");
		dog[4].setType("�㽺Ű");
		
		for(int i = 0 ; i < 5 ; i++ )
		{
			System.out.println(dog[i].showDogInfo());
		}
		

	}

}
