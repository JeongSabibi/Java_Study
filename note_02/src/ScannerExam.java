/* 
Scanner 이용한 키 입력
입력되는 키 값을 공백으로 구분되는 아이템 단위로 읽음
공백문자 : '\t', '\f','\r',' ','\n'
*/

// 나이, 체중, 신장 데이터를 키보드에서 입력 받아 다시 출력하는 프로그램

import java.util.Scanner;

public class ScannerExam {
	public static void main (String args[]) { 
		Scanner a = new Scanner(System.in);
		System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요");
		System.out.println("당신의 나이는 " + a.nextInt() + "살입니다.");
		System.out.println("당신의 체중은 " + a.nextDouble() +"kg입니다.");
		System.out.println("당신의 신장은 " + a.nextDouble()+ "cm입니다.");
	}
}