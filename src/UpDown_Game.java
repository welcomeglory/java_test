import java.util.Scanner;
public class UpDown_Game {
	public static void main(String[] args) {
		System.out.println("���ӽ��� 1");
		System.out.println("�������� 2");
		System.out.println(">>");
		Scanner sc1 = new Scanner(System.in);
		int i = sc1.nextInt();
		int j = 0;
		UpDown ud = new UpDown();
		ud.getResult(i);	
	}
}
