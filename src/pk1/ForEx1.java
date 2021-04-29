package pk1;

public class ForEx1 {

	public static void main(String[] args) {
		int a = 300;
		for (int i = 1; i <= 10; i++) {	//i++  i가 실행되어야 증가!  실행문은 아래 출력문
			if (i%2 == 0 & i%5 == 0) {
				String name = "abc";	//if문 안에서 사용
				System.out.println(i);					
			}
			System.out.println(name);		//	name은 위 for문 안에서만 사용		
			
		}
		System.out.println(i);		//	i는 위 for문 안에서만 사용		
		System.out.println(a + "만큼 사랑해!");		//	a는 위 main(){ } 안에서 사용되므로		
		
	}

}
