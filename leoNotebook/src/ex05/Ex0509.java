package ex05;

public class Ex0509 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] star={	{'*','*',' ',' ',' '},
						{'*','*',' ',' ',' '},
						{'*','*','*','*','*'},
						{'*','*','*','*','*'} };
		
		char[][] result = new char[star[0].length][star.length];
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < star[0].length; i++) {
			for (int j = star.length-1; j >=0 ; j--) {
				result[i][3-j]=star[j][i];
				
			}
		}
		
		System.out.println();
			
		

		
		
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
			
		}
}
}
