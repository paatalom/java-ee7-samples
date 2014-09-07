package cu.edu.java.ee7.jsf.server.extension;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;


@FacesConverter("myConverter")
public class MyConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context,
            UIComponent component,
            String value) {
        System.out.println("Received: " + value);
        try {
            return new UserAge(Integer.parseInt(value.trim()));
        } catch (NumberFormatException e) {
            throw new ConverterException(new FacesMessage(e.toString()), e);
        }
    }

    @Override
    public String getAsString(FacesContext context,
            UIComponent component,
            Object value) { 
        System.out.println(value);
        return String.valueOf(((UserAge)value).getAge());
    }
}
