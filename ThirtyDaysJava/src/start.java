import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class start {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(new File("student.txt"));
		
		List<String> student = new ArrayList<String>();

		
		while(in.hasNextLine()) {
			student.add(in.nextLine());
		}
		
		
		for(int  i = 0; i < student.size(); i++) {
			System.out.println("name: " + student.get(i));
		}
		
		in.close();
		
		
	}

}
