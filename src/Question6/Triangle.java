/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author 16055
 */
 public class Triangle extends GeometricObject {
        private double FirstSide;
        private double SecondSide;
        private double ThirdSide;
        private String color;
        

    public Triangle(boolean isFilled, String color, double FirstSide, double SecondSide, double ThirdSide) {
        super(isFilled);
        this.FirstSide = FirstSide;
        this.SecondSide = SecondSide;
        this.ThirdSide = ThirdSide;
        this.color=color;
    }

    public double getPerimeter() {
        return ((this.FirstSide + this.SecondSide + this.ThirdSide) / 2);

    }

    public double getArea() {
        double d = this.getPerimeter();
        return (Math.sqrt((d - this.FirstSide) * (d - this.SecondSide) * (d - this.ThirdSide) * d));
    }

    public String toString() {
        return "Area: " + this.getArea() +"\nPerimeter: " + this.getPerimeter() +"\nColor:" + this.color +"\nFilled: " + this.isIsFilled();
    }
}
