package org.example.person;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-19T15:39:03+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 17.0.2 (Oracle Corporation)"
)
public class PersonMapStructImpl implements PersonMapStruct {

    @Override
    public Person personDtoToPerson(PersonDto personDto) {
        if ( personDto == null ) {
            return null;
        }

        Person person = new Person();

        person.setFullName( personDto.getName() );
        person.setYears( personDto.getAge() );

        return person;
    }
}
