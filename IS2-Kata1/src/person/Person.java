package person;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Juan Ramón Betancor Olivares
 */
public class Person {
	
    private final String name;
    private final String surname;
    private final Calendar birthday;
    private static final long MILLESECOND_PER_YEAR =(long) (1000*60*60*24*365.25);

    public Person(String name, String surname, Calendar birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getFullName(){
        return (name + " " + surname);
    }

    public Calendar getBirthday() {
        return birthday;
    }
    
    public int getAge(){
       Calendar today = GregorianCalendar.getInstance();
       return (int) getMillis(today.getTimeInMillis() - birthday.getTimeInMillis());
    }
    
    private long getMillis(long milli){
        return milli/MILLESECOND_PER_YEAR;
    }
    
}
