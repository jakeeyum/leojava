package javajungsuk;

public class LottoEx2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ball = new int[45];

		// ball �迭�� 1���� 45�� ���� �ִ´�.

		for (int i = 0; i < ball.length; i++) {

			ball[i] = i + 1;
			// System.out.println(ball[i]);
		}

		// �����ϰ� �迭���� ���ڸ� �ٲ۴�.

		for (int i = 0; i < (ball.length)*3; i++) {

			int temp;
			int j;

			j = (int) (Math.random() * 45);

			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;

		}

//		6���� ���� ������� �̴´�.
		
		for (int j2 = 0; j2 < 6; j2++) {

			System.out.println((j2 + 1) + "��° ��÷���� " + ball[j2] + "�Դϴ�.");
		}
 
	}
}
