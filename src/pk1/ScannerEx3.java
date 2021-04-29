package pk1;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요!");
		
		int age = sc.nextInt();
		
		if (age > 60) {
			System.out.println("화이자 백신접종 연령입니다!");
			
//		}else if(age>50 & age<60){
		}else if(age>50){		// 위에서 60이상은 이미 있으므로 ,  age>50 조건만 해도됨.
			System.out.println("az백신접종 연령니다!");	
			
		}else if(age >40){
			System.out.println("모더나 백신접종 연령니다");
		}
		
	}

}
