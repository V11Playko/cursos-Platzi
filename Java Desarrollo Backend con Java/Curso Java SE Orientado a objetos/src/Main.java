import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Heinner Vega", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient(myDoctor.name = "Heinner", myDoctor.email = "ajaja@gmail.com");
        System.out.println(patient.email);
    }

    
}