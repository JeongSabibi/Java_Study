/* main 메소드의 인자 전달
Run - Run Configurations 항목에서 main() 메소드의 인자 나열
*/

// 여러 개의 실수를 main() 메소드 인자로 전달받아 평균값을 구하는 프로그램

public class MainParameter {
	public static void main (String[] args) {
		double sum = 0.0;
		
		for (int i=0; i<args.length; i++)
			sum += Double.parseDouble(args[i]);
		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + sum/args.length);
	}
}