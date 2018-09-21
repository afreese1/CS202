/*Alyssa Freese and Kenny Robinson
 * Dr. Petrovic
 * CS202
 * Lab 9
 * 
 * Algorithm:
 * 
 * 1. create private variable within class called size that is type integer
 * 2. create constructor, InsectPopulation, with parameter of variable amt, type integer
 * 3. within this method set size equal to amt
 * 4. create void method called breed that sets size equal to size times 2
 * 5. create void method called spray that sets size equal to size minus the quotient of size divided by 10
 * 6. create method called getSize that will return an integer
 * 7. within this method, return size
 * 8. create void method called display that prints the current population by calling on the getSize method
 * 
 */
public class InsectPopulation {
	private int size;
	
	public InsectPopulation(int amt) {
		size=amt;
	}
	
	public void breed() {
		size=size*2;
	}
	
	public void spray() {
		size=size-(size/10);
	}
	
	public int getSize() {
		return size;
	}
	
	public void display() {
		System.out.println("The current population is " +getSize());
	}

}
