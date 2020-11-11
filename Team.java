package D_JavaAdvancedOOP.Lecture3_Encapsulation.LabProblem4;
import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Person> firstTeam;
    private List<Person> spareTeam;

    public Team(String name) {
        this.setName(name);
        this.firstTeam = new ArrayList<>();
        this.spareTeam = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public List<Person> getSpareTeam() {
        return this.spareTeam;
    }

    public List<Person> getFirstTeam() {
        return this.firstTeam;
    }


    public  void addPlayer(Person player) {
        if (player.getAge() < 40) {
            this.firstTeam.add(player);
        } else {
            this.spareTeam.add(player);
        }
    }



}
