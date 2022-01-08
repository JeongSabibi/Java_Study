// if-else 이용하여 키보드에 입력된 성적에 대해
// 학점을 부여하는 프로그램

import java.util.Scanner;

public class Grading {
	public static void main (String[] args) {
		char grade;
		Scanner a = new Scanner(System.in);
		while (a.hasNext()) {
			int score = a.nextInt();
			if(score >= 90) // score가 90 이상인 경우
				grade = 'A';
			else if(score >= 80) // score가 80 이상이면서 90 미만인 경우
				grade = 'B';
			else if(score >= 70) // score가 70 이상이면서 80 이만인 경우
				grade = 'C';
			else if(score >= 60) // score가 60 이상이면서 70 이만인 경우
				grade = 'D';
			else // score가 60 이만인 경우
				grade = 'F';
			System.out.println("학점은 "+grade+"입니다");
		}
	}
}