// 중첩 반복 - 반복문이 다른 반복문을 내포하는 구조
// 2중 중첩된 for문을 사용하여 구구단을 출력하는 프로그램 (한 줄에 한 단씩)

public class NestedLoop {
	public static void main (String[] args) {
		int i, j;

		for (i = 1; i < 10; i++,System.out.println()) {
			for (j = 1; j < 10; j++,System.out.print('\t')) {
				System.out.print(i + "*" + j + "=" + i*j);
			}
		}
	}
}