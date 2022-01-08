/*
학점이 A, B인 학생에게는 "참 잘하였습니다.", 
학점이 C, D인 학생에게는 "좀 더 노력하세요.", 
학점이 F인 학생에게는 "다음 학기에 다시 수강하세요."를 
출력하는 프로그램을 switch문의 break를 활용하여 작성하기
 */

public class GradeSwitch {
	public static void main(String[] args) {
		char grade='C';
		switch (grade) {
			case 'A': 
			case 'B':
				System.out.println("참 잘하였습니다.");
				break;
			case 'C': 
			case 'D':
				System.out.println("좀 더 노력하세요.");
				break;
			case 'F':
				System.out.println("다음 학기에 다시 수강하세요.");
				break;
			default:
				System.out.println("잘못된 학점입니다.");
		}
	}
}