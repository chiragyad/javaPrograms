class A{
    public void f1(){
        int x;
    }
}
class B extends A{
    int x;
    public void f2(){
        int x;
        this.x=10;
        x=12;
        // super.x=13;
    }
}
public class example{
    public static void main(String []args){
        B obj=new B();
        System.out.println("B class value of x is:-->"+ obj.x);
        // System.out.println("B class value of x is:-->"+ obj.x);
        // System.out.println("B class value of x is:-->"+ obj.x);
    }
}