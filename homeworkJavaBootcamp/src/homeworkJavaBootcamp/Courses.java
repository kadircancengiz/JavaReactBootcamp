package homeworkJavaBootcamp;

public class Courses {

	public Courses(int courseId, String courseName, String courseDescription, String instructor) {
		this._id = courseId;
		this._name = courseName;
		this._description = courseDescription;
		this._instructor = instructor;

	}

	int _id;
	String _name;
	String _description;
	String _instructor;

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		this._id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		this._description = description;
	}

	public String getInstructor() {
		return _instructor;
	}

	public void setInstructor(String instructor) {
		this._instructor = instructor;
	}

}
