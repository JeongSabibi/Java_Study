/* 2차원 배열
ex) int intArray[][] = new int[2][5];
*/
/* 2차원 배열의 length 필드
ex) int i[][] = new int[2][5];
i.length -> 2차원 배열의 행의 개수로서 2
i[n].length는 n번째 행의 열의 개수
*/ 

// 한 회사의 지난 3년간 분기별 매출의 총액과 연평균 매출을 구하는 프로그램

public class SalesRevenue {
	public static void main (String[] args) {
		int intArray[][] = {{90, 90, 110, 110}, 
										{120, 110, 100, 110}, 
										{120, 140, 130, 150}} ;
		double sum = 0;
		
		for (int i = 0; i < intArray.length; i++) // intArray.length=3
			for (int j = 0; j < intArray[i].length; j++) // intArray[i].length=4 
				sum += intArray[i][j];
			
		System.out.println("지난 3년간 매출 총액은 " + sum + "이며 연평균  매출은 "
											 +  sum/intArray.length + "입니다.");
	}
}