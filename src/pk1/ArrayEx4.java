package pk1;

import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		// �̸��� 3�� �����ؼ� �޾�  ���
		
		Scanner sc = new Scanner(System.in);
		String[] names = new String[3];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("�̸��� �Է��ϼ��� "+i);
			names[i] = sc.nextLine();
		}
		System.out.println("�̸��� ����մϴ�~");
			for (int i = 0; i < names.length; i++) {
				System.out.println("names"+"["+i+"]=  "+ names[i]);
			}
			
			
			
	}//main

}
