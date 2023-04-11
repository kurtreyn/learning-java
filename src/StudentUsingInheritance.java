public class StudentUsingInheritance extends Person {

	private String collegeName;
	private int year;

	public StudentUsingInheritance(String name, String collegeName) {
		super(name);
		this.collegeName = collegeName;
	}
}
