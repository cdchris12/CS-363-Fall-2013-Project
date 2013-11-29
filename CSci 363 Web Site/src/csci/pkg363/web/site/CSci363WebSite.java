/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csci.pkg363.web.site;

/**
 *
 * @author iamchrisbowtome
 */
import java.util.*;
public class CSci363WebSite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


      
      Database.initDB();
        // TODO code application logic here
        new Login().setVisible(true);  // New Login window
        
        // Run code that determines what you entered into the login form and
        // returns true if user/pass correct.
        
        // Test the boolean variable and run Main() when it is true.
        
        //new Main().setVisible(true);    // New Main window
//>>>>>>> d1ecce264f86ae244fd603f2710eda9a86ff9310
    }
    
}
