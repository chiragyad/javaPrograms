interface shape{
    double area();
    double perimeter(); 
}
class circle implements shape{
    private double radius;
    public circle(double radius){
        this.radius=radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
class rectangle implements shape{
    private double length;
    private double width;
    public rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
}

public class interf{
    public static void main(String []args){
        System.out.println("......................first object.......................");
        rectangle rec=new rectangle(12.5,35.6);
        double area=rec.area();
        double peri=rec.perimeter();
        System.out.println("Area of the given rectangle is "+area + " and the perimeter is "+peri);
        System.out.println("......................Second object.......................");
        circle cir=new circle(12.5);

        double area1=rec.area();
        double peri1=rec.perimeter();
        System.out.println("Area of the given circle is "+area1 + " and the perimeter is "+peri1);
        System.out.println("......................Ending of the program.......................");
    }
}