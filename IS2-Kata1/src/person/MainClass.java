package person;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Juan Ramón Betancor Olivares
 */
public class MainClass {
    public static void main(String[] args) {
        Calendar f1;
        f1 = GregorianCalendar.getInstance();
        f1.set(1996, 8, 10);
        Person p1 = new Person("Juan Ramón", "Betancor Olivares", f1);
        System.out.println("Nombre de P1: " + p1.getFullName());
        System.out.println("Edad de P1: " + p1.getAge() + " años");
    }
}
