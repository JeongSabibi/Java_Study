// 배열 원소의 평균 구하기
// 배열의 length 필드를 이용하여 배열 크기만큼 
// 키보드에서 정수를 입력받고 평균을 구하는 프로그램

import java.util.Scanner;
public class ArrayLength {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		double sum = 0;
		
		for (int i = 0; i < intArray.length; i++)
			intArray[i] = in.nextInt();

		for (int i = 0; i < intArray.length; i++)
			sum += intArray[i];
		System.out.print("배열 원소의 평균은 " + sum/intArray.length + "입니다.");
	}
}