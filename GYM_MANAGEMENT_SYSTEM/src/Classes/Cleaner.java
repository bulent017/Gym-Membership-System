/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author bulentoral, F.Ozdemir
 */
public class Cleaner  extends Person implements InterfaceSalary{

    /**
     * @param aggrement the aggrement to set
     */
    public void setAggrement(int aggrement) {
        this.aggrement = aggrement;
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
    
    private final int cleaner_salaray_coefficient=25;
    private final int cleaner_work_day = 22;
    private final int cleaner_work_hour = 6;
    private final int MAX_CLEANER_NUMBER = 100;
    private static int total_cleaner;
    private WorkProperities work;
    private int aggrement;
    
    public Cleaner( int aggrement, String tc, String name, String last_name, String phone_number, String date_of_birth, String email, String gender,double salary) {
        super(tc, name, last_name, phone_number, date_of_birth, email, gender);
        work = new WorkProperities(salary);
        this.aggrement = aggrement;
        
        total_cleaner++;
    }

    @Override
    public double calculateSalary() {
        return cleaner_work_day * cleaner_work_hour * cleaner_salaray_coefficient;
    }
    

    

    /**
     * @return the aggrement
     */
    public int getAggrement() {
        return aggrement;
    }

    @Override
    public int getTotal() {
        return total_cleaner;
    }

  

    @Override
    public int getMaxSize() {
        return MAX_CLEANER_NUMBER;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Agreement : "+aggrement+"\n"+
                getWork().toString();
        
    }

    @Override
    public int getWorkHour() {
        return cleaner_work_hour;
    }

    @Override
    public int getWorkDay() {
        return cleaner_work_day;
    }
    
    
    
    
}
