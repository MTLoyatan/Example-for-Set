
public abstract   class Teacher extends Person {
	
	
	protected  String  coursNAme;
	
	
	public Teacher(){
		this("","","","");
	}
	
	
	
	public Teacher(String coursname){
		this("","","",coursname);
	}

	public Teacher(Teacher teacher){
		
		this(teacher.getFirstNAme(),teacher.getLastNAme(),
				teacher.getIdNUmber(),teacher.getCoursNAme());
	}
	public Teacher( String firstname,String lastname,String idnumber,String coursNAme) {
		super(firstname,lastname,idnumber);
		setCoursNAme(coursNAme);
	}

	public String getCoursNAme() {
		return coursNAme;
	}

	public void setCoursNAme(String coursNAme) {
		this.coursNAme = coursNAme.trim();
	}

	@Override
	public String toString() {
		return  String.format("%s%16s%s\n", 
				super.toString(),
				"Coursname: ",getCoursNAme());
		
	}
	
	public abstract double ernings();
	
	
}
