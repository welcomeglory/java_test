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
				System.out.println("���ڸ� �Է����ּ��� : ");
				Scanner sc = new Scanner(System.in);
				int num1 = sc.nextInt();
				if (num1 < num2)
					System.out.println("Up ===>" + (j - 1) + "�� ���� �ֽ��ϴ�.");
				else if (num1 > num2)
					System.out.println("Down ===>" + (j - 1) + "�� ���� �ֽ��ϴ�.");
				else 
					System.out.println("��ġ");
				if ((j - 1) == 0) {
					System.out.println("�����ϴ�.");
					j = 0; break;
				}
			}
			if (j == 0)
				break;
		}
	}
}


