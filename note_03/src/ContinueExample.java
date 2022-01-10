// continue문 - 반복문을 빠져 나가지 않으면서
// 반복문 실행 도중 다음 반복을 진행
// 1부터 100까지 짝수의 합을 구하는 프로그램

public class ContinueExample {
	public static void main (String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%2 == 1)
				continue;
			else
				sum += i;
		}
		System.out.println("1부터 100까지 짝수의 합은 " + sum);
	}
}