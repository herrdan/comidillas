/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.dani.comiditas.logincontroller;

import org.springframework.context.annotation.Bean;


/**
 *
 * @author Marian_2
 */

public class LoginManagerImpl implements LoginManager {
    
    public LoginManagerImpl() {
    }
    
   public boolean isAllowed(String low){
       return low.equals("dani");
   }
}
