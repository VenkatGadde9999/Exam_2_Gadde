/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;
import java.util.Date;
/**
 *
 * @author  Venkateswararao Gadde
 */
public class Faculty extends Employee  {
    
        private int officeHours;
    private int numberTeachingSubjects;

    public Faculty(int officeHours, int numberTeachingSubjects,
            String office, double salary, Date dateHired, String name,
            String address, long phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber,
                emailAddress);
        this.officeHours = officeHours;
        this.numberTeachingSubjects = numberTeachingSubjects;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public int getNumberTeachingSubjects() {
        return numberTeachingSubjects;
    }

    public void setNumberTeachingSubjects(int numberTeachingSubjects) {
        this.numberTeachingSubjects = numberTeachingSubjects;
    }

    @Override
   public String toString() {
        return "Person belongs to" + this.getClass().getName() + "class is "
                + super.getName();
    }

}
