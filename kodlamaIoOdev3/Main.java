package kodlamaIoOdev3;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		
		student.setId(1);
		student.setFisrtName("�zden");
		student.setLastName("�zbek");
		student.setEmail("sadasda@gmail.com");
		student.setPassword("12CCC15VVV");
		student.setCoursesTheStudentTook("");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFisrtName("Eda");
		instructor.setLastName("Ayd�n");
		instructor.setEmail("klklklkl@gmail.com");
		instructor.setPassword("36sadas85");
		instructor.setLessonGivenByTheInstructor("Java");

		User[] users = { student, instructor };


		UserManager studentManager = new StudentManager();
		UserManager instructorManager = new InstructorManager();

		studentManager.add(student);
		instructorManager.add(instructor);
		
		
		
	}

}
