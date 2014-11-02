package cu.edu.java.ee7.ejb.stateful.remote;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface Cart {

    public void addItem(String item);

    public void removeItem(String item);

    public void purchase();
    
    public List<String> getItems();

}
