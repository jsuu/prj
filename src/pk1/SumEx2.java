package pk1;

import java.util.Scanner;

public class SumEx2 {

	public static void main(String[] args) {
		// 5���� �Է¹޾�  �̰���  ��հ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���!");
		int sum = 0;
		
		for (int i = 1; i<=5; i++) {
			int get = sc.nextInt();
			sum +=get;			
		}
			long result = sum / 5.0;
			System.out.println("��հ��� "+result);			
	}

}
