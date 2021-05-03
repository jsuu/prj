package pk1;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		// scanner를통해 정수5개을 입력받아 배열변수에 저장
		//가장 큰값 max을 출력한다
		
		Scanner sc = new Scanner(System.in);
		int[] ints = new int[5];	//생성됨=>  ints[0] ints[1] ints[2]  ints[3]  ints[4] 

//		int max = 0;	// 만약,전부 음수를 입력받으면   max가 0으로 나옴.  error! 아래 방법으로 한다
		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < ints.length; i++) {
			System.out.println("정수를 입력하세요~");
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
