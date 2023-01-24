public class Main {
    // Workbook OOP1: https://github.com/ThistleAna/EncapsulationPerson.git

    public static void main(String[] args) {
        // create object person number 1
        PersonCreator p1 = new PersonCreator("James Peterson", 34, 180, 73.5);
        System.out.println(p1.getName() + " " + p1.getAge() + " " + p1.getHeight() + " " + p1.getWeight());
        // make person 1 grow older by calling the method growOlder
        p1.growOlder();
        System.out.println(p1.getName() + " is growing older : " + p1.getAge() + " " + p1.getHeight() + " " + p1.getWeight());

        // Eva :create person 2 Bob Thornley, 25, 171cm, 68.2lbs and print
        PersonCreator p2 = new PersonCreator("Bob Thornley", 25, 171, 68.2);
        System.out.println(p2.getName() + " " + p2.getAge() + " " + p2.getHeight() + " " + p2.getWeight());
        p2.growOlder();
        System.out.println(p2.getName() + " is growing older : " + p2.getAge() + " " + p2.getHeight() + " " + p2.getWeight());
        
        //Aloka : person 3, create the profile Ada Lovelace, 156 cm, 56, 23 lbs and print
        PersonCreator p3 = new PersonCreator("Ada Lovelace", 56, 156, 23);
        System.out.println(p3.getName() + " " + p3.getAge() + " " + p3.getHeight() + " " + p3.getWeight());
        p3.growOlder();
        System.out.println(p3.getName() + " is growing older : " + p3.getAge() + " " + p3.getHeight() + " " + p3.getWeight());

        //Abidemi: person 4
        PersonCreator p4 = new PersonCreator("Sam Smith", 35, 179, 77.5);
        System.out.println(p4.getName() + " " + p4.getAge() + " " + p4.getHeight() + " " + p4.getWeight());
        p4.growOlder();
        System.out.println(p4.getName() + " is growing older : " + p4.getAge() + " " + p4.getHeight() + " " + p4.getWeight());


        // Waheeb : person 5
        PersonCreator p5 = new PersonCreator("Tom Jade", 31, 181, 75.2);
        System.out.println(p5.getName() + " " + p5.getAge() + " " + p5.getHeight() + " " + p5.getWeight());
        p5.growOlder();
        System.out.println(p5.getName() + " is growing older : " + p5.getAge() + " " + p5.getHeight() + " " + p5.getWeight());
        //Emma: person 6
        PersonCreator p6 = new PersonCreator("Lacey-May", 18, 145, 58.5);
        p6.growOlder();
        System.out.println(p6.getName() + " is growing older : " + p6.getAge() + " " + p6.getHeight() + " " + p6.getWeight());

    }
}
