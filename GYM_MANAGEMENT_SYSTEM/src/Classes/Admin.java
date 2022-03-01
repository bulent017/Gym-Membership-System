/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author bulentoral , F.Ozdemir
 */
public class Admin extends Person implements InterfaceSalary{
    
    private final int admin_salary_coefficient= 30;
    private final int admin_work_day = 22;
    private final int admin_work_hour =7;
    private final int MAX_ADMİN_NUMBER = 100;
    private static int total_admin;
    private String username;
    private String password;
    private WorkProperities work;
    
    public Admin(String username, String password, String tc, String name, String last_name, String phone_number, String date_of_birth, String email, String gender,double salary) {
        super(tc, name, last_name, phone_number, date_of_birth, email, gender);
        work = new WorkProperities(salary);
        this.username = username;
        this.password = password;
        total_admin++;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    @Override
    public double calculateSalary() {
        return admin_salary_coefficient * admin_work_day *admin_work_hour;
    }

    

    @Override
    public int getTotal() {
        return total_admin;
    }

    
    @Override
    public int getMaxSize() {
        return MAX_ADMİN_NUMBER;
    }

    @Override
    public int getWorkHour() {
        return admin_work_hour;
    }

    @Override
    public int getWorkDay() {
        return admin_work_day;
    }

    /**
     * @return the work
     */
    public WorkProperities getWork() {
        return work;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param work the work to set
     */
    public void setWork(WorkProperities work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Username"+username+"\n"+
                "Password"+password+"\n"+
                work.toString();
    }
    
    
    
}
