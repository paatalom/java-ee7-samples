/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cu.edu.java.ee7.project;

import org.primefaces.context.RequestContext;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
@ManagedBean
public class UserLoginBean implements Serializable{

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
        boolean loggedIn = true;
        

        //TODO make logind validation code here.
//        if(username != null && username.equals("admin") && password != null && password.equals("admin")) {
//            loggedIn = true;
//            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
//        } else {
//            loggedIn = false;
//            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
//        }
        FacesContext.getCurrentInstance().addMessage(null, message);
        context.addCallbackParam("loggedIn", loggedIn);
        return "loggedIn";
    }
}
