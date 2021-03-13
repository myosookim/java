package array;

public class ShallowCopy {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book ("달팽이의인생","달팽이");
		bookArray1[1] = new Book ("팽이가 기어가는 모습", "왕팽");
		bookArray1[2] = new Book ("팽팽팽", "광팽");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0 ; i < bookArray2.length ; i++ )
		{
			bookArray2[i].showBookInfo();
		}
		
		System.out.println(" ===== bookArray 1 =====");
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		for(int i = 0 ; i < bookArray1.length ; i++ )
		{
			bookArray1[i].showBookInfo();
		}
		
		
		System.out.println(" ===== bookArray 2 =====");
		
		for(int i = 0 ; i < bookArray2.length ; i++)
		{
			bookArray2[i].showBookInfo();
		}

		
		// 얕은 복사. 한마디로 주소값만 복사되기 때문에 같은 주소값을 공유해 array1에 들어있는 이미 복사되었던 요소 값이 변경되면 복사된 후에 변경하였음에도 불구하고 array2 에서도 값이 변경되는 모습을 볼 수 있다
		
		
	}

}
