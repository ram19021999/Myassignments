package week3.day1;

public class Students {
	
	public void getStudentinfo(int id) {
		
	System.out.println(id);	
	
	}
	
	public void getStudentinfo(int id,String name) {
		
		System.out.println("my id is" + id + name);	
		
		}
	
	public void getStudentinfo(String email,long phone) {
		
		System.out.println( email + "My phonenumber :"+ phone);	
		
		}
	
	public static void main(String[] args) {
		
		Students obj=new Students();
		
		obj.getStudentinfo(1234);
		obj.getStudentinfo(12345,"Ram");
		obj.getStudentinfo(null, 0);
		
		
		
	}

}
