package pk1;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���~");
//		String st = sc.next();		//next()�Լ��� String type ���������� �ν�.
//		int st = sc.nextInt();		//nextInt()�Լ��� int type ���������� ���ڸ� �ν�.
		String st = sc.nextLine();	//nextLine()�Լ��� String type ������� ��繮�� �ν�.
		
		System.out.println("�Էµ� ���ڴ� " + st);		

	}
	

}
