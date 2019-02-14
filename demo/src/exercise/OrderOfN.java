package exercise;

public class OrderOfN {

	public static void main(String[] args) {
		float start = System.nanoTime();
		for (int j = 0; j < 100; j++) {
			System.out.println("itteration count : " + j);
		}
		float total = System.nanoTime() - start;
		System.out.println("total execution time : " + total);

	}

}
