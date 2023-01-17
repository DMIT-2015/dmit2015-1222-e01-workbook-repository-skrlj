package dmit2015.model;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    // Check Exception
    public void setRadius(double radius) throws Exception {
        if (radius <= 0)
        {
            throw new Exception("Radius must be a positive non-zero number.");
        }
        this.radius = radius;
    }

    // Runtime Exception
//    public void setRadius(double radius) {
//        if (radius <= 0)
//        {
//            throw new RuntimeException("Radius must be a positive non-zero number.");
//        }
//        this.radius = radius;
//    }

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

//    public static void main(String[] args) {
//
//        Circle circle1 = new Circle();
//        System.out.printf("The radius of circle1 is %s \n", circle1.getRadius());
//        System.out.printf("The area of circle1 is %.5f \n", circle1.area());
//        System.out.printf("The perimeter of circle1 %.2f \n", circle1.perimeter());
//
//        try
//        {
//            circle1.setRadius(5);
//
//            System.out.println("The radius of circle1 is " + circle1.getRadius());
//            System.out.printf("The area of circle1 is %.5f \n", circle1.area());
//            System.out.printf("The perimeter of circle1 %.5f \n", circle1.perimeter());
//
//            circle1.setRadius(-25);
//            System.out.println("A exception should have been thrown");
//        }
//        catch (Exception ex)
//        {
//            System.out.println(ex.getMessage());
//        }
//    }
}
