public class Example{
    private int rollNo;
    private String name;

    public void setName(String n){
        name=n;
    } 
    public void setRollNo(int r){
        rollNo=r;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
}
class subExample extends Example{
    Example ex=new Example();
    ex.setName("Dipak Raj");
    ex.setRollNo(152);
    private String collage;
    private String principalName;

    public void setCollage(String c){
        collage=c;

    }
    public String getCollage(){
        return collage;
    }

    public void setPrincipalName(String p){
        principalName=p;
    }

    public String getPrincipalName(){
        return principalName;
    }

    subExample subex=new subExample();
    subex.collage="NIT Silchar";
    subex.principalName="Shivaji Bandopadhyay";
    public void showMe(){
        System.out.println("Name :"+getName());
        System.out.println("RollNo :"+getRollNo());
        System.out.println("Principal Name :"+subex.principalName);
        System.out.println("College Name :"+subex.collage);
        System.out.println("........................Happy Coding.........................");
    }
}

class Jaddu{
    public static void main(String []args){
        subExample ss=new subExample();
        ss.showMe();
    }
}