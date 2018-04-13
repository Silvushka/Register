package register;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListRegister implements Register {

	private List<Person> persons = new ArrayList<>();

	private Iterator<Person> iterator;
	private Iterator<Person> it;

	public ListRegister() {

	}

	@Override
	public int getCount() {
		return persons.size();
	}

	@Override
	public Person getPerson(int index) {
		return persons.get(index);
	}

	@Override
	public Person findPersonByName(String name) {
		for (Person person : persons) {
			if ((person.getName()).equals(name)) {
				return person;
			}

		}
		return null;
	}

	@Override
	public Person findPersonByPhoneNumber(String phoneNumber) {
		for (Person person : persons) {
			if ((person.getPhoneNumber()).equals(phoneNumber)) {
				return person;
			}
		}
		return null;
	}

	@Override
	public void removePerson(Person person) {
		iterator = persons.iterator();
		for (Person per : persons) {
			if (iterator.equals(per)) {
				iterator.remove();
				return;
			}
			iterator.next();
		}
	}

	@Override
	public void addPerson(Person person) {
		int counter = 0;
		for (Person person2 : persons) {
			if ((person.getName()).equals(person2.getName())
					|| (person.getPhoneNumber()).equals(person2.getPhoneNumber())) {
				counter++;
			}
		}
		if (counter == 0) {
			persons.add(person);

		} else {
			System.out.println("Osoba s danym menom alebo telefonnym cislom uz existuje!");
		}

	}

	public void deleteAllBy(char firstLetter) {
		Person person;
		it = persons.iterator();
		while (it.hasNext()) {
			person = it.next();
			if ((person.getName()).charAt(0) == firstLetter) {
				it.remove();

			}
		}
	}

	public List<Person> findAllPersonByNameContains(String nameContains) {
		List<Person> foundedPersonsByName = new ArrayList<>();
		Iterator<Person> iter = persons.iterator();

		Person persona;

		while (iter.hasNext()) {
			persona = iter.next();
			if ((persona.getName()).contains(nameContains)) {
				foundedPersonsByName.add(persona);

			}

		}
		return foundedPersonsByName;

	}
	
	public List<Person> findAllPersonByPhoneNumber(String phoneNumber){
		List<Person> foundedPersonsByPhoneNumber = new ArrayList<>();
		Iterator<Person> iterator = persons.iterator();
		Person person;
		
		while(iterator.hasNext()) {
			person = iterator.next();
			if((person.getPhoneNumber()).contains(phoneNumber)) {
				foundedPersonsByPhoneNumber.add(person);
			}
		}
		return foundedPersonsByPhoneNumber;
	}

}
