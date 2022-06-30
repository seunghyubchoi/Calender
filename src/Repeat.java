import java.util.Scanner;

public class Repeat {
	public static void main(String[] args) {
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		
		System.out.println("반복횟수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int repeat;
		repeat = scanner.nextInt();
		
		
		
		
		for(int i = 1; i <= repeat; i++) {
			System.out.println("월을 입력하세요.");
			int month = scanner.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, maxDays[month-1]);
		}
	}
}
