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
public class Staff extends Employee  {
        private String title;

    public Staff(String title, String office, double salary, 
            Date dateHired, String name, String address, 
            long phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, 
                phoneNumber, emailAddress);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
   public String toString() {
        return "Person belongs to" + this.getClass().getName() + "class is "
                + super.getName();
    }

}
