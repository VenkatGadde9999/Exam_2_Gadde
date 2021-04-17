/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author  Venkateswararao Gadde
 */
public class Circle {
    private double area;
    private boolean isRound;
    private double radius;

    public Circle(double area, boolean isRound, double radius) {
        this.area = area;
        this.isRound = isRound;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "area=" + area + ", isRound=" + isRound + ", radius=" + radius + '}';
    }

   

}
