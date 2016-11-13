
public abstract class Person {
	
	protected String firstNAme;
	protected String lastNAme;
	protected String idNUmber;
	
      public Person() {
		
		this("","","");
	    }

	public Person (String id){
		this("","",id);
	}
      
	public Person(Person person){
		this(person.getFirstNAme(),person.getLastNAme(),person.getIdNUmber());
	}
	
	public Person(String firstNAme, String lastNAme, String idNUmber) {
		super();
		setFirstNAme(firstNAme);
		setLastNAme(lastNAme);
		setIdNUmber(idNUmber);
	}
	
	public String getFirstNAme() {
		return firstNAme;
	}
	public void setFirstNAme(String firstNAme) {
		this.firstNAme = firstNAme.trim();
	}
	public String getLastNAme() {
		return lastNAme;
	}
	public void setLastNAme(String lastNAme) {
		this.lastNAme = lastNAme.trim();
	}
	public String getIdNUmber() {
		return idNUmber;
	}
	public void setIdNUmber(String idNUmber)
	{
		
		this.idNUmber = idNUmber.trim();
	}

	@Override
	public String toString() {
		return  String.format("%16s%s\n%16s%s\n%16s%s\n", 
				"firstname: ",getFirstNAme(),
				"lastname: ",getLastNAme(),
				"idnumber: ",getIdNUmber());
	}
	
	public abstract   Person getinfo();
}
