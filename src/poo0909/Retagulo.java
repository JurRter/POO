package poo0909;

public class Retagulo {
 
    double width;
    double height;
    public double area() {
        return width* height;
    }
    public double perimeter() {
    return 2*(width + height);
    }
    public double diagonal() {
    return Math.sqrt(width * width + height * height);
    }
    public static void main(String[] args) {
        
    }
}
