public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("32 Main St", "Louisville", "40220");
		Customer customer = new Customer("Bob", homeAddress);

		Address workAddress = new Address("4509 S. 4th St", "Louisville", "40219");

		customer.setWorkAddress(workAddress);

		System.out.println(customer);

	}

}
