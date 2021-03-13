package array;

public class DeepCopy {
	
	public static void main(String[] asdf)
	{
	
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
	
		bookArray1[0] = new Book ("달팽이의인생","달팽이");
		bookArray1[1] = new Book ("팽이가 기어가는 모습", "왕팽");
		bookArray1[2] = new Book ("달달달", "광팽");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
	
		for(int i = 0 ; i < bookArray1.length ; i++ )
		{
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}

		for(int i = 0 ; i < bookArray2.length ; i++ )
		{
			bookArray2[i].showBookInfo();
		}
		
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
	
		
		System.out.println(" === bookArray 1 ===");
		
		for(int i = 0 ; i < bookArray1.length ; i++ )
		{
			bookArray1[i].showBookInfo();
		}
	
	
		System.out.println(" === bookArray 2 ===");
	
		for(int i = 0 ; i < bookArray2.length ; i++)
		{
			bookArray2[i].showBookInfo();
		}

	}
}
