package Day3;
import java.util.*;

public class StudentTest {
	public static void main(String[] args) {
		List<Student>Students=new ArrayList<>();
		Students.add(new Student(1,"ram",9.1));
		Students.add(new Student(2,"ravi",8.1));
		Students.add(new Student(3,"raj",7.1));
		Collections.sort(Students);
		ListIterator<Student> it=Students.listIterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println(s);
		}
	}

}
