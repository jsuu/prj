package pk1;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		//scanner이용하여 5개의 정수를 입력받아 배열면수에 저장하고
		//저장된 배열변수를 화면 출력하고 합계를 출력한다
		
		Scanner sc = new Scanner(System.in);
		int[] ints = new int[5];  //생성됨=>  ints[0] ints[1] ints[2]  ints[3]  ints[4] 
		System.out.println(ints);	//ints 주소값
		
		for (int i = 0; i < ints.length; i++) {
			System.out.print("정수를 입력하세;요");	
			int input = sc.nextInt();
			
			ints[i] = input; 
		}
		
		int sum = 0;
		for (int i = 0; i < ints.length; i++) {
			System.out.println("ints["+i+"]"+"="+ints[i]);			
			sum +=ints[i];
		}		
		System.out.println("sum= "+sum);			
	}
}