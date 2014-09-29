package cu.edu.java.ee7.jaxws.endpoint;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface EBookStore {
    @WebMethod
    public String welcomeMessage(String name);
    @WebMethod
    public List<String> findEBooks(String text);
    @WebMethod
    public EBook takeBook(String title);
    @WebMethod
    public void saveBook(EBook eBook);
    @WebMethod
    public EBook addAppendix(EBook eBook,int appendixPages);
}
