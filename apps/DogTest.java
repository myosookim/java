package array;

public class DogTest {

	public static void main(String[] args) {
		
		Dog[] dog = new Dog[5];

		dog[0]=new Dog();
		dog[1]=new Dog();
		dog[2]=new Dog();
		dog[3]=new Dog();
		dog[4]=new Dog();
		
		dog[0].setName("강일");
		dog[1].setName("강이");
		dog[2].setName("강삼");
		dog[3].setName("강사");
		dog[4].setName("강오");
		
		dog[0].setType("불독");
		dog[1].setType("리트리버");
		dog[2].setType("비숑");
		dog[3].setType("포메라니안");
		dog[4].setType("허스키");
		
		for(int i = 0 ; i < 5 ; i++ )
		{
			System.out.println(dog[i].showDogInfo());
		}
		

	}

}
