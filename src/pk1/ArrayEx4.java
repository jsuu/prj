package pk1;

import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		// 이름을 3번 연속해서 받아  출력
		
		Scanner sc = new Scanner(System.in);
		String[] names = new String[3];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("이름을 입력하세요 "+i);
			names[i] = sc.nextLine();
		}
		System.out.println("이름을 출력합니다~");
			for (int i = 0; i < names.length; i++) {
				System.out.println("names"+"["+i+"]=  "+ names[i]);
			}
			
			
			
	}//main

}
