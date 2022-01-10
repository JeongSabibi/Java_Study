// break문 - '하나의 반복문'을 완전히 빠져나갈 때 사용
// 중첩 반복의 경우 안쪽 반복문의 break문이 실행되면 안쪽 반복문만 벗어남
// -1이 입력될 때까지 입력된 숫자의 개수 출력

import java.util.Scanner;
public class BreakExample {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		
		while (true) {
			if (in.nextInt() == -1)
				break;
			num++;
		}
		System.out.println("입력된 숫자 개수는 " + num);
	}
}