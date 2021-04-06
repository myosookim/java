package tempo;

public class testMI {

	public static void main(String[] args) {
		MC myClass = new MC();
		
		X xClass = myClass;
		xClass.x();
		
		Y yClass = myClass;
		yClass.y();
		
		MI iClass = myClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
		

	}

}
