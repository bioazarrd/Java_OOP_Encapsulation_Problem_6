package D_JavaAdvancedOOP.Lecture3_Encapsulation.LabProblem4;
public class PersonParser {



    public static Person from(String line) {
        String[] split = line.split("\\s+");
        String firstName = split[0];
        String lastName = split[1];
        int age = Integer.valueOf(split[2]);
        double salary = Double.valueOf(split[3]);

        return new Person(firstName, lastName, age, salary);
    }



    public static void main(String[] args) {

        try {
            Person person = PersonParser.from("Aghhg Harizanoov -5 666.66");
            System.out.println(person);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println("hi, I am here");

    }
}