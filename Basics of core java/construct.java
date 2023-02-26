/* Online Java Compiler and Editor */

public class construct {
     static class parent {
       public parent(){
           System.out.println("parent constructor of your child.");
       }
    }
static class child extends parent {
    // super();
        public child(){
            System.out.println("constructor of child class.");
        }
    }
    public static void main(String []args) {
        child ch=new child();
    }
}