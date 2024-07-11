package Tester;

public class Student {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		Student student = new Student(1, "Sahana");
		System.out.println(student);
	}

	@Override
	public String toString() {
		return this.id+" "+this.name;
	}
}
