package cse360assignment02;

public class AddingMachine {
	
	//declaring variable and StringBuilder
	private int total;
	StringBuilder string = new StringBuilder(0);
  
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
  
	public int getTotal () {	 
		//returns total
		return 0;
	}
  
	public void add (int value) {
		//appends value into StringBuilder
		string.append(value).append( "+" );  
	}

	public void subtract (int value) {
		//appends value into StringBuilder
		string.append(value).append( "-" );
	}

	public String toString () {
		//print StringBuilder
		System.out.println(total + " " +string);
		return " ";
	}

	public void clear() {
		//clear StringBuilder
		System.out.println(string.delete(0, string.length()));
	}
}//end of AddingMachine Class
