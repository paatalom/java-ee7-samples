package cu.edu.java.ee7.validation.methods;

import java.util.Date;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RequestScoped
public class MyBean {
    public String sayHello(@Size(max = 3)String name) {
        return "Hello " + name;
    }
    @Future
    public Date showDate(Date paramDate) {
        return paramDate;
    }
    public String showList(@NotNull @Size(min=1, max=3) List<String> list, @NotNull String prefix) {
        StringBuilder builder = new StringBuilder();
        
        for (String s : list) {
            builder.append(prefix).append(s).append(" ");
        }
        
        return builder.toString();
    }
}
