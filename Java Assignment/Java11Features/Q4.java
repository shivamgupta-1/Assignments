package Java11Features;
/*
 * Using features of Java 11, read the data from a text file (File name: StudentList.txt).
Calculate the count of students and print the names as well as the total count of
students on the screen. (If any line in file doesn’t contain a name, for such a record
blank space should not be printed in the output) 
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {

	public static void main(String[] args) {
		var path="C:\\Users\\ARROW\\Downloads\\Student.txt";
		String data;
		try {
			data = Files.readString(Path.of(path));
			List<String> list=data.lines().collect(Collectors.toList());
			int count=0;
			for(String str:list) {
				if(str.isBlank()) {
					continue;
				}
				else {
					System.out.println(str);
					count++;
				}
			}
			System.out.println("Total Student is:"+count);
		} 
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
