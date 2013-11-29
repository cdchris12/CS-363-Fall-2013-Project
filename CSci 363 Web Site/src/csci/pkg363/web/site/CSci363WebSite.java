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
      List<Student> db = new ArrayList<>();
      db.add(new Student("Johnny","Appleseed","M","johnny.appleseed", "admin",
              "336-201-9119", "123 Scotty Dr.", "Apt # 13", "Fort Pierce", "FL",
              "34952", "Darth", "Vader","902-867-5309", "409 DeathStar Lane","","Galaxy","NV","69087"));
      
    }
    
}
