 class Box{
    private int length,breadth,height;
    public void setDimension(int l, int b, int h){
        length=l;
        breadth=b;
        height=h;
    }
    public void showDimension(){
        System.out.println("Lenght="+length);
        System.out.println("Breadth="+breadth);
        System.out.println("Height="+height);
    }
}
 class Example{
    public static void main(String[] args){
        Box box=new Box();
        box.setDimension(10,12,5);
        box.showDimension();

        box=new Box();
        box.showDimension();
    }
}