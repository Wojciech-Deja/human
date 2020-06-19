package pl.gda.wsb;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    private String name;
    private String surname;
    private String dateOfBirth;

    public Person(String name, String surname, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Name and surname: " + name + ' ' +
                surname + ", date of birth: " + dateOfBirth
                + '\n';
    }


    public void howManyYears() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = getDateOfBirth();
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.parse(date, formatter);
        Duration duration = Duration.between(birthday.atStartOfDay(), today.atStartOfDay());
        long age= duration.toDays()/365;
        System.out.println(surname + " is "+ age + " years old.");
    }
}
