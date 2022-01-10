// while문 이용
// 키보드에서 숫자를 입력받아 입력받은 모든 수의 평균을 출력하는 프로그램
// 0이 입력되면 입력이 종료되고 평균을 구하여 출력한다

import java.util.Scanner;
public class WhileSample {
	public static void main (String[] args) {
		Scanner rd = new Scanner(System.in);
		int n = 0;
		double sum = 0;
		int i=0;
		while ((i = rd.nextInt()) != 0) { 
			sum += i;
			n++;
		}
		System.out.println("입력된 수의 개수는 " + n + "개이며 평균은 " + sum / n + "입니다.");
	}
}