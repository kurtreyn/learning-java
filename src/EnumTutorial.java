public class EnumTutorial {

    enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY }

    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day);

        System.out.println("Captain Crunch has this level of deliciousness: " + Cerials.CAPTAIN_CRUNCH.levelOfDeliciousness);
    }

}
