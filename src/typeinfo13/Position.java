package typeinfo13;

/**
 * Created by 1 on 05.01.2017.
 */
public class Position {
    private String title;
    private Person person;
    public Position(String jobTitle, Person employee){
        title = jobTitle;
        person = employee;
        if(person == null){
            person = Person.NULL;
        }
    }
    public Position(String jobTitle){
        title = jobTitle;
        person = Person.NULL;
    }
    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title;}
    public Person getPerson(){return person;}
    public void setPerson(Person newPerson){
        this.person = newPerson;
        if(person == null){
            person = Person.NULL;
        }
    }
    public String toString(){return "Position: " + title + " " + person;}
}
