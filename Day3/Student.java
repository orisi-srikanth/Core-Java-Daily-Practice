package Day3;
public class Student implements Comparable<Student> {
			int id;
			String name;
			double cgpa;
		public Student(int id,String name,double cgpa) {
			this.id=id;
			this.name=name;
			this.cgpa=cgpa;
		}
		public int compareTo(Student other) {
			return Double.compare(this.cgpa,other.cgpa);
		}
		public String toString() {
			return "[ "+"id:"+id+ "name: "+name+ " cgpa: "+cgpa+ "]";
		}
}
