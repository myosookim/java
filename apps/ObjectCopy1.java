package array;

public class ObjectCopy1 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book ("¥ﬁ∆ÿ¿Ã¿«¿Œª˝","¥ﬁ∆ÿ¿Ã");
		bookArray1[1] = new Book ("∆ÿ¿Ã∞° ±‚æÓ∞°¥¬ ∏Ω¿", "ø’∆ÿ");
		bookArray1[2] = new Book ("∆ÿ∆ÿ∆ÿ", "±§∆ÿ");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0 ; i < bookArray2.length ; i++ )
		{
			bookArray2[i].showBookInfo();
		}

	}

}
