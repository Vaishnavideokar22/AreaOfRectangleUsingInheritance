class Shape{
    public void GetArea(){
        System.out.println("Hello from Shape:");
    }
}
class Rectangle extends Shape{
    double area;
    double length;
    double width;
    Rectangle( double l ,double w){
        this.length = l;
        this.width = w;
    }
    public void GetArea(){
        area = length*width;
        System.out.println("Area of rectangle is :" + area);
    }

}

 public class AreaOfRectangle {

    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle(4,7);
        r1.GetArea();
    } 

    
}
