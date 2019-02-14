package practice;

public class Load {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	String add(String s1, String s2) {
		return s1 + s2;
	}
	
	public static void main(String args[]) {
		Load l = new Load();
		System.out.println(l.add(10, 20));
		System.out.println(l.add(10, 20, 30));
		System.out.println(l.add("Surendra ","Reddy"));

	}
}
