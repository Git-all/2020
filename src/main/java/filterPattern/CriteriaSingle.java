package filterPattern;


import java.util.ArrayList;
import java.util.List;

/**
 * @author dengcaochao
 */
public class CriteriaSingle implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}

