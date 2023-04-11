import java.time.LocalDate;
import java.time.LocalTime;

public class ReferenceTypes {

	public static void main(String[] args) {
		String str = "Test";

//		System.out.println(str.charAt(0));

		String biggerString = "This is a lot of text";

//		System.out.println(biggerString.substring(5));

//		System.out.println(biggerString.substring(5, 13));

		String someString = "This is a lot of text again";

//		System.out.println(someString.length());

		String string2 = "value";

//		System.out.println(string2.equals("value"));
//		System.out.println(string2.equalsIgnoreCase("VAlue"));

		// Wrapper classes
//		Integer integer = new Integer(5);
//		System.out.print(integer);

		Integer i3 = Integer.valueOf(5);
//		System.out.println(i3);

		// AutoBoxing
		Integer i4 = 5;
//		System.out.println(i4);

		LocalDate nowDate = LocalDate.now();
//		System.out.println(nowDate);

		LocalTime nowTime = LocalTime.now();
//		System.out.println(nowTime);

//		System.out.println(nowDate.getMonth());

		LocalDate yesterday = LocalDate.of(2023, 2, 7);
//		System.out.println(yesterday);

	}

}
