import java.util.ArrayList;
import java.util.List;

/**
 * Created by gilpratte on 8/31/16.
 */
public class AppointmentBook {

    private List<Appointment> appointments = new ArrayList<>();

    public void add(Appointment appt) {
        appointments.add(appt);
    }

    public void printAppoinmentsForDay(Day day) {
        for (Appointment appt : appointments) {
            if (appt.getDay() == day) {
                System.out.println(appt);
            }
        }
    }

    public static void main(String args[]) {
        AppointmentBook book = new AppointmentBook();

        Appointment appt = new Appointment("Anna", Day.MONDAY);
        book.add(appt);

        appt = new Appointment("Bob", Day.SATURDAY);
        book.add(appt);

        appt = new Appointment("Carly", Day.SATURDAY);
        book.add(appt);

        appt = new Appointment("Carly", Day.WEDNESDAY);
        book.add(appt);

        book.printAppoinmentsForDay(Day.SATURDAY);

    }
}
