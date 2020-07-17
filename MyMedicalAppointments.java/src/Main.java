import model.*;

import java.util.Date;

import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Adrian Maubrigades", "adrian@mail.com");
        /*myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        */
        System.out.println(myDoctor);

        User user = new Doctor("Adrian", "adri@adri.com");
        user.showDataUser();

        User userPa = new Patient("perez", "perez@mail.com");
        userPa.showDataUser();

        User user1 = new User("carlos", "carlos@mail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatría");
            }
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };



        /*

        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */

        /*
        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient);*/
        showMenu();
    }

}
