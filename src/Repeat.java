import java.util.Scanner;

public class Repeat {
	public static void main(String[] args) {
		String PROMPT = "cal> ";
		int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("반복횟수를 입력하세요.");

		Scanner scanner = new Scanner(System.in);
	
		
		while (true) {
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			int month = scanner.nextInt();
			if (month == -1) {
				System.out.println("잘 못 된 입력입니다.");
				break;	
			} else if (month > 12) {
				continue;
			}
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, maxDays[month - 1]);
		}

	}
}
