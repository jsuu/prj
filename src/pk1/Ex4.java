package pk1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		//Scanner로 연산자를 입력받는다  (+,  -,  *,  / )
		//Scanner로 데이터 2개를 입력받는다 (정수형)
 		//연산자에 따라서 결과가 나오도록
		
		Scanner sc = new Scanner(System.in);
		Scanner si = new Scanner(System.in);
		System.out.println("+,  -,  *,  /  중에 연산자 1개를 입력하세요~");
		
		String ch="";
		ch =sc.next();
//		while(ch !="+" |ch !="-"|ch !="*"|ch !="/" ){	
//			System.out.println("+,  -,  *,  /  중에 연산자 1개를 입력하세요~");				
//			ch =sc.next();
//		}	
		int[] ints = new int[2];
		int res = 0;
		String result="";
		for (int i = 0; i <=1 ; i++) {
			System.out.println("숫자를입력~");
			ints[i] =  si.nextInt();
		}
		
		switch (ch) {
		case "+":
			result = ints[0]+"+"+ints[1] + "=";
			res = ints[0]+ints[1];
			break;
		case "-":
			result = ints[0]+"-"+ints[1] + "=";
			res = ints[0]-ints[1];
			break;
		case "*":
			result = ints[0]+"*"+ints[1] + "=";
			res = ints[0]*ints[1];
			break;
		case "/":
			result = ints[0]+"/"+ints[1] + "=";
			res = ints[0]/ints[1];
			break;

		default:
			System.out.println("숫자를 입력하세요");
			break;
		}
		
		System.out.println(result + res);
		
		
	}
}
