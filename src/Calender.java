import java.util.Scanner;


public class Calender {
	public static void main(String[] args) {
		
//		System.out.println("일   월    화    수     목     금    토");
//		System.out.println("------------------------------------");
//		System.out.println("1    2    3     4     5     6     7");
//		System.out.println("8    9    10    11    12    13    14");
//		System.out.println("15   16   17    18    19    20    21");
//		System.out.println("22   23   24    25    26    27    28 ");
	
	
	//숫자를 입력 받아 해당하는 달의 최대 일수를 출력하는 프로그램
		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String s1;
		s1 = scanner.next();
		int a = Integer.parseInt(s1);
		if(a == 1) {
		System.out.printf("%d월은 31일까지 있습니다.", a);
		}
		
		if(a == 2) {
			System.out.printf("%d월은 28일까지 있습니다.", a);
			}
		
		if(a == 3) {
			System.out.printf("%d월은 31일까지 있습니다.", a);
			}
		
		if(a == 4) {
			System.out.printf("%d월은 30일까지 있습니다.", a);
			}
		
		if(a == 5) {
			System.out.printf("%d월은 31일까지 있습니다.", a);
			}
		
		if(a == 6) {
			System.out.printf("%d월은 30일까지 있습니다.", a);
			}
		
		if(a == 7) {
			System.out.printf("%d월은 31일까지 있습니다.", a);
			}
		
		if(a == 8) {
			System.out.printf("%d월은 31일까지 있습니다.", a);
			}
		
		if(a == 9) {
			System.out.printf("%d월은 30일까지 있습니다.", a);
			}
		
		if(a == 10) {
			System.out.printf("%d월은 31일까지 있습니다.", a);
			}
		
		if(a == 11) {
			System.out.printf("%d월은 30일까지 있습니다.", a);
			}
		
		if(a == 12) {
			System.out.printf("%d월은 31일까지 있습니다.", a);
			}
		
		
	}
}
