import java.util.*;
public class addandremovearray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner pp = new Scanner(System.in);
		int [] i=new int[0];
		int req;
		aray x=new aray();
		
		do
		{
			
			
			System.out.println("1. add:");
			System.out.println("2. remove:");
			System.out.println("3. show all:");
			System.out.println("4. return index:");
			System.out.println("5. return lastindex:");
			System.out.println("6.exit:");
			req= pp.nextInt();
			
			switch (req) {
			case 1:
				//add 
				int num= pp.nextInt();
				x.add(num);
				/*int []b=new int [i.length+1];
				for(int j=0 ; j<i.length;j++)
					b[j]=i[j];
				b[i.length]=num;
				i=b;*/
				break;

			case 2:
				//remove 
				//if(i.length==0 )
				//	System.out.println(" go to hell!!!");
			//	else{	
				int num1= pp.nextInt();
				x.removie(num1);
				//int []b1=new int [i.length-1];
				//for(int j=0,z=0 ; j<i.length;j++)
				//{
			//		if(i[j]!=num1){
					
			//			b1[z]=i[j];
			//			z++;
			//		}
					
		//		}
		//		i=b1;
		//		}
				break;
			case 3:
			//	for(int j=0 ; j<i.length;j++)
			//		System.out.println( i[j]);
				//show all
				x.showall();
				break;
			case 4://index
				int num2= pp.nextInt();
				/*int index=-1;
				
				for(int j=0 ; j<i.length;j++)
				{
					if(num2==i[j])
					{
						index=j;
						break;
					}
				}*/
				System.out.println(x.indexof(num2));
				
				break;
			case 5:
				//last index
			//	int index2=-1;
				int num22= pp.nextInt();
			/*	for(int j=i.length-1 ; j>=0;j--)
				{
					if(num22==i[j])
					{
						index2=j;
						break;
					}
					
				}*/
				System.out.println(x.lastindex(num22));
				break;
			case 6:
				//exit
				return;
				
			}
		}while(true);
	}

}
