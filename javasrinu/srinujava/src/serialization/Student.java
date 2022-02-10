package serialization;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2987045999488741790L;

	private String StudentName;
	
	//private transient Integer age;// value hideing 
	private  Integer age;
	
	private String[] courses;

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String[] getCourses() {
		return courses;
	}

	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", age=" + age + ", courses=" + Arrays.toString(courses) + "]";
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
 
}
