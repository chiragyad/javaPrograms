abstract class A{
        abstract void fun1();
    }
 class B extends A{
        void fun1(){
            System.out.println("This is just the function.");
        }
    }
class abstractclass {
    
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        B b=new B();
        b.fun1();
    }
}