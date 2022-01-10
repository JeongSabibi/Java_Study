/*
try-catch-finally문 (예외 처리문/finally 블록은 생략 가능)
try {
	예외가 발생할 가능성이 있는 실행문
	}
catch (처리할 예외 타입 선언) {
	예외 처리문
	}
finally {
	예외 발생 여부와 상관없이 무조건 실행되는 문장
	}
 */

// ArithmeticException 예외 처리
// try-catch문을 이용하여 정수를 0으로 나누려고 할 때 
// "0으로 나눌 수 없습니다."라는 경고 메시지를 출력하는 프로그램

import java.util.Scanner;
public class ExceptionExample2 {
	public static void main (String[] args) {
		Scanner rd = new Scanner(System.in);
		int divisor = 0;
		int dividend = 0;
		
		System.out.print("나뉨수를 입력하시오:");
		dividend = rd.nextInt();
		System.out.print("나눗수를 입력하시오:");
		divisor = rd.nextInt();
		try {
			System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+ dividend/divisor+"입니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}