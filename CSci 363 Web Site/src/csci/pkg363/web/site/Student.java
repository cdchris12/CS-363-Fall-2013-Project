/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csci.pkg363.web.site;

/**
 *
 * @author Tieto
 */
public class Student {
   private String _fName; 
   private String _lName;
   private String _middle;
   private String _usrName;
   private String _passwd;
   private String _phoneNum;
   private String _address1; // 314 reeves dr.
   private String _address2;    // ie apt#3
   private String _city;  // ie Grand forks
   private String _state;
   private String _zip;
    //eC is emergency contact
   private String _ecFName;
   private String _ecLName;
   private String _ecPhone;
   private String _ecAddress1;
   private String _ecAddress2;
   private String _ecCity;
   private String _ecState;
   private String _ecZip;
   private String _locale = "US"; 


/**
 *
 * @author Tieto
 */
   public Student(){
       _fName = "";
        _lName = "";
        _middle = "";
        _usrName = "";
        _passwd = "";
        _phoneNum = "";
        _address1 = "";
        _address2 = "";
        _city = "";
        _state = "";
        _zip = "";
        _ecFName = "";
        _ecLName = "";
        _ecPhone = "";
        _ecAddress1 ="";
        _ecAddress2 ="";
        _ecCity ="";
        _ecState = "";
        _ecZip = "";
       
   }
    public Student(String fn, String ln, String mn, String un, String pwd,
            String pn, String a1, String a2, String city, String state, String zip, String ecFN, String ecLN, 
            String ecPn, String ecAdd1, String ecAdd2, String eccity, String ecstate, String eczip){
        _fName = fn;
        _lName = ln;
        _middle = mn;
        _usrName = un;
        _passwd = pwd;
        _phoneNum = pn;
        _address1 = a1;
        _address2 = a2;
        _city = city;
        _state = state;
        _zip = zip;
        _ecFName = ecFN;
        _ecLName = ecLN;
        _ecPhone = ecPn;
        _ecAddress1 =ecAdd1;
        _ecAddress2 =ecAdd2;
        _ecCity =eccity;
        _ecState = ecstate;
        _ecZip = eczip;
                

    }
    public void setFirstName(String f){
        _fName = f;
    }
    public void setLastName(String l){
        _lName = l;
    }
    public void setMiddle(String m){
        _middle = m;
    }
    public void setUserName(String u){
        _usrName = u;
    }
    public void setPassword(String p){
        _passwd = p;
    }
    public void setPhone(String s){
        _phoneNum = s;
    }
    public void setStreet(String street){
        _address1 = street;
    }
    public void setOptional(String apt){
        _address2 = apt;
    } 
    public void setCity(String s){
        _city = s;
    }
    public void setState(String s){
        _state = s;
    }
    public void setZip(String s){
        _zip = s;
    }
    public void setEmergencyContact(String fn, String ln, String ph, 
            String street, String apt, String city, String state, String zip){
        _ecFName = fn;
        _ecLName = ln;
        _ecPhone = ph;
        _ecAddress1 = street;
        _ecAddress2 = apt;
        _ecCity = city;
        _ecState = state;
        _ecZip = zip;
    }
    
      public String getFirstName(){
        return _fName;
    }
    public String getLastName(){
        return _lName;
    }
    public String getMiddle(){
        return _middle;
    }
    public String getUserName(){
        return _usrName;
    }
    public String getPassword(){
        return _passwd;
    }
    public String getPhone(){
        return _phoneNum;
    }
    public String getStreet(){
        return _address1;
    }
    public String getOptional(){
        return _address2;
    } 
    public String getCity(){
        return _city;
    }
    public String getState(){
        return _state;
    }
    public String getZip(){
        return _zip;
    }
    public String getEcFName(){
        return _ecFName;
    }
    public String getEcLName(){
        return _ecLName;
    }
    public String getEcPhone(){
        return _ecPhone;
    }
    public String getEcStreet(){
        return _ecAddress1;
    }
    public String getEcOptional(){
        return _ecAddress2;
    }
    public String getEcCity(){
        return _ecCity;
    }
    public String getEcState(){
        return _ecState;
    }
    public String getEcZip(){
        return _ecZip;
    }
    public void setLocale(String l){
        _locale=l;
    }
    public String getLocale(){
        return _locale;
    }
    
            
}
