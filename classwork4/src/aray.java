
public class aray {
	
	int [] i=new int[0];
	public void add(int num)
	{
		int []b=new int [i.length+1];
		for(int j=0 ; j<i.length;j++)
			b[j]=i[j];
		b[i.length]=num;
		i=b;
	}
	public void removie(int num1)
	{
		if(i.length==0 ){
			System.out.println(" go to hell!!!");
		}
		else{
		int []b1=new int [i.length-1];
		for(int j=0,z=0 ; j<i.length;j++)
		{
			if(i[j]!=num1){
			
				b1[z]=i[j];
				z++;
			}
			
		}
		i=b1;
		}
	}
	public int indexof(int num2)
	{
		int index=-1;
	
		for(int j=0 ; j<i.length;j++)
		{
			if(num2==i[j])
			{
				index=j;
				break;
			}
		}
		return index;
	}
	public int lastindex(int num22)
	{
		int index2=-1;
	
		for(int j=i.length-1 ; j>=0;j--)
		{
			if(num22==i[j])
			{
				index2=j;
				break;
			}
			
		}
		return index2;
	}
	public  void  showall() {
		
		for(int j=0 ; j<i.length;j++)
			System.out.println( i[j]);
	}
	

}
