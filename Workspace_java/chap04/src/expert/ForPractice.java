package expert;

public class ForPractice {

	public static void main(String[] args) {

		// 주사위 2개 굴려서 나올 수 있는 모든 합 출력.
		// 주사위 두개
//		int[] array = new int[11];
//		
//		
//		
//		int sum = 0;
//		
		// array[0]

//		for(int dice1=1; dice1<=6; dice1++ ) {
//			for( int dice2= 1; dice2<=6; dice2++) {
//				sum=dice1+dice2;
//				System.out.println("dice1 : "+dice1+" dice2 : "+ dice2);
//			}
//	}

//		for(int dice1=1; dice1<=6; dice1++) {
//			for(int dice2=1; dice2<=6; dice2++) {
//				int sumP = dice1+dice2;
//				//index는 0부터 시작하므로 sumP-2값과 index번호가 같음.
//				array[sumP-2]++;
//				
//	}
//}
//		for(int i=0; i<array.length; i++) {
//			
//			System.out.println(array[i]);
//		}

		// 2 1 3 1 4 1
		// 2 2 3 2 4 2
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 4; j++) {
				System.out.print(j + " * " + i + " : " + j * i + " " + " ");
			}

			System.out.println();
		}
		System.out.println("-----------------------------");
		for (int i = 1; i <= 9; i++) {
			for (int j = 5; j <= 7; j++) {
				System.out.print(j + " * " + i + " : " + j * i + " " + " ");
			}

			System.out.println();
		}
		System.out.println("-----------------------------");
		for (int i = 1; i <= 9; i++) {
			for (int j = 8; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + j * i + " ");
			}
			System.out.println();
		}

//		int k = 2;
//		for (int i = 1; i <= 9; i++) {
//			for (int j = k; j <= k + 2; j++) {
//				System.out.print(j + " * " + i + " = " + j * i + " ");
//			}
//			System.out.println();
//
//		}
	}
}