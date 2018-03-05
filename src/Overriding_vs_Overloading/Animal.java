package Overriding_vs_Overloading;

public class Animal {
	public static String str = "abc";

	public static void main(String[] args) {
		Animal a = new Animal();
		a.bark();
		a.bark("pain");
		a.bark2(3.245);
		a.bark("pain", 3.245);

	}

	public Animal(String var) {
		System.out.println("var is: " + var);
	}

	public Animal() {
		System.out.println("Anlamamiz icin bas");
	}

	public void bark() {
		System.out.println("Animal is barking");
	}

	public void bark(String var) {
		System.out.println("Animal is barking with " + var);
	}

	public void bark2(Double var) {
		System.out.println("Animal is barking with " + var * 10);
	}

	public void bark(String var, Double dbl) {
		System.out.println("Animal is barking with " + var + dbl * 10);
	}

	public void bark(Double dbl, String var) {
		System.out.println("Animal is barking with " + var + dbl * 10);
	}
}
