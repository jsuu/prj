package pk1;

public class SumEx {

	public static void main(String[] args) {
		//1~10까지 더하기
		int sum=0;
		
		for(int i=1;i<=10;i++){
			sum +=i;
		}
			System.out.println("1~10까지 합= "+ sum);
			
		// 1~5까지 곱하기
		int fac = 1;	
		for(int i=1;i<=5;i++){
			fac *=i;
		}
			System.out.println("1~5까지 곱= "+ fac);
			
	}

}
