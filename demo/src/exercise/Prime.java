package exercise;

public class Prime {

	public static void main(String[] args) {

		int num = 4;
		boolean b = false;
		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				b = true;
				break;
			}
		}

		if (!b)
			System.out.println("The given number is a prime number : " + num);
		else
			System.out.println("The given number is not a prime number : " + num);
	}
}
