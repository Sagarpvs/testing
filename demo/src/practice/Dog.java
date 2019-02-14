package practice;

public class Dog extends Animal {
	String color ="white";
	Dog() {

		System.out.println("Dog is created");

	}
	 void Color() {
		 
		 System.out.println("Dog color is " +color);
		 System.out.println("Animal color is " +super.color);
		 System.out.println("Animal color is " +this.color);
		
	}
}
