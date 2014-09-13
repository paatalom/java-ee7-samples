package cu.edu.java.ee7.jsf.resource.handling;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;

@Named
@Stateless
public class CustomerSessionBean {  
    public List<Name> getCustomerNames() {
        List<Name> names = new ArrayList<>();
        
        names.add(new Name("Penny", "TBBT"));
        names.add(new Name("Sheldon", "TBBT"));
        names.add(new Name("Amy", "TBBT"));
        names.add(new Name("Leonard", "TBBT"));
        names.add(new Name("Bernadette", "TBBT"));
        names.add(new Name("Raj", "TBBT"));
        names.add(new Name("Priya", "TBBT"));
        names.add(new Name("Howard", "TBBT"));
        
        return names;
    }
}
