/* 메소드에서 배열 리턴
메소드가 리턴하는 배열의 타입은 리턴 받는 배열 타입과 일치
리턴 타입에 배열의 크기 지정 X
*/

// 배열을 생성하고 각 원소 값을 출력하는 프로그램

public class ReturnArray {
	static int[] makeArray() { // 리턴타입 int / 메소드이름()
		int temp[] = new int[4];
		for (int i=0;i<temp.length;i++)
			temp[i] = i;
		return temp; // 배열 리턴
	}
	public static void main (String[] args) {	
		int intArray [];
		intArray = makeArray();
		for (int i = 0; i < intArray.length; i++)
			System.out.println(intArray[i]);
	}
}