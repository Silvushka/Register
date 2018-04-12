package register;

/**
 * Created by jaro on 3.2.2014.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Register register = new Register(10);

        register.addPerson(new Person("Janko Hrasko", "0900123456"));
        register.addPerson(new Person("Jozef Mrkvicka", "457545"));
        
        ConsoleUI ui = new ConsoleUI(register);
        ui.run();
    }
}
