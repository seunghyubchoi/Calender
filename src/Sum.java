import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		System.out.println("두 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		System.out.println("두 수의 합은 " + (a + b) + "입니다.");
		
	}
}
