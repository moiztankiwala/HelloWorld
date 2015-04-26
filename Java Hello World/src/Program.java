import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Abid
 *
 */
public class Program {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Enter any character:");

		try{
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

			bufferRead.read();

			Student student = new Student("Moiz", "Tankiwala");
			student.PrintFullName();
			
			bufferRead.read();
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
