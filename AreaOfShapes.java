class Shape{
    public void area(){
        System.out.println("Area Cals");
    }
}

class Rectangle extends Shape{
    int l= 10, b = 5;
    int c = l*b;
    public void area(){
        System.out.println("Area of Rectangle: "+c);
    }
}

class Triangle extends Shape{
    int b= 6, h = 4;
    int c = b*h/2;
    public void area(){
        System.out.println("Area of Triangle: "+c);
    }
}

class Square extends Shape{
    int s = 5;
    int c = s*s;
    public void area(){
        System.out.println("Area of Square: "+c);
    }
}

class Rhombus extends Shape{
    int d1 = 8 , d2 = 6;
    int c = d1*d2/2;
    public void area(){
        System.out.println("Area of Rhombus: "+c);
    }
}
public class AreaOfShapes{
    public static void main (String[] args) {
        Shape s1 = new Rectangle();
        s1.area();
        
        s1 = new Triangle();
        s1.area();
        
        s1 = new Square();
        s1.area();
        
        s1 = new Rhombus();
        s1.area();
    }
}
