class parent{
    public static void f1(){
        System.out.println("Hello Parent.");
    }

    // public void f1(){
    //     System.out.println("Hello Parent.");
    // }
}
class child extends parent{
    public static void f1(){
        System.out.println("Hello child");
    }

    // public void f1(){
    //     System.out.println("Good morning guys.");
    // }
}
public class override{
    public static void main(String []args){
        child.f1();
        parent.f1();
    }
}