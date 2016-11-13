
public class mainclasstest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student std[]=new student[2];
		std[0]=new student();
		std[1]=new student();
		std[0].setName("ali");
		std[1].setName("mehdi");
		
		System.out.println(std[0].getName()+" *** "+std[1].getName());
		
		std[0].setGrade(2);
		std[0].setScore(0, 8);
		std[0].setGrade(15,17);
		int[] b={5,9,20};
		std[1].addGrade(b);

		
		System.out.println(std[0].getScore(0)+" *** "+std[1].getScore(0));
		System.out.println(std[0].getScore(1)+" *** "+std[1].getScore(1));
		System.out.println(std[0].getScore(2)+" *** "+std[1].getScore(2));
		System.out.println(Math.round(std[0].getAvreage())+" *** "+Math.round(std[1].getAvreage()));
		
		
		
		
		student std3=new student("maryam",4,2,20);
		System.out.println(std3.getName()+" *** "+std3.getScore(0)+
				" *** "+std3.getScore(1)+" *** "+std3.getScore(2)+
				" *** "+Math.round(std3.getAvreage())+" *** ");
		
	}

}
