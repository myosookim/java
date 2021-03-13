package array;

public class CharArray {

	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		
		char ch = 'A';
		
		for(int i = 0; i < alphabets.length ; i++,ch++)
		{
			alphabets[i] = ch;
		}
		
		for( int i=0 ; i < alphabets.length ; i++ )
		{
			System.out.println(alphabets[i] + "," + (int)alphabets[i]);		// 알파벳 문자와 그 아스키코드값 출력
		}

	}

}
