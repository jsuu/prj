package pk1;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		// scanner������ ����5���� �Է¹޾� �迭������ ����
		//���� ū�� max�� ����Ѵ�
		
		Scanner sc = new Scanner(System.in);
		int[] ints = new int[5];	//������=>  ints[0] ints[1] ints[2]  ints[3]  ints[4] 

//		int max = 0;	// ����,���� ������ �Է¹�����   max�� 0���� ����.  error! �Ʒ� ������� �Ѵ�
		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < ints.length; i++) {
			System.out.println("������ �Է��ϼ���~");
			ints[i] = sc.nextInt();
			
			if (max > ints[i]) {  
				max = ints[i];				
			}
		}	System.out.println("max= "+max);		
			
//			if (min > ints[i]) {  
//				min = ints[i];				
//			}
//		}	System.out.println("min= "+min);		
		
	}//main
}
