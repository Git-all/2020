package filterPattern;

import java.util.List;

/**
 * @author dengcaochao (Criteria:标准）
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}