package pk1;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���!");
		
		int age = sc.nextInt();
		
		if (age > 60) {
			System.out.println("ȭ���� ������� �����Դϴ�!");
			
//		}else if(age>50 & age<60){
		}else if(age>50){		// ������ 60�̻��� �̹� �����Ƿ� ,  age>50 ���Ǹ� �ص���.
			System.out.println("az������� ���ɴϴ�!");	
			
		}else if(age >40){
			System.out.println("����� ������� ���ɴϴ�");
		}
		
	}

}
