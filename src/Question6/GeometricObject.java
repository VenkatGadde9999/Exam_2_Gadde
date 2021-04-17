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
    public abstract class GeometricObject {
        private boolean isFilled;
       

    public GeometricObject(boolean isFilled) {
        this.isFilled = isFilled;
      
    }
    public boolean isIsFilled() {
        return isFilled;
    }

   
    public abstract double getArea();
    public abstract double getPerimeter();

}
