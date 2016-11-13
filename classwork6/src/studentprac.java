
public class studentprac {
	String name;
	 int[] score;
	 
	 public studentprac()
	 {
		 setName("");
		  score= new int[0];
	 }
	
	 public  studentprac(String name, int...grade1 )
	 {
		setName(name);
		score= new int[0];
		addGrade(grade1);
	 }

	public String getName() {
		return name.toUpperCase();
	}

	public void setName(String name) {
		this.name = name.trim();
	}

	public int getScore(int index ) {
		return score[index];
	}

	public void setScore(int index , int grade) {
		this.score[index] = grade;
	}
	 public void addGrade( int grade)
	 {
		 
		 int temp[]= new int[score.length];
		 for (int i=0; i<score.length;i++)
		 {
			 temp[i]=score[i];
		 }
		 temp[score.length]=grade;
		 score=temp;
	 }
	 public void addGrade( int[] grade)
	 {
		 for ( int i=0; i<grade.length;i++)
		 {
			 addGrade(grade[i]);
		 }
	 }
	 public void setGrade(int...grade)
	 {
		 addGrade(grade);
	 }
	 public int[] getAllgrade()
	 {
		 return score;
	 }
	 public int countgrade()
	 {
		 return score.length;
	 }
}
