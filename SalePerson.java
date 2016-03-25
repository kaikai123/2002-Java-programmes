
public class SalePerson implements Comparable {
	private String firstName;
	private String lastName;
	private int totalSales;
	
	public SalePerson(String fName, String lName, int sales){
		firstName = fName;
		lastName = lName;
		totalSales = sales;
	}
	
	public String toString(){
		return lastName + ", " + firstName + ": " + totalSales;
	}
	
	public boolean equals(Object o){
		if (!(o instanceof SalePerson)) {
		      return false;
		}
		SalePerson e = (SalePerson) o;
		return firstName.equals(e.getFirstName())
		        && lastName.equals(e.getLastName());
		
	}
	
	public int compareTo(Object o){
		SalePerson e = (SalePerson) o;
		int r;
		if(this.equals(o)){
			return 0;
		}
                if(this.getTotalSales() > e.getTotalSales()) return 1;
		if(this.getTotalSales() < e.getTotalSales()) return -1;
        
                int c = this.getLastName().compareTo(e.getLastName());
                return c*(-1);
                    

	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public int getTotalSales(){
		return totalSales;
	}

}
