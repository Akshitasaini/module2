package mycompany.hibernateannotation;

import java.io.IOException;
import java.util.List;

public class PersonServiceImpl implements PersonService{
private PersonDao dao;

{
	dao=new PersonDaoImpl();
}

@Override
public Person createPerson(Person person) {
	// TODO Auto-generated method stub
	return dao.createPerson(person);
}

@Override
public List<Person> getAllPersons() {
	// TODO Auto-generated method stub
	return dao.getAllPersons();
}

@Override
public Person getPersonByid(Integer id) {
	// TODO Auto-generated method stub
	return dao.getPersonByid(id);
}

@Override
public Person updatePerson(Integer id) throws IOException {
	// TODO Auto-generated method stub
	return dao.updatePerson(id);
}

@Override
public void deletePerson(Integer id) {
	// TODO Auto-generated method stub
	dao.deletePerson(id);
}

}
