package pk1;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		int age = 17;		
		if (age >= 15) {
			   System.out.println("혼자 입장가능~");
		} else {
			System.out.println("동반자와 같이입장");
		}
		
//		String id = "name";
//		String pw = "1234";
//
//		Scanner sc = new Scanner(System.in); 
//		
//		System.out.println("아이디를 입력하세요");
//		String id = sc.next();		
//		System.out.println("패스워들드를 입력하세요");
//		String pw = sc.next();
//		
////		if (id ==  "name" & pw == "1234") {	// == 은 기본데이터에서만 된다. String은 참조데이터므로
//		if (id.equals("name") & pw.equals("1234")) {	// String은 equals
//			System.out.println("로그인");
//		} else {
//			System.out.println("id와 pw가 맞지않습니다");				
//		}
//		
//		String grade = "vvip";
//		int point = 100;
//		switch (grade) {
//		case "vvip": point +=100;
//			break;
//		case "vip":	 point +=50;
//			break;
//		case "guest":point +=10;
//			break;
//		default:
//			System.out.println("등급을 확인하세요");;
//		}
//			System.out.println("포인트: "+point);
//			
//			for (int i = 1; i <=10; i++) {
//				System.out.println("hello "+i);
//			}		
//			
//			// 1~10 덧셈
//			int sum = 0;	//지역변수
//			for (int i = 1; i <=10; i++) {
//				sum +=i;
//			}	System.out.println("1~10 덧셈합: "+sum);
//			
//			int count = 0;	
//			while (count <10) {
//				System.out.println("hello !! ");
//				count++;
//			}		
			
			int count = 0;	
			while(true){	//무한루프
				count++;
				if (count >=5) {
					break;
				}
				System.out.println(count);				
			}

	}//main

}//class
