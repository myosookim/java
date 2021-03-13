package array;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList <Book>library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥","조정래"));
		library.add(new Book("데미안","헤르만 헤세"));
		library.add(new Book("야간비행","생택쥐 페리"));
		library.add(new Book("토지","박경리"));
		library.add(new Book("개미","베르나르 베르베르"));
		
		for( int i = 0 ; i < library.size() ; i++ )
		{
			Book book = library.get(i);
			book.showBookInfo();
		}
		
		System.out.println();
		
		System.out.println("===향상된 for문 사용===");
		for(Book book : library)
		{
			book.showBookInfo();
		}
	}

}
