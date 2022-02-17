package prob2.prob2A;

public class Student {
	
	private String name;
	
	private GradeReport report;
	
	Student(String name,String grade){
		this.name = name;
		report = new GradeReport(this,grade); 
				
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GradeReport getReport() {
		return report;
	}

	public void setReport(GradeReport report) {
		this.report = report;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", report=" + report + "]";
	}

	
	
}
