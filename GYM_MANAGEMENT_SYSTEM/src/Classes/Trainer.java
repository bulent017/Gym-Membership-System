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
public class Trainer extends Person implements InterfaceSalary{

    /**
     * @return the aggrement
     */
    public int getAggrement() {
        return aggrement;
    }
    
    private final int trainer_salary_coefficient= 35;
    private final int trainer_work_day = 26;
    private final int trainer_work_hour = 8;
    private final int MAX_TRAİNER_NUMBER = 100;
    private static int total_trainer = 0;
    private WorkProperities work;
    
    private int aggrement;
    

    
    
    public Trainer(int aggrement, String tc, String name, String last_name, String phone_number, String date_of_birth, String email, String gender,double salary ) {
        super(tc, name, last_name, phone_number, date_of_birth, email, gender);
        this.work = new WorkProperities(salary);
        //this.trainer_field = trainer_field;
        this.aggrement = aggrement;
        
        total_trainer++;
    }


    @Override
    public double calculateSalary() {
        return trainer_salary_coefficient * trainer_work_hour * trainer_work_day;//monthly fee calculation;
    }

    @Override
    public String toString() {
        return super.toString() +"\n"+
                
                "Agreement: "+ getAggrement()+"\n"+
                getWork().toString();
                
    }

    

    

    

    @Override
    public int getTotal() {
        return total_trainer;
    }

    
    @Override
    public int getMaxSize() {
        return MAX_TRAİNER_NUMBER;
    }
    

    /**
     * @param aggrement the aggrement to set
     */
    public void setAggrement(int aggrement) {
        this.aggrement = aggrement;
    }

    @Override
    public int getWorkHour() {
        return trainer_work_hour;
        
        
    }    @Override
    public int getWorkDay() {
        return trainer_work_day;
    }

    /**
     * @return the work
     */
    public WorkProperities getWork() {
        return work;
    }

    /**
     * @param work the work to set
     */
    public void setWork(WorkProperities work) {
        this.work = work;
    }

    
}
