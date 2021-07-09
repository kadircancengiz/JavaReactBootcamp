package homeworkJavaBootcamp;

public class Main {

	public static void main(String[] args) {

		Courses courses1 = new Courses(1, "Yaz�l�m Kamp� (JAVA & REACT)", "A��klama", "Engin Demiro�");
		Courses courses2 = new Courses(2, "Yaz�l�m Kamp� ( C# & ANGULAR)", "A��klama", "Engin Demiro�");

		System.out.println("T�M KURSLAR");

		Courses[] coursesArray = { courses1, courses2 };

		for (Courses courses : coursesArray)
			System.out.println(courses._name + " " + courses._description + " " + courses._instructor + " ");

		System.out.println("*************************************************************** ");

		CourseManager courseManager = new CourseManager();
		courseManager.joinTheCourse(courses1);
		courseManager.joinTheCourse(courses2);

		courseManager.leaveTheCourse(courses1);
		courseManager.leaveTheCourse(courses2);
	}

}
