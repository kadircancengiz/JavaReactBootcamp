package homeworkJavaBootcamp;

public class CourseManager {

	public void joinTheCourse(Courses courses) {
		System.out.println("Tebrikler! " + courses._name + "'a kat�l�m�n�z sa�land�.");
	}

	public void leaveTheCourse(Courses courses) {
		System.out.println(courses._name + "'dan ayr�ld�n�z.");
	}

}
