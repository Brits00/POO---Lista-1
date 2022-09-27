package lista;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        
        Shape p1 = new Shape();
        Rectangle p2 = new Rectangle();
        Circle p3 = new Circle();
        Scanner indice = new Scanner(System.in);
        
        

        System.out.print("Enter the numer of shapes: ");
        int repeat = (int) indice.nextFloat();

        for (int i = 1; i < repeat+1;++i){
            System.out.println("**Shape #"+ i + " data:**");
            System.out.print("Rectangle or Circle (r/c)? ");
            p1.setColor((String) indice.next());
            p1.getColor();


            if (p1.getColor().equals("r")){
                System.out.print("Color (BLACK/BLUE/RED): ");
                p2.setColor((String) indice.next());
                p2.getColor();
                System.out.print("Width: " );
                p2.setWidth(indice.nextDouble());
                p2.getWidth();
                System.out.print("height: ");
                p2.setHeigth(indice.nextDouble());
                p2.getHeigth();

                System.out.println("");
                System.out.println("SHAPE AREAS:");
                System.out.println("");
                System.out.printf("%.2f",p2.getWidth() * p2.getHeigth());
                System.out.println("");
            }
            if (p1.getColor().equals("c")){
                System.out.print("Color (BLACK/BLUE/RED): ");
                p3.setColor((String) indice.next());
                p3.getColor();
                System.out.print("Radius: ");
                p3.setRadius(indice.nextDouble());
                double pi = (double) 3.14f;
                double a = pi * Math.pow(p3.getRadius(),2);
                BigDecimal b = new BigDecimal(a).setScale(2, RoundingMode.HALF_EVEN);
                p3.getRadius();
                
                System.out.println("");
                System.out.println("SHAPE AREAS:");
                System.out.println("");
                System.out.println(b);
                System.out.println("");

            }
            System.out.println("A cor do Retangulo é " + p2.getColor());
            System.out.println("A largura é " + p2.getWidth());
            System.out.println("A altura é " + p2.getHeigth());
    
            System.out.println("A cor do Circulo é " + p3.getColor());
            System.out.println("O Raio é " + p3.getRadius());
        } 
        indice.close();

    }
}
