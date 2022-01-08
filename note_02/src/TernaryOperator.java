// 조건 연산자 사용
// opr1?opr2:opr3
// opr1이 true이면, 연산식의 결과는 opr2, false이면 opr3

public class TernaryOperator {
	public static void main (String[] args) {
		int a = 3, b = 5;

		System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a)));
	}
}