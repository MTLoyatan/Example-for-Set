

public class corseprac {
	
		String coursname;
		int capasity=0;
		student[] students;
		
		public corseprac()
		{
			
			setCoursname("");
			this.capasity=0;
			students= new student[this.capasity ];
		}
		
		public corseprac(String coursname, int capasity, student[] students )
		{
			setCoursname(coursname);
			setCapasity(capasity);
			for(int i=0;i<capasity;i++ )
			{
				addstudent(students[i]);
			}
		}

		public String getCoursname() {
			return coursname;
		}

		public void setCoursname(String coursname) {
			this.coursname = coursname;
		}

		public int getCapasity() {
			return capasity;
		}

		public void setCapasity(int capasity) {
			this.capasity = capasity;
		}
		
		public void addstudent( student std)
		{
			for( int i=0; i<students.length;i++)
			{
				students[i]= new student(std.getName(),std.getallgrade());
			}
		}
		
		public void addstudent(student[] std)
		{
			for ( int i=0;i<std.length;i++)
			{
				addstudent(std[i]);
			}
		}
}			


