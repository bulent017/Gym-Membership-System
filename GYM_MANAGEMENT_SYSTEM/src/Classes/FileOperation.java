/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Jframes.GymManager1;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author bulentoral,F.Ozdemir
 */
public class FileOperation {
    
    
    public static void saveToFileTrainer(){
        
        try{
            FileOutputStream file = new FileOutputStream("Trainer.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for (int i = 0; i < GymManager1.getTrainers().size(); i++) {
                
                outputFile.writeObject(GymManager1.getTrainers().get(i));
                
            }
            outputFile.close();
            JOptionPane.showMessageDialog(null, "Successfully Saved");
           
            
            
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }

    public static void  saveToFileCustomers(){
        
        try{
            FileOutputStream file = new FileOutputStream("Customer.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for (int i = 0; i < GymManager1.getCustomers().size(); i++) {
                
                outputFile.writeObject(GymManager1.getCustomers().get(i));
                
            }
            outputFile.close();
            JOptionPane.showMessageDialog(null, "Successfully Saved");
              
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
         
    }
    
    public static void saveToFileCleaner(){
        
        try{
            FileOutputStream file = new FileOutputStream("Cleaner.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for (int i = 0; i < GymManager1.getCleaners().size(); i++) {
                
                outputFile.writeObject(GymManager1.getCleaners().get(i));
                
            }
            outputFile.close();
            JOptionPane.showMessageDialog(null, "Successfully Saved");
              
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
    }
    
    public  static void saveToFileAdmin(){
        try{
            FileOutputStream file = new FileOutputStream("admin.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for (int i = 0; i < GymManager1.getAdmins().size(); i++) {
                
                outputFile.writeObject(GymManager1.getAdmins().get(i));
                
            }
            outputFile.close();
            JOptionPane.showMessageDialog(null, "Successfully Saved");
              
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
    }
    public static void populateAdminArraylist(){
        
        try{
            FileInputStream file2 = new FileInputStream("admin.dat"); 
            ObjectInputStream inputFile4 = new ObjectInputStream(file2);
            
            boolean endOfFile = false;
            while(!endOfFile){
                try{
                    GymManager1.getAdmins().add((Admin)inputFile4.readObject());
                }
                catch(EOFException e){
                    endOfFile = true;
                }
                catch(Exception f){
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
                        
            }
            inputFile4.close();
            
        }
        catch(IOException e){
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
    }
    
     public static ArrayList<Customer> populateCustomers2(){
        
        ArrayList<Customer> customers= new ArrayList<Customer>();
        try{
            FileInputStream file2 = new FileInputStream("Customer.dat"); // dosyadan okuduk
            ObjectInputStream inputFile2 = new ObjectInputStream(file2);
            
            boolean endOfFile = false;
            while(!endOfFile){
                try{
                     
                      customers.add((Customer)inputFile2.readObject());
                }
                catch(EOFException e){
                    endOfFile = true;
                }
                catch(Exception f){
                   
                }
                        
            }
            inputFile2.close();
            
        }catch(IOException e){
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return customers;
    }
    public static void populateCustomers(){
        
        try{
            FileInputStream file2 = new FileInputStream("Customer.dat"); // dosyadan okuduk
            ObjectInputStream inputFile2 = new ObjectInputStream(file2);
            
            boolean endOfFile = false;
            while(!endOfFile){
                try{
                     
                             GymManager1.getCustomers().add((Customer)inputFile2.readObject());
                     
                    
                }
                catch(EOFException e){
                    endOfFile = true;
                }
                catch(Exception f){
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
                        
            }
            inputFile2.close();
            
        }catch(IOException e){
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    public static ArrayList<Trainer> populateTrainers2(){
        ArrayList<Trainer> trainers= new ArrayList<Trainer>();
        try{
            FileInputStream file = new FileInputStream("Trainer.dat"); 
            ObjectInputStream inputFile1 = new ObjectInputStream(file);
            
            boolean endOfFile = false;
            while(!endOfFile){
                try{
                    trainers.add((Trainer)inputFile1.readObject());
                }
                catch(EOFException e){
                    endOfFile = true;
                }
                catch(Exception f){
                  JOptionPane.showMessageDialog(null, f.getMessage());
                }
                        
            }
            inputFile1.close();
            
        }
        catch(IOException e){
            
        }
        return trainers;
    }
    public static void populateTrainer(){
        try{
            FileInputStream file = new FileInputStream("Trainer.dat"); 
            ObjectInputStream inputFile1 = new ObjectInputStream(file);
            
            boolean endOfFile = false;
            while(!endOfFile){
                try{
                    GymManager1.getTrainers().add((Trainer)inputFile1.readObject());
                }
                catch(EOFException e){
                    endOfFile = true;
                }
                catch(Exception f){
                  JOptionPane.showMessageDialog(null, f.getMessage());
                }
                        
            }
            inputFile1.close();
            
        }
        catch(IOException e){
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    
     public static ArrayList<Cleaner> populateCleaners2(){ 
        // cleaner ları okuyoruz
         ArrayList<Cleaner> cleaners= new ArrayList<Cleaner>();
        try{
            FileInputStream file2 = new FileInputStream("Cleaner.dat"); 
            ObjectInputStream inputFile3 = new ObjectInputStream(file2);
            
            boolean endOfFile = false;
            while(!endOfFile){
                try{
                    cleaners.add((Cleaner)inputFile3.readObject());
                }
                catch(EOFException e){
                    endOfFile = true;
                }
                catch(Exception f){
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
                        
            }
            inputFile3.close();
            
        }
        catch(IOException e){
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return cleaners;
    }
    public static void populateCleaner(){
        
        try{
            FileInputStream file2 = new FileInputStream("Cleaner.dat"); 
            ObjectInputStream inputFile3 = new ObjectInputStream(file2);
            
            boolean endOfFile = false;
            while(!endOfFile){
                try{
                    GymManager1.getCleaners().add((Cleaner)inputFile3.readObject());
                }
                catch(EOFException e){
                    endOfFile = true;
                }
                catch(Exception f){
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
                        
            }
            inputFile3.close();
            
        }
        catch(IOException e){
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
   
     public static void saveCustomersToFileDelete(){
        try{
            FileOutputStream file = new FileOutputStream("Customer.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for (int i = 0; i < GymManager1.getCustomers().size(); i++) {
                
                outputFile.writeObject(GymManager1.getCustomers().get(i));
                
            }
            outputFile.close();
            JOptionPane.showMessageDialog(null, "Successfully Deleted");
            
            
            
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
    }
     public static void saveTrainersToFileDelete(){
        try{
            FileOutputStream file = new FileOutputStream("Trainer.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for (int i = 0; i < GymManager1.getTrainers().size(); i++) {
                
                outputFile.writeObject(GymManager1.getTrainers().get(i));
                
            }
            outputFile.close();
            JOptionPane.showMessageDialog(null, "Successfully Deleted");
            
            
            
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
    }
     public static void saveCleanarToFileDelete(){
        try{
            FileOutputStream file = new FileOutputStream("Cleaner.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for (int i = 0; i < GymManager1.getCleaners().size(); i++) {
                
                outputFile.writeObject(GymManager1.getCleaners().get(i));
                
            }
            outputFile.close();
            JOptionPane.showMessageDialog(null, "Successfully Deleted");
            

            
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
    }
    
    
    
     
            
}
