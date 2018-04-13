package register;

/**
 * Created by jaro on 3.2.2014.
 */
public class Main {

	public static void main(String[] args) throws Exception {
		ArrayRegister register = new ArrayRegister(10);

		register.addPerson(new Person("Janko Hrasko", "0900123456"));
		register.addPerson(new Person("Jozef Mrkvicka", "457545"));

		ListRegister registerik = new ListRegister();

		registerik.addPerson(new Person("Jozef Mgfska", "45754545"));
		registerik.addPerson(new Person("Hanka gkfg", "4575454545"));

		ConsoleUI ui = new ConsoleUI(registerik);
		registerik.deleteAllBy('H');
		ui.run();
		
	}
}
