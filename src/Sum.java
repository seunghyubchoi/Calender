import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		System.out.println("두 수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int c = a + b; 
		System.out.printf("두 수의 합은 " + c + " 입니다.");
		
		scanner.close();

				
	}
}
