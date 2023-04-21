package ru.skadidonovan.library.util;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.skadidonovan.library.dao.PersonDAO;
import ru.skadidonovan.library.models.Person;


@Component
public class PersonValidator implements Validator {

    private final PersonDAO personDAO;

    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;

        if (personDAO.show(person.getId(), person.getName()).isPresent()){
            errors.rejectValue("name", "", "Читатель с таким ФИО уже существует");
        }
    }
}
