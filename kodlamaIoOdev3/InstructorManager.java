package kodlamaIoOdev3;

public class InstructorManager extends UserManager{
	
	public void add (Instructor instructor) {
		System.out.println(instructor.getFullName() + " Eðitmen eklendi");
	}
	
	public void delete(Instructor instructor) {
		
		System.out.println(instructor.getFullName() + "Eðitmen silindi");
	}


}
