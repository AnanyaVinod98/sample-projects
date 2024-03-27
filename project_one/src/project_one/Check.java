package project_one;

public class Check{
	int age;
	float salary;
	String name;
	Check(int age, float salary, String name){
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	public void print() {
		System.out.println("Age is "+age);
		System.out.println("Salary is "+salary);
		System.out.println("Name is "+name);
	}
	public static void main(String args[]) {
		Check obj = new Check(20,15.758f,"Tom");
		obj.print();
	}
}

