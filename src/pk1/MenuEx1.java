package pk1;

import java.util.Scanner;

public class MenuEx1 {

	public static void main(String[] args) {
		// ȭ��ǥ�� --> �޴�) 1. �л���� , 2. �л����, 3. �л��˻�, 4. ���α׷�����
// 		1�� �Է¹����� ->	�л��� ��ϵǾ����ϴ�
// 		2�� �Է¹����� ->   �л�����Դϴ�
// 		....
// 		4�� �Է¹����� ....
		
		Scanner sc = new Scanner(System.in);
	while(true){
			System.out.println("�޴�) 1. �л���� , 2. �л����, 3. �л��˻�, 4. ���α׷�����~");
			System.out.println("�޴���  �Է��ϼ���");

			int menuNo = sc.nextInt();
			switch (menuNo) {
			case 1:
				System.out.println("�л��� ��ϵǾ����ϴ�~");
				break;
			case 2:
				System.out.println(" �л�����Դϴ�.");
				break;				
			case 3:
				System.out.println("�л��� �˻��Ǿ����ϴ�.");
				break;
			case 4:
				System.out.println("���α׷����� �ϴ�.");
				System.exit(0); // (0)�������� . main()�� ��������.
//				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");

			} // sw-case
		} //while	
	} //main
}
