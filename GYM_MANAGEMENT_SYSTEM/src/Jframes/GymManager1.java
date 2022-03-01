/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jframes;

import Classes.Admin;
import Classes.Cleaner;
import Classes.Customer;

import Classes.Person;
import Classes.Trainer;
import java.util.ArrayList;


/**
 *
 * @author bulentoral, F.Ozdemir
 */
public class GymManager1 {
    
   
    //private static ArrayList<Equipment> equipments = new ArrayList<>();
    private static ArrayList<Customer> customers = new ArrayList<>();
    private static ArrayList<Trainer> trainers = new ArrayList<>();
    private static ArrayList<Cleaner> cleaners = new ArrayList<>();
    private static ArrayList<Admin> admins = new ArrayList<>();
    
    
    // PRİVATE SATATIC ARAYLİST
    
    
    public static boolean addPerson(Customer customer){
        if(customer.getTotal() < customer.getMaxSize()){
            getCustomers().add(customer);
            return true;
        }
        return false;
        
        
    }
    public static boolean addPerson(Trainer trainer){
        if(trainer.getTotal() < trainer.getMaxSize()){
            getTrainers().add(trainer);
            return true;
        }
        return false;
        
        
    }
    public static boolean addPerson(Admin admin){
        if(admin.getTotal() < admin.getMaxSize()){
            getAdmins().add(admin);
            return true;
        }
        return false;
        
        
    }
    public static boolean addPerson(Cleaner cleaner){
        if(cleaner.getTotal() < cleaner.getMaxSize()){
            getCleaners().add(cleaner);
            return true;
        }
        return false;
        
        
    }
    
   
    
    public static void removeCustomers(int index){
       customers.remove(index);
            
       
        
    }
    public static void removeTrainers(int index){
        trainers.remove(index);
        
    }
    public static void removeCleaners(int index){
        cleaners.remove(index);
            
        
       
        
    }
    public static void removeAdmin(int index){
        admins.remove(index);
            
        
        
    }
    
    
    
    
    public static int searchCustomer(String tc){
        
        int index;
        for (int i = 0; i < customers.size(); i++) {
            if(tc.equalsIgnoreCase(customers.get(i).getTc())){
                index = i;
                return index;
            }
            
        }
        return -1;
    }
    public static int searchTrainer(String tc){
        
        int index;
        for (int i = 0; i < trainers.size(); i++) {
            if(tc.equalsIgnoreCase(trainers.get(i).getTc())){
                index = i;
                return index;
            }
            
        }
        return -1;
    }
    public static int searchCleaner(String tc){
        int index;
        for (int i = 0; i < cleaners.size(); i++) {
            if(tc.equalsIgnoreCase(cleaners.get(i).getTc())){
                index =  i;
                return  index;
            }
            
        }
        return -1;
    }
    public static int searchAdmin(String tc){
        int index;
        for (int i = 0; i < admins.size(); i++) {
            if(tc.equalsIgnoreCase(admins.get(i).getTc())){
                index = i;
                return index;
            }
            
        }
        return -1;
    }
    
   
    
    
    
    

    public static ArrayList<Customer> getCustomers(){
        return customers;
    } 
    public static ArrayList<Trainer> getTrainers(){
        return trainers;
    } 
            

    

    /**
     * @return the cleaners
     */
    public static ArrayList<Cleaner> getCleaners() {
        return cleaners;
    }

    /**
     * @return the admins
     */
    public static ArrayList<Admin> getAdmins() {
        return admins;
    }
    
            
       
    
}
