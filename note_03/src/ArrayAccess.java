// 배열
// ex) int intArray[] = new int[5];
// 양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 화면에 출력하는 프로그램

import java.util.Scanner;
public class ArrayAccess {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;
		
		for (int i = 0; i < 5; i++) {
			intArray[i] = in.nextInt();
			if (intArray[i] > max)
				max = intArray[i];
		}
		System.out.print("입력된 수에서 가장 큰 수는 " + max + "입니다.");
	}
}