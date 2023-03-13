package question1_assignment2_3560;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student john = new Student("John", "CS", 3.5);
		Student mary = new Student();
		
		mary.setName("Mary Ann");
		mary.setMajor("CE");
		mary.setGPA(3.3);
		
		System.out.println(john.toString());
		System.out.println(mary.toString());

	}

}
