
package circle;
public class Circle {
    
    private double radius;

    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    
    public double getRadius() {
        return radius;
    }

   
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
   
    public void displayInfo() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

   
    public static void main(String[] args) {
        Circle c = new Circle();
      
        c.setRadius(7.5);
      
        c.displayInfo();
    }
}


