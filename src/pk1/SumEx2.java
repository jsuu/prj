package pk1;

import java.util.Scanner;

public class SumEx2 {

	public static void main(String[] args) {
		// 5번을 입력받아  이값의  평균값
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요!");
		int sum = 0;
		
		for (int i = 1; i<=5; i++) {
			int get = sc.nextInt();
			sum +=get;			
		}
			long result = sum / 5.0;
			System.out.println("평균값은 "+result);			
	}

}
