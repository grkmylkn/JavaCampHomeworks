
public class StudentManager extends UserManager {

	@Override
	public void żnformationAboutUser(User user) {
		super.żnformationAboutUser(user);
		System.out.println("Courses of student:");
		for(String course : user.getCoursesUser()) {
			System.out.println(course);
		}
	}
	
}
