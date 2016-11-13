
public class corse {

	String corsename;
	student [] stname ;
	
	int stnumber=0;
	
	public corse(int stnumber , String corsename)
	{
		this.corsename= corsename;
		//this.stname=stname;
		this.stnumber=stnumber;
		this.stname=new student[this.stnumber];
	}
	
	public corse(int stnumber , String corsename  , student[] stname )
	{
		this.corsename= corsename;
		//this.stname=stname;
		this.stnumber=stnumber;
		this.stname=new student[this.stnumber];
		for(int i=0;i<stname.length;i++)
			Addstudent(stname[i]);
//		for(int i=0;i<this.stnumber;i++)
//		{
//			if(i<stname.length){
//				this.stname[i]=new student(stname[i].getName(), stname[i].getallgrade());
//			}
//		}
	}
	
	public void Addstudent(student std)
	{
		for(int i=0;i<stnumber;i++)
		{
			if(stname[i]==null)
			{
				stname[i]=new student(std.getName(), std.getallgrade());
				break;
			}
		}
	}
	public void Addstudent(student[] std)
	{
		for(int i=0;i<std.length;i++)
		{
			Addstudent( std[i]);
		}
	}
	
	public   String  printCorse ()
	
	{
		String temp=" corse is: "+ corsename+"\n";
		temp+="capasity is :"+stnumber+"\n";
		for (int i=0; i<stname.length;i++)
		{
			if(stname[i]!=null){
			temp+="student number is "+i+" : "+stname[i].getName();
			for(int j = 0 ;j<stname[i].countgrade();j++)
			{
				temp+=" "+stname[i].getScore(j);
			}
			temp+="\n";
			}
		}
		return  temp;
	}
}
