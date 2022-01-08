// InputStreamReader - 클래스 키보드로부터 문자 읽기

import java.io.*;

public class InputExample {
	public static void main (String args[]) { 
		InputStreamReader rd = new InputStreamReader(System.in);
		try {
			while (true) {
				int a = rd.read(); // a는 키보드로부터 읽은 문자
				if (a == -1)	// ctrl-z가 입력되면 read()는 -1을 리턴
					break;
				System.out.println((char)a);	// 입력된 문자 출력
			}  
		} 
		catch (IOException e) {
			System.out.println("입력 에러 발생");
		}
	}
}