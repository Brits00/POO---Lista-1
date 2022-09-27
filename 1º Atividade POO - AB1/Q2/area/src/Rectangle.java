import java.util.Locale;
import java.util.Scanner;


public class Rectangle {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();


        System.out.println("Enter rectangle width and height:");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();
        System.out.printf("AREA = %.2f%n", rect.area(rect));
        System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
        sc.close();
    }


    private Object diagonal() {
        double b = Math.pow(height,2);
        double c = Math.pow(width,2);
        double a = b + c;
        return Math.sqrt(a);
    }

    private Object perimeter() {
        double d = width;
        double e = height;
        return 2 * (d + e);
    }

    private Object area(Rectangle rect) {
        return rect.width * rect.height;
    }
}
       
