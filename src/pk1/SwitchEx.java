package pk1;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("spring/summer/fall/ winter �� ������ �Է��ϼ���~");
		String season = sc.next();	//�������� �� 1���� �ؾ��Ѵ�. ���⼭�� String
		
		switch(season){
			case "spring" : System.out.println("������ �����ϳ׿�~");
//			break;				//break������  ������ ������ �����Ѵ�
			
			case "summer" : System.out.println("������ ���׿�~");
//			break;
			
			case "fall" : System.out.println("������ �����ϳ׿�~");
			break;
			
			case "winter" : System.out.println("������ ��׿�~");
			break;		
			
			default : System.out.println("�߸��� �����Դϴ�");
			
		}

	}

}

