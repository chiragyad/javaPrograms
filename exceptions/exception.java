// import java.util.*;

class Example {

  public static void main(String[] args) {
    // try{
    //     System.out.println(3/0);
    //     System.out.println("In try");
    // } catch(ArithmaticException e){
    //     System.out.println("ArithmeticException: "+ e.getMessage());
    // }

    try {
      int result = 10 / 0;
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException: " + e.getMessage());
    }

    System.out.println("Hello");
  }
}
