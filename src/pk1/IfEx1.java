package pk1;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		int age = 17;		
		if (age >= 15) {
			   System.out.println("ȥ�� ���尡��~");
		} else {
			System.out.println("�����ڿ� ��������");
		}
		
//		String id = "name";
//		String pw = "1234";
//
//		Scanner sc = new Scanner(System.in); 
//		
//		System.out.println("���̵� �Է��ϼ���");
//		String id = sc.next();		
//		System.out.println("�н�����带 �Է��ϼ���");
//		String pw = sc.next();
//		
////		if (id ==  "name" & pw == "1234") {	// == �� �⺻�����Ϳ����� �ȴ�. String�� ���������͹Ƿ�
//		if (id.equals("name") & pw.equals("1234")) {	// String�� equals
//			System.out.println("�α���");
//		} else {
//			System.out.println("id�� pw�� �����ʽ��ϴ�");				
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
//			System.out.println("����� Ȯ���ϼ���");;
//		}
//			System.out.println("����Ʈ: "+point);
//			
//			for (int i = 1; i <=10; i++) {
//				System.out.println("hello "+i);
//			}		
//			
//			// 1~10 ����
//			int sum = 0;	//��������
//			for (int i = 1; i <=10; i++) {
//				sum +=i;
//			}	System.out.println("1~10 ������: "+sum);
//			
//			int count = 0;	
//			while (count <10) {
//				System.out.println("hello !! ");
//				count++;
//			}		
			
			int count = 0;	
			while(true){	//���ѷ���
				count++;
				if (count >=5) {
					break;
				}
				System.out.println(count);				
			}

	}//main

}//class
