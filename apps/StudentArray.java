package array;

public class StudentArray {

	public static void main(String[] args) {

		Student[] studentArray = new Student[3];
		int size = 0;
		
		studentArray[0] = new Student(1001, "James");	size++;
		studentArray[1] = new Student(1002, "Thomas");	size++;
		studentArray[2] = new Student(1003, " Edward");	size++;
		
		for(int i = 0; i < size ; i++ )
		{
			studentArray[i].showStudentInfo();
		}
		
		for(int i = 0; i < size ; i++ )
		{
			System.out.println(studentArray[i]);
		}
		
	}

}
