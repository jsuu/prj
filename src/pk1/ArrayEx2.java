package pk1;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		//scanner�̿��Ͽ� 5���� ������ �Է¹޾� �迭����� �����ϰ�
		//����� �迭������ ȭ�� ����ϰ� �հ踦 ����Ѵ�
		
		Scanner sc = new Scanner(System.in);
		int[] ints = new int[5];  //������=>  ints[0] ints[1] ints[2]  ints[3]  ints[4] 
		System.out.println(ints);	//ints �ּҰ�
		
		for (int i = 0; i < ints.length; i++) {
			System.out.print("������ �Է��ϼ�;��");	
			int input = sc.nextInt();
			
			ints[i] = input; 
		}
		
		int sum = 0;
		for (int i = 0; i < ints.length; i++) {
			System.out.println("ints["+i+"]"+"="+ints[i]);			
			sum +=ints[i];
		}		
		System.out.println("sum= "+sum);			
	}
}