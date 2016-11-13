
public abstract	class Student extends Person  {
	
	protected String course;
	protected String interanceYear;
	protected double average;
	
	
	public Student(String course){
		this("","","",course,"",0.0);
	}
	
	public Student(double average){
		this("","","","","",average);
	}
	
	public Student(Student student){
		
		this(student.getFirstNAme(),student.getLastNAme(),student.getIdNUmber(),
				student.getCourse(), student.getInteranceYear(),student.getAverage());
	}
	
	public Student(String firstname,String lastname ,
			String idnumber,String course, String interanceYear, double average) {
		super(firstname,lastname,idnumber);
		setCourse(course);
		setInteranceYear(interanceYear);
		setAverage(average);
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getInteranceYear() {
		return interanceYear;
	}
	public void setInteranceYear(String interanceYear) {
		this.interanceYear = interanceYear;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}

	@Override
	public String toString() {
		return  String.format("%s%16s%s%16s%s%16s%.2f", 
				super.toString(),
				"course:",getCourse(),
				"interanceYear:",getInteranceYear(),
				"avarage:",getAverage());
	}
	
	public abstract  boolean status();
		
		
}
