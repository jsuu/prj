package pk1;

public class Ex2 {

	public static void main(String[] args) {
		
		int a = 25;	
		int b = 2;
		b+=100;
		b*=100;
		int result = b;
		System.out.println(result);
		
		// ���: 40 ~ 55��
		int age = 30;
		System.out.print(age);
		System.out.println("�� ����ΰ�?");
		System.out.println((age>=40)&(age<=55));
		
		String adult = ((age>=40)&(age<=55))? "���":"���ƴ�";
		System.out.println(adult);
				
		int score = 80; // a:90-100
		System.out.print(score);
		System.out.println("�� A��� �ΰ�?");
		System.out.println((score>=90)&(score<=100));
		
		System.out.println(age + "��" + score);
		
	}

}
