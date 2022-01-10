// 배열과 for-each 문
// 배열의 각 원소를 순차적으로 접근하는데 유용한 for문

public class foreachEx {
		
	public static void main(String[] args) {
		int[] num = { 1,2,3,4,5 };
		String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" } ;
		int sum = 0;
		
		// 아래 for-each에서 k는 num[0], num[1], ..., num[4]로 반복됨
		for (int k : num)
			sum += k;
		System.out.println("합은 " + sum);
		
		// 아래 for-each에서 s는 names[0], names[1], ..., names[5]로 반복됨
		for (String s : names) 
			System.out.print(s + " ");
		System.out.println();

	}
}