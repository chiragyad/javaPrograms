public class Classroom {

	private String sub1;
	private int stdCount1;
	
	
	public String getSub() {
		return sub1;
	}


	public void setSub(String sub) {
		this.sub1 = sub;
	}


	public int getStdCount() {
		return stdCount1;
	}


	public void setStdCount(int stdCount) {
		this.stdCount1 = stdCount;
	}


	public void displayDetails() {
		System.out.println("This is a " + sub1 + " classroom and it has " + stdCount1 + " students");
	}
    public static void main(String[] args) {
		
		Classroom cs1 = new Classroom();
		
		cs1.setSub("Math");
		cs1.setStdCount(50);
		cs1.displayDetails();
	}
	
}