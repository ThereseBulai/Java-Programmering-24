package Codingplayground.E4;

public class Circle {

    private double radius;


    public double comArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    public double comCircumference() {
        double circumference = radius * 2 * Math.PI;
        return circumference;
    }

    public double getRadius(){
    return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }





    /*
     * double circleTo() {
     * int width = 4;
     * double circumference = Math.pow((width / 2), 2) * Math.PI;
     * double area1 = width / 2 * Math.PI;
     * return area1;
     * }
     */

}
