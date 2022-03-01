 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author bulentoral,F.Ozdemir
 */
public abstract class Person implements Serializable{
    
    private String tc;
    private String name;
    private String last_name;
    private String phone_number;
    private String date_of_birth;
    private String email;
    private String gender;
    

    public Person(String tc, String name, String last_name, String phone_number, String date_of_birth,String email,String gender) {
        this.tc = tc;
        this.name = name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.date_of_birth = date_of_birth;
        this.email = email;
        this.gender = gender;
        
    }
    
    
    public abstract int getMaxSize();
    public abstract int getTotal();

     /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @param phone_number the phone_number to set
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    /**
     * @param date_of_birth the date_of_birth to set
     */
    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    
    /**
     * @return the tc
     */
    public String getTc() {
        return tc;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @return the phone_number
     */
    public String getPhone_number() {
        return phone_number;
    }

    

    /**
     * @return the date_of_birth
     */
    public String getDate_of_birth() {
        return date_of_birth;
    }

    @Override
    public String toString() {
        return "T.C.: " +tc+"\n"+
                "Name: "+name+"\n"+
                "Last Name: "+last_name+"\n"+
                "Phone Number: "+ phone_number+"\n"+
                "Email: "+email+"\n"+
                "Gender:"+gender+"\n"+
                "Date of Birth: "+ date_of_birth;
    }
    

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    

    /**
     * @param tc the tc to set
     */
    public void setTc(String tc) {
        this.tc = tc;
    }
    
    
    
    
    
}
