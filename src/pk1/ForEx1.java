package pk1;

public class ForEx1 {

	public static void main(String[] args) {
		int a = 300;
		for (int i = 1; i <= 10; i++) {	//i++  i�� ����Ǿ�� ����!  ���๮�� �Ʒ� ��¹�
			if (i%2 == 0 & i%5 == 0) {
				String name = "abc";	//if�� �ȿ��� ���
				System.out.println(i);					
			}
			System.out.println(name);		//	name�� �� for�� �ȿ����� ���		
			
		}
		System.out.println(i);		//	i�� �� for�� �ȿ����� ���		
		System.out.println(a + "��ŭ �����!");		//	a�� �� main(){ } �ȿ��� ���ǹǷ�		
		
	}

}
