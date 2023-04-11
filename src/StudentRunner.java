import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		int[] marks = { 97, 98, 100 };

		Student student = new Student("Kurt", marks);

		int number = student.getNumberOfMarks();
		System.out.println("number of marks: " + number);

		int sum = student.getTotalSumofMarks();
		System.out.println("sum of marks: " + sum);

		int max = student.getMaximumMark();
		System.out.println("maximum mark: " + max);

		int min = student.getMinimumMark();
		System.out.println("minimum mark: " + min);

		BigDecimal average = student.getAverageMarks();
		System.out.println("average mark: " + average);

		student.addNewMark(35);

		student.removeMarkAtIndex(1);

		System.out.println(student);

	}

}
