package Codingplayground.E4;

public class Rectangle {

    private double a;
    private double b;

    public double comArea() {
        double area = a * b;
        return area;
    }

    public double comPeremiter() {
        double peremiter = a * 2 + b * 2;
        return peremiter;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a){
        this.a = a;
    }

    public void setB(double b){
        this.b = b;
    }


    /*
     * void rectagleTo() {
     * int width = 8;
     * int height = 6;
     * int area2 = height * width;
     * int peremiter = height * 2 + width * 2;
     * }
     */

}
