package pk1;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("spring/summer/fall/ winter 중 계절을 입력하세요~");
		String season = sc.next();	//변수선언 은 1번만 해야한다. 여기서는 String
		
		switch(season){
			case "spring" : System.out.println("날씨가 따뜻하네요~");
//			break;				//break없으면  위에서 순차적 실행한다
			
			case "summer" : System.out.println("날씨가 덥네요~");
//			break;
			
			case "fall" : System.out.println("날씨가 선선하네요~");
			break;
			
			case "winter" : System.out.println("날씨가 춥네요~");
			break;		
			
			default : System.out.println("잘못된 계절입니다");
			
		}

	}

}

