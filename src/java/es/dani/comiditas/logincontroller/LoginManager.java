/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.dani.comiditas.logincontroller;

import java.io.Serializable;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Marian_2
 */

public interface LoginManager extends Serializable{
    
    
    public boolean isAllowed(String low);
}
