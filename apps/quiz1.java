package array;

public class quiz1 {

	public static void main(String[] args) {
		int[] array = new int[5];
		int a = 0;
		int total = 0;
		
		for(int i=1 ; i<=10 ; i++ )
		{
			if(i%2==0)
			{
				array[a] = i;
				total = total + array[a];
			}
			else
			{
				continue;
			}
		}
		
		System.out.println(total);
	}

}
