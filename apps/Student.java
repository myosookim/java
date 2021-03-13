package array;

public class Student {
	
	private String studentName;
	private int studentID;
	
	public Student() {}
	
	public Student(int studentID, String studentName)
	{
		this.studentName = studentName;
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public void showStudentInfo()
	{
		System.out.println(studentID + "," +studentName);
	}
	
	
}
