
public class GraduatedStudent  extends Student {
 	
	private String Gdate;
	
	private boolean deptStatusl;
	
	

	public GraduatedStudent(String course, String gdate, boolean deptStatusl) {
		super(course);
		setGdate(gdate);
		setDeptStatusl(deptStatusl);
	}

	public String getGdate() {
		return Gdate;
	}

	public void setGdate(String gdate) {
		Gdate = gdate;
	}

	public boolean isDeptStatusl() {
		return deptStatusl;
	}

	public void setDeptStatusl(boolean deptStatusl) {
		this.deptStatusl = deptStatusl;
	}

	@Override
	public boolean status() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person getinfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
