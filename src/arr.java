import java.util.Scanner;

public class arr {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		//dkjhfkjsdf
		//dbfkdbnf
		//엏루리후ㅏㄴ앟ㅇㄴ라;ㅣㄴ앙ㄹ,ㅡㄴㅇ라ㅡ
		System.out.println("welcome");
	
		int j= sc.nextInt();
		
		int[] arr = new int[j];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}

	private static String next() {
		// TODO Auto-generated method stub
		return null;
	}
}
