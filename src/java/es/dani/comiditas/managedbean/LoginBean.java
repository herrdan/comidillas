/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.dani.comiditas.managedbean;

import es.dani.comiditas.logincontroller.LoginManager;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Marian_2
 */
@ManagedBean(name="loginBean")
@RequestScoped
public class LoginBean {

    private LoginManager loginManager;

    public LoginManager getLoginManager() {
        return loginManager;
    }

    public void setLoginManager(LoginManager loginManager) {
        this.loginManager = loginManager;
    }
    
    private String loginActual;

    public String getLoginActual() {
        return loginActual;
    }

    public void setLoginActual(String loginActual) {
        this.loginActual = loginActual;
    }
    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }
    
   public String loguearse(){
       int i = 0 ;
       //WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(null);
       return loginManager.isAllowed(this.loginActual)? "inicio" : "";
   }
   
   
    
    
    
}
