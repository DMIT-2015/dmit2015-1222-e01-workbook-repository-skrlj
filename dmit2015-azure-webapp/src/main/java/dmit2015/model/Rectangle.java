package dmit2015.model;

public class Rectangle {
    private double length;

    public double getLength() {return length;}

    public void setLength(double length) {
        this.length = length;
    }

    private double width;

    public double getWidth() {return width;}

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
        setWidth(1);
        setLength(1);
    }

    public Rectangle (double width, double length) {setLength(length); setWidth(width);}

    public double area() {return length * width;}

    public double perimeter() {return (2 * width) + (2 * length);}

    public double diagonal() {return Math.sqrt((length * length) + (width * width));}

//    public static void main(String[] args) {
//
//        Rectangle rectangle1 = new Rectangle();
//        System.out.printf("The length of rectangle1 is %s \n", rectangle1.getLength());
//        System.out.printf("The width of rectangle1 is %s \n", rectangle1.getWidth());
//        System.out.printf("The area of rectangle1 is %.5f \n", rectangle1.area());
//        System.out.printf("The perimeter of rectangle1 %.2f \n", rectangle1.perimeter());
//        System.out.printf("The diagonal of rectangle1 %.2f \n", rectangle1.diagonal());
//
//        try
//        {
//            rectangle1.setLength(4);
//            rectangle1.setWidth(2);
//
//            System.out.printf("The length of rectangle1 is %s \n", rectangle1.getLength());
//            System.out.printf("The width of rectangle1 is %s \n", rectangle1.getWidth());
//            System.out.printf("The area of rectangle1 is %.5f \n", rectangle1.area());
//            System.out.printf("The perimeter of rectangle1 %.2f \n", rectangle1.perimeter());
//            System.out.printf("The diagonal of rectangle1 %.2f \n", rectangle1.diagonal());
//        }
//        catch (Exception ex)
//        {
//            System.out.println(ex.getMessage());
//        }
//    }
}

