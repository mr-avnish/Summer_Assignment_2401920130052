import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "First Class Compartment";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment";
    }
}

class General extends Compartment {
    public String notice() {
        return "General Compartment";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage Compartment";
    }
}

public class TestCompartment {

    public static void main(String[] args) {

        Compartment[] coach = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < coach.length; i++) {

            int choice = random.nextInt(4) + 1;

            if (choice == 1) {
                coach[i] = new FirstClass();
            } else if (choice == 2) {
                coach[i] = new Ladies();
            } else if (choice == 3) {
                coach[i] = new General();
            } else {
                coach[i] = new Luggage();
            }
        }

        for (int i = 0; i < coach.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + coach[i].notice());
        }
    }
}
