import java.util.Scanner;
class Point {  
     private int x;
     private int y;  

     public Point(int x, int y) { 
     this.x = x;  this.y = y; 
 }  

     public int getX() {
     return x;
}  
     public int getY() {
     return y;
}  
     public double distanceTo(Point p) {  
     return Math.sqrt((x-p.getX())*(x-p.getX())+  (y-p.getY())*(y-p.getY()));  
     }  

     public String toString() {  
     return "("+x+", "+y+")";  
     }  
}  

abstract class Shape{
     protected Point p;

     public Shape(Point p){
          this.p=p;
     }

     public Point getCenter(){
          return p;
     }

     public abstract boolean contains (Point p);

}

class Circle extends Shape {

    private int radius;

    public Circle(int radius, Point cPoint) {
        super(cPoint);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean contains(Point point) {
        return p.distanceTo(point) <= radius;
    }

    public String toString() {
        return "Circle [Center=" + p + ", Radius=" + radius + "]";
    }
}

class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(int length, int width, Point cPoint) {
        super(cPoint);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public boolean contains(Point point) {

        int left = p.getX() - length / 2;
        int right = p.getX() + length / 2;
        int bottom = p.getY() - width / 2;
        int top = p.getY() + width / 2;

        return point.getX() >= left &&
               point.getX() <= right &&
               point.getY() >= bottom &&
               point.getY() <= top;
    }

    public String toString() {
        return "Rectangle [Center=" + p + ", Length=" + length + ", Width=" + width + "]";
    }
}

class ShapesArray {

    private Shape[] shapeList;
    private int nbShapes;

    public ShapesArray(int size) {
        shapeList = new Shape[size];
        nbShapes = 0;
    }

    public boolean addShape(Shape s) {

        if (nbShapes == shapeList.length)
            return false;

        shapeList[nbShapes++] = s;
        return true;
    }

    public int getCircleCounter() {

        int count = 0;

        for (int i = 0; i < nbShapes; i++) {
            if (shapeList[i] instanceof Circle)
                count++;
        }

        return count;
    }

    public double getAvgRectArea() {

        if (nbShapes == 0)
            return 0;

        double total = 0;

        for (int i = 0; i < nbShapes; i++) {

            if (shapeList[i] instanceof Circle) {
                Circle c = (Circle) shapeList[i];
                total += Math.PI * c.getRadius() * c.getRadius();
            } else if (shapeList[i] instanceof Rectangle) {
                Rectangle r = (Rectangle) shapeList[i];
                total += r.getLength() * r.getWidth();
            }
        }

        return total / nbShapes;
    }

    public void displayRectsInfo() {

        for (int i = 0; i < nbShapes; i++) {

            if (shapeList[i] instanceof Rectangle)
                System.out.println(shapeList[i]);
        }
    }

    public void removeAllRect() {

        Shape[] temp = new Shape[shapeList.length];
        int index = 0;

        for (int i = 0; i < nbShapes; i++) {

            if (!(shapeList[i] instanceof Rectangle)) {
                temp[index++] = shapeList[i];
            }
        }

        shapeList = temp;
        nbShapes = index;
    }

    @Override
    public String toString() {

        String str = "";

        for (int i = 0; i < nbShapes; i++) {
            str += shapeList[i] + "\n";
        }

        return str;
    }
}



public class TestShape {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ShapesArray shapes = new ShapesArray(20);

        int choice;

        do {

            System.out.println("\n===== Shape Menu =====");
            System.out.println("1. Add New Shape");
            System.out.println("2. Display All Rectangles");
            System.out.println("3. Display Average Shapes Area");
            System.out.println("4. Display Number of Circles");
            System.out.println("5. Remove All Rectangles");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\na. Rectangle");
                    System.out.println("b. Circle");
                    System.out.print("Choose Shape: ");

                    char type = input.next().charAt(0);

                    if (type == 'a' || type == 'A') {

                        System.out.print("Enter Center X: ");
                        int x = input.nextInt();

                        System.out.print("Enter Center Y: ");
                        int y = input.nextInt();

                        System.out.print("Enter Length: ");
                        int length = input.nextInt();

                        System.out.print("Enter Width: ");
                        int width = input.nextInt();

                        Rectangle r = new Rectangle(length, width, new Point(x, y));

                        if (shapes.addShape(r))
                            System.out.println("Rectangle Added Successfully.");
                        else
                            System.out.println("Array is Full.");

                    } else if (type == 'b' || type == 'B') {

                        System.out.print("Enter Center X: ");
                        int x = input.nextInt();

                        System.out.print("Enter Center Y: ");
                        int y = input.nextInt();

                        System.out.print("Enter Radius: ");
                        int radius = input.nextInt();

                        Circle c = new Circle(radius, new Point(x, y));

                        if (shapes.addShape(c))
                            System.out.println("Circle Added Successfully.");
                        else
                            System.out.println("Array is Full.");

                    } else {
                        System.out.println("Invalid Shape Choice.");
                    }

                    break;

                case 2:

                    System.out.println("\nRectangles Information:");
                    shapes.displayRectsInfo();

                    break;

                case 3:

                    System.out.println("Average Area = " + shapes.getAvgRectArea());

                    break;

                case 4:

                    System.out.println("Number of Circles = " + shapes.getCircleCounter());

                    break;

                case 5:

                    shapes.removeAllRect();
                    System.out.println("All Rectangles Removed.");

                    break;

                case 6:

                    System.out.println("Program Terminated.");

                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 6);

        input.close();
    }
}
