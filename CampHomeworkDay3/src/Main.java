
public class Main {

	public static void main(String[] args) {
		User student1 = new Student(1,"Görkem","Yelken","gorkemyelken@gmail.com");
		User ınstructor1 = new Instructor(1,"Engin","Demiroğ");
		String[] coursesOfStudent1 = {"C#"};
		student1.setCoursesUser(coursesOfStudent1);
		String[] coursesOfInstructor1 = {"C#","Java"};
		ınstructor1.setCoursesUser(coursesOfInstructor1);
		
		
		StudentManager studentManager = new StudentManager();
		InstructorManager ınstructorManager = new InstructorManager();
		studentManager.ınformationAboutUser(student1);
		ınstructorManager.ınformationAboutUser(ınstructor1);
		
		
	}

}
