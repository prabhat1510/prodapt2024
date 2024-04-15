package classworkdayseventeen.anymatch;

import java.util.Objects;

public class Course {
	 private Integer courseId;
	 private String name;
	public Course(Integer courseId, String name) {
		this.courseId = courseId;
		this.name = name;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(courseId, other.courseId);
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + "]";
	}
	 
}
