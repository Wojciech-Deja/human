package pl.gda.wsb;

import javax.swing.text.Position;
import java.text.ParseException;

public class Human {

    public static void main(String[] args) throws ParseException {
        Person person1 = new Person("Janusz", "Kowalski", "1975-10-06");
        Person person2 = new Student("Konrad", "Nowak", "1999-02-14",5,1,69856);


        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
