/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csci.pkg363.web.site;



/**
 *
 * @author Tieto
 */
public class Database {
    
    public static Student[] db; 
    public static int user;
    public Database(){
        
    }
      
    public static void initDB(){
        db = new Student[10];
        db[0]=(new Student("Johnny","Appleseed","M","johnny.appleseed", "admin",
              "336-201-9119", "123 Scotty Dr.", "Apt # 13", "Fort Pierce", "FL",
              "34952", "Darth", "Vader","902-867-5309", "409 DeathStar Lane","","Galaxy","NV","69087"));
    }
}
