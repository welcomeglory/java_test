import java.util.Scanner;
public class UpDown {
	int i;
	int j = 0;
	public UpDown() {
	}
	public void getResult(int i) {
		while (i == 1) {
			int num2 = (int) (Math.random() * 100) + 1;
			for (j = 10; j > 0; j--) {
				System.out.println("숫자를 입력해주세요 : ");
				Scanner sc = new Scanner(System.in);
				int num1 = sc.nextInt();
				if (num1 < num2)
					System.out.println("Up ===>" + (j - 1) + "번 남아 있습니다.");
				else if (num1 > num2)
					System.out.println("Down ===>" + (j - 1) + "번 남아 있습니다.");
				else 
					System.out.println("일치");
				if ((j - 1) == 0) {
					System.out.println("졌습니다.");
					j = 0; break;
				}
			}
			if (j == 0)
				break;
		}
	}
}


