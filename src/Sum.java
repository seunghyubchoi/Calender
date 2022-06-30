import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		//구구단에서 쓰던 것
		
//		String inputValue = scanner.nextLine();
//		String[] splitedValue = inputValue.split(" ");
//		int first = Integer.parseInt(splitedValue[0]);
//      int second = Integer.parseInt(splitedValue[1]);
	String s1,s2;
	s1 = scanner.next();
	s2 = scanner.next();
	
	int a = Integer.parseInt(s1);
	int b = Integer.parseInt(s2);
        
//       System.out.println("두 수의 합은 " + (a + b) + "입니다.");
	System.out.printf("%d와 %d의 합은 %d 입니다.", a, b, a + b);
	scanner.close();
	}
}
