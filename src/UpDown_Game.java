import java.util.Scanner;

public class UpDown_Game {
	public static void main(String[] args) {
		System.out.println("게임시작 1");
		System.out.println("게임종료 2");
		System.out.println(">>");
		Scanner sc1 = new Scanner(System.in);
		int i = sc1.nextInt();
		int j = 0;
		while (i == 1) {
			int num2 = (int) (Math.random() * 99) + 1;
			for (j = 9; j > 0; j--) {
				System.out.println("숫자를 입력해주세요 : ");
				Scanner sc = new Scanner(System.in);
				int num1 = sc.nextInt();
				System.out.println(num2);
				if (num1 < num2) {
					System.out.println("Up ===>" + j + "번 남아 있습니다.");
				} else if (num1 > num2) {
					System.out.println("Down ===>" + j + "번 남아 있습니다.");
				} else {
					System.out.println("일치");
					System.out.println("2");
					j = 0;
					break;
				}
			}
			if (j == 0)
				break;
		}
	}
}
