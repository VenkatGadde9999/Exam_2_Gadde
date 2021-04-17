/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author 16055
 */
public class Student extends Person {

   
    
    private double grade;
    public static final String CLASS_STATUS = "Graduate";

     public Student(double grade, String name, String address, long phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

@Override
    public String toString() {
        return "Person belongs to" + this.getClass().getName() + "class is "
                + super.getName();
    }

}
