
public class InstructorManager extends UserManager{
	
	@Override
	public void żnformationAboutUser(User user) {
		super.żnformationAboutUser(user);
		System.out.println("Courses of żnstructor:");
		for(String course : user.getCoursesUser()) {
			System.out.println(course);
		}
	}
}
