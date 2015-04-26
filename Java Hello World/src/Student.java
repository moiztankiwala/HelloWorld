/**
 * 
 */

/**
 * @author Abid
 *
 */
public class Student {
	public String FirstName = Constant.EMPTY;
	public String LastName = Constant.EMPTY;
	
	public Student(String firstName, String lastName){
		this.FirstName = firstName;
		this.LastName = lastName;
	}
	
	private String GetFullName(){
		return this.FirstName + " " + this.LastName;
	}
	
	public void PrintFullName(){
		System.out.print(this.GetFullName());
	}
}
