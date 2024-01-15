public class UpDown {
	int i;
	int num2 = (int) (Math.random() * 99) + 1;
	private int num1;
	public UpDown() {
	}

	public void getResult(int num1) {
		while (true) {
			System.out.println("숫자를 입력해주세요 : ");
			for (int j = 10; j > 0; j--) {
				System.out.println(num1 + " " + num2);
				if (num1 > num2) {
					System.out.println("Up ===>" + j + "번 남아 있습니다.");
				} else if (num1 < num2) {
					System.out.println("Down ===>" + j + "번 남아 있습니다.");
				} else {
					System.out.println("일치");
				}
			}
			break;
		}
	}
}
