package pk1;

import java.util.Scanner;

public class MenuEx1 {

	public static void main(String[] args) {
		// 화면표시 --> 메뉴) 1. 학생등록 , 2. 학생목록, 3. 학생검색, 4. 프로그램종료
// 		1번 입력받으면 ->	학생이 등록되었습니다
// 		2번 입력받으면 ->   학생목록입니다
// 		....
// 		4번 입력받으면 ....
		
		Scanner sc = new Scanner(System.in);
	while(true){
			System.out.println("메뉴) 1. 학생등록 , 2. 학생목록, 3. 학생검색, 4. 프로그램종료~");
			System.out.println("메뉴를  입력하세요");

			int menuNo = sc.nextInt();
			switch (menuNo) {
			case 1:
				System.out.println("학생이 등록되었습니다~");
				break;
			case 2:
				System.out.println(" 학생목록입니다.");
				break;				
			case 3:
				System.out.println("학생이 검색되었습니다.");
				break;
			case 4:
				System.out.println("프로그램종료 니다.");
				System.exit(0); // (0)정상종료 . main()를 빠져나옴.
//				break;
			default:
				System.out.println("잘못된 입력입니다.");

			} // sw-case
		} //while	
	} //main
}
