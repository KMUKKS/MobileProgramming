
public class bubblesorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bubble[] = { 22, 5, 11, 28, 25, 24, 39 };
		int a, b, temp;

		for (a = 0; a < bubble.length -1; a++) {
			for (b = 0; b < bubble.length -a -1; b++) {

				if (bubble[b] > bubble[b + 1]) {
					temp = bubble[b];
					bubble[b] = bubble[b + 1];
					bubble[b + 1] = temp;
				}
			}
		}

		for (a = 0; a < bubble.length; a++) {
			System.out.println(bubble[a]);
		}
	}

}
