import java.util.Comparator;


public class EmpCompareble  implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		int lastnameresult=emp1.getLname().compareTo(emp2.getLname());
		if(lastnameresult!=0)
			return lastnameresult;
		int firstnameresult=emp1.getFname().compareTo(emp2.getFname());
		if(firstnameresult!=0)
			return firstnameresult;
		return emp1.getId()-emp2.getId();
		
	}



	
	

}
