package pk1;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		String[] strs = new String[3];		
		for (int i = 0; i <=2; i++) {
			System.out.print("이름을 입력하세;요");			
			strs[i] = sc.next();
		}
		
		for (int i = 0; i <=2; i++) {
			System.out.println(strs[i]);			
		}
		//System.out.println(strs[3]);	//error
		
	}
}
