package pk1;

public class Ex2 {

	public static void main(String[] args) {
		
		int a = 25;	
		int b = 2;
		b+=100;
		b*=100;
		int result = b;
		System.out.println(result);
		
		// 장년: 40 ~ 55세
		int age = 30;
		System.out.print(age);
		System.out.println("는 장년인가?");
		System.out.println((age>=40)&(age<=55));
		
		String adult = ((age>=40)&(age<=55))? "장년":"장년아님";
		System.out.println(adult);
				
		int score = 80; // a:90-100
		System.out.print(score);
		System.out.println("는 A등급 인가?");
		System.out.println((score>=90)&(score<=100));
		
		System.out.println(age + "는" + score);
		
	}

}
