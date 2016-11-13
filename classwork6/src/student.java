import java.util.Arrays;
import java.util.Scanner;


public class student {
	
	
	private String name;
	private int []score;
	
	
	public student()
	{
		setName("");
		score=new int[0] ;
		
	}
	public student(String name ,int... grade1)
	{
		setName(name);
		score=new int[0] ;	
		addGrade( grade1);

	}

	public int getScore(int index) {
		
		
		return score[index];
	}

	public void setScore(int index, int grade) {
		
		if(grade<=20&&grade>=0)
			this.score[index] = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
	
		this.name = name.trim();
	}
	public double getAvreage()
	{
		double avg=0;
		
		for(int i=0 ; i<score.length;i++)
			avg+=getScore(i);
		return avg/score.length;
	
	}
	private void addGrade(int grade){
		
		if(grade<=20&&grade>=0){
			int []tempgrade=new int [score.length+1];
			for (int i = 0; i < score.length; i++) {
				tempgrade[i]=score[i];
			}
	
		tempgrade[score.length]=grade;
		score=tempgrade;
		}
		}
	
public void addGrade(int grade[]){
		
		for (int i = 0; i < grade.length; i++) {
			addGrade(grade[i]);
		}
		}
public void setGrade(int ...grade){
	addGrade(grade);
}

}
