package accessModifiersAndEncapsulation;

import java.util.Scanner;

public class Encapsula {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Encapsula e = new Encapsula();

		System.out.println("Enter your name:");
		String name = sc.next();
		System.out.println("Enter your age:");
		int age = sc.nextInt();

		e.setName(name);
		e.setAge(age);

		System.out.println("Name: " + e.getName());
		System.out.println("Age: " + e.getAge());

		if (e.getName().equalsIgnoreCase("vidya")) {
			System.out.println("Welcome");
		} else {
			System.out.println("No Access");
		}
	}
}
