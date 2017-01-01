
public class Pet_Platypus {
	private String name;
	private int age;
	private int feet;
	Pet_Platypus(String name, int age, int feet){
		this.name = name;
		this.age = age;
		this.feet = feet;
	}

	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	void getAge(){
		System.out.println(name + " is " + age + " years old");
	}
	void getFeet(){
		System.out.println(name + " has " + feet + " feet");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		Pet_Platypus bob = new Pet_Platypus("bob", 40, 6);
		//2. Call the sayHi method
		bob.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
		bob.getAge();
		bob.getFeet();
	
	}

}
