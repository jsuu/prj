package pk1;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		String[] strs = new String[3];	//������=>  strs[0] strs[1] strs[2]  strs[3]	
		for (int i = 0; i <=2; i++) {
			System.out.print("�̸��� �Է��ϼ�;��");			
			strs[i] = sc.next();
		}
		
		for (int i = 0; i <=2; i++) {
			System.out.println(strs[i]);			
		}
		//System.out.println(strs[3]);	//error
		
	}
}

//0. ��ĳ�� ��ü����
//1. �迭 ��ü �����
//2. for()  ���ڸ� �Է¹޾� �迭������ ���� 
//3. for()  �迭�� �ϳ��� syso'