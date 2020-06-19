package pl.gda.wsb;


import javax.swing.text.Position;

public class Footballer extends Person{
    public enum Position {
        goalkeeper,
        defender,
        midfielder,
        attacker,
    }

    private String club;
    private int numberOfGoals;
    private Position position;


    public Footballer(String name, String surname, String dateOfBirth, String club, Position position) {
        super(name, surname, dateOfBirth);
        this.club = club;
        this.position = position;
    }

    public void scoreAGoal() {
        numberOfGoals += 1;
        System.out.println(club + " (" + super.getSurname() + ") scores!");
    }

    @Override
    public String toString() {
        return '\n' + "Name and surname: " + super.getName() +" "+ super.getSurname() +  ", " +
                "date of birth: " + super.getDateOfBirth() +  "." + '\n' +
                "Footballer's " +
                "club: " + club +
                ", position: " + position + "." + '\n' +
                "Number of goals: " + numberOfGoals + '\n';
    }


}
