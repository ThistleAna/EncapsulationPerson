public class Main {
    public static void main(String[] args) {
        // create object person number 1
        PersonCreator p1 = new PersonCreator("James Arthur", 34, 168, 60.7);
        System.out.println(p1.getName() + " " + p1.getAge() + " " + p1.getHeight() + " " + p1.getWeight());

        // create person 2 James Peterson, 34, 180cm, 73.5lbs and print
        // create person 3 Bob Thornley, 25, 171cm, 68.2lbs and print
    }
}
