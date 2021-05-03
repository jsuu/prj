package pk1;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		String[] strs = new String[3];	//생성됨=>  strs[0] strs[1] strs[2]  strs[3]	
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

//0. 스캐너 객체생성
//1. 배열 객체 만들고
//2. for()  숫자를 입력받아 배열변수에 저장 
//3. for()  배열을 하나씩 syso'