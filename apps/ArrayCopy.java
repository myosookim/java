package array;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array1 = { 10, 20, 30, 40, 50};
		int[] array2 = new int[] { 1, 2, 3, 4, 5};	// new int[] 는 초기화할때는 생략 가능 (하지만 가시성때문에 생략 안하는경우많음)
		
		System.arraycopy(array1, 0, array2, 1, 4);	// System.arraycopy(복사할 배열, 복사할 첫 위치, 대상 배열, 붙여넣을 첫 위치 , 복사할 요소 개수)
		for(int i = 0; i < array2.length ; i++)
		{
			System.out.println(array2[i]);
		}
	}

}
