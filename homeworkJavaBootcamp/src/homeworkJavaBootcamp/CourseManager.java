package homeworkJavaBootcamp;

public class CourseManager {

	public void joinTheCourse(Courses courses) {
		System.out.println("Tebrikler! " + courses._name + "'a katılımınız sağlandı.");
	}

	public void leaveTheCourse(Courses courses) {
		System.out.println(courses._name + "'dan ayrıldınız.");
	}

}
