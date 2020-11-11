package D_JavaAdvancedOOP.Lecture3_Encapsulation.LabProblem4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ///????????? ????? ? mutable & immuatable!!!!!!!!!!!!!!!!!!!!!!!!!!


        int n = Integer.parseInt(reader.readLine());

        Team team = new Team("The Back Eagles");



        for (int i = 0; i < n; i++) {
            String input = reader.readLine();
            try {
                team.addPlayer(PersonParser.from(input));
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }

        System.out.printf("First team have %d player%n", team.getFirstTeam().size());
        System.out.printf("Reserve team have %d player%n", team.getSpareTeam().size());


    }
}
