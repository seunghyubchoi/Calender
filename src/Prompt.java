import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {

		Calendar cal = new Calendar();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);

			int month = sc.nextInt();
			if (month == -1) {
				System.out.println("Have a nice day!");
				break;
			}
			if (month > 12) {
				continue;
			}
		cal.printCalendar(2022, month);
		}
		sc.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
