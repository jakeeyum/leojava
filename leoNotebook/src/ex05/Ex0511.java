package ex05;

public class Ex0511 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score={
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+" ");
			}
			System.out.println();
		}
		
		
//		score���� ��� ���� 1�� ���� ��� result�� ����
		int[][] result= new int[score.length+1][score[0].length+1];
//	score�� result�� ����
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j]=score[i][j];
			}
			System.out.println();
		}
//		���ο� �ջ�
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][result[i].length-1]+=score[i][j];
			}
		}
//		���ο� �ջ�
		for (int i = 0; i < score[i].length; i++) {
			for (int j = 0; j < score.length; j++) {
				result[result.length-1][i]+=score[j][i];
			}
		}
//		���� ���ϱ�
			for (int i = 0; i < result.length-1; i++) {
			result[result.length-1][result[0].length-1]+=result[i][result[0].length-1];
			}
	
//		result check
		
		for (int k = 0; k < result.length; k++) {
			for (int l = 0; l < result[k].length; l++) {
				System.out.print(result[k][l]+" ");
			}
			System.out.println();
		}
	
		
		
		
		
		
		
		
		System.out.println();
}
}
