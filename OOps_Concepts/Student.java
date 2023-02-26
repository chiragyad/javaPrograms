public class Student{
	
	void showMe(int a){
		System.out.println("Students is the first student");
	}

	void showMe(int a,int b){
		System.out.println("Students is the second student");
	}
	
	void showMe(){
		System.out.println("Students is the first student");
	}

	public static void main(String[] args){
		Student st=new Student();
		st.showMe(10);
		st.showMe(12,23);
		st.showMe();
	}

}