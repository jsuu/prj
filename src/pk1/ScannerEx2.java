package pk1;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력하세요~");
//		String st = sc.next();		//next()함수는 String type 공백전까지 인식.
//		int st = sc.nextInt();		//nextInt()함수는 int type 공백전까지 숫자만 인식.
		String st = sc.nextLine();	//nextLine()함수는 String type 공백까지 모든문자 인식.
		
		System.out.println("입력된 글자는 " + st);		

	}
	

}
