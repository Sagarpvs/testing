package exercise;

public class OrderofNSquare {

	public static void main(String[] args) {
		float start = System.nanoTime();
		for (int i = 1; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				System.out.println("itteration count : " + j);
			}
		}
		float total = System.nanoTime() - start;
		System.out.println("total execution time : " + total);

	}
}
