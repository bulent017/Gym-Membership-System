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
public class Customer extends Person {

    /**
     * @return the trainer
     */
   
    private final int MAX_CUSTOMER_NUMBER = 200;  
    private Trainer trainer;   
   
   
    private static int total_customer;
    private double amount;
    private String membership_type;
    

    public Customer( String membership_ype,  String tc, String name, String last_name, String phone_number, String date_of_birth, String email, String gender,Trainer trainer,double amount) {
        super(tc, name, last_name, phone_number, date_of_birth, email, gender);
        this.trainer = trainer;
       
        this.membership_type = membership_ype;
        
        this.amount = amount;
        total_customer++;
           
    }
    
    

    

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Trainer: "+ getTrainer().getName() +"\n"+
                
                "Membership Time: "+membership_type+"\n"+
                "Total Customers: "+total_customer;
    }
    
     public Trainer getTrainer() {
        return trainer;
    }
    
    /**
     * @param trainer the trainer to set
     */
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    


    

    

    @Override
    public int getTotal() {
        return total_customer;
    }

    

    @Override
    public int getMaxSize() {
        return MAX_CUSTOMER_NUMBER;
    }

    /**
     * @return the membership_type
     */
    public String getMembership_type() {
        return membership_type;
    }

    /**
     * @param membership_type the membership_type to set
     */
    public void setMembership_type(String membership_type) {
        this.membership_type = membership_type;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
            
    
}
