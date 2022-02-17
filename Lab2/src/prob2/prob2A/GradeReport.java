package prob2.prob2A;

public class GradeReport {

	private Student student;
	
	private String grade;
	
	public GradeReport(Student student, String grade) {
		this.student = student;
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "GradeReport [student=" + student + ", grade=" + grade + "]";
	}
	
	
}
