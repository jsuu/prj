package pk1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		//Scanner�� �����ڸ� �Է¹޴´�  (+,  -,  *,  / )
		//Scanner�� ������ 2���� �Է¹޴´� (������)
 		//�����ڿ� ���� ����� ��������
		
		Scanner sc = new Scanner(System.in);
		Scanner si = new Scanner(System.in);
		System.out.println("+,  -,  *,  /  �߿� ������ 1���� �Է��ϼ���~");
		
		String ch="";
		ch =sc.next();
//		while(ch !="+" |ch !="-"|ch !="*"|ch !="/" ){	
//			System.out.println("+,  -,  *,  /  �߿� ������ 1���� �Է��ϼ���~");				
//			ch =sc.next();
//		}	
		int[] ints = new int[2];
		int res = 0;
		String result="";
		for (int i = 0; i <=1 ; i++) {
			System.out.println("���ڸ��Է�~");
			ints[i] =  si.nextInt();
		}
		
		switch (ch) {
		case "+":
			result = ints[0]+"+"+ints[1] + "=";
			res = ints[0]+ints[1];
			break;
		case "-":
			result = ints[0]+"-"+ints[1] + "=";
			res = ints[0]-ints[1];
			break;
		case "*":
			result = ints[0]+"*"+ints[1] + "=";
			res = ints[0]*ints[1];
			break;
		case "/":
			result = ints[0]+"/"+ints[1] + "=";
			res = ints[0]/ints[1];
			break;

		default:
			System.out.println("���ڸ� �Է��ϼ���");
			break;
		}
		
		System.out.println(result + res);
		
		
	}
}
