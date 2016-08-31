/**
 * Created by gilpratte on 8/31/16.
 */
public class Appointment {

    private Day day;
    private String name;

    public Appointment(String name, Day day) {
        this.name = name;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public Day getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "Day: " + day + ", name: " + name;
    }
}
