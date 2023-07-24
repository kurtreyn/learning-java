public class AppClass {
  public static void main(String[] args) {
   AppSubClass subClass = new AppSubClass();
    subClass.setName("Kurt");
    subClass.setEmail("kurt@email.com");
    subClass.log(subClass.getName());
    subClass.log(subClass.getEmail());
  }

}
