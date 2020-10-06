package cse360assignment02;

public class AddingMachine {
  private int total;
  StringBuilder string = new StringBuilder(0);
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return 0;
  }
  
  public void add (int value) {
	  
	  string.append(value).append( "+" );
  }

  public void subtract (int value) {
	  string.append(value).append( "-" );
  }

  public String toString () {
	  System.out.println(total + " " +string);
	  return " ";
  }

  public void clear() {
	  System.out.println(string.delete(0, string.length()));
  }
}
