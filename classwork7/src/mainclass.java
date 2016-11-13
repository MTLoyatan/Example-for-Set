
public class mainclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student[] std=new student[3];
		std[0]=new student("ali",2,5,20,5);
		std[1]=new student("reza",2,4,6);
		std[2]=new student();
		std[2].setName("mehdi");
		std[2].setGrade(19,20,20);
		corse cr=new corse(4, "java", std);
		corse cr1=new corse(3, "fizik");
		std[0].setName("gholi");
		student stt=new student("jafar",20);
		cr.Addstudent(stt);
		cr1.Addstudent(stt);
		cr1.Addstudent(std);
		System.out.println(cr.printCorse());
		System.out.println(cr1.printCorse());
		
		System.out.printf("%s\n%s\n","wlecomto","java programming");
		System.out.printf( "%s\n%s\n",         
				"Welcome to", "Java Programming!" );
	}

}
