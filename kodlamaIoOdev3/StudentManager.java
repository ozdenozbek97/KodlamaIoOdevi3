package kodlamaIoOdev3;

public class StudentManager extends UserManager {
	
	
	public void add (Student student) {
		System.out.println(student.getFullName() + " ��renci eklendi");
	}
	
	public void delete(Student student) {
		
		System.out.println(student.getFullName() + "��renci silindi");
	}

}
