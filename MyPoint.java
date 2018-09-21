/*Alyssa Freese and Kenny Robinson
 * Dr. Petrovic
 * CS202
 * April 13, 2015
 * Lab 8
 * 
 * Algorithm:
 * 1. create class MyPint with private variables x and y
 * 2. create a MyPoint method, in which there are parameters initialX and initialY which are both integers
 * 3. within this method set x to initialX and y to initialY
 * 4. create a new method called getX which will print the value of the variable x
 * 5. create a new method called getY which will print the value of the variable y
 * 6. create a new method called setLocation in which there are two parameters, newX and newY, which are both integers
 * 7. within this method set x equal to newX and y equal to newY
 * 8. create a new method called translate which accepts two parameters, dx and dy, which are both integers
 * 9. within this method, set x equal to x plus dx and y equal to y plus dy
 * 10. create a new method called distanceFromOrigin
 * 11. within this method declare variable distance as a double and set it to the square root of x squared plus y squared
 * 12. print the distance
 * 13. create the method toString which returns the coordinates as a string in the (x,y) format
 * 14. create the method isVertical which accepts the parameter of another point 
 * 15. within this method, check if x is equal to the other points x value.  If it is, return true, if not, return false
 * 16. create another method call isHorizontal which accepts the parameter of the other point
 * 17. within this method, check if y is equal to the other points y value.  If it is, return true, if not, return false
 * 
 */
public class MyPoint {
	private int x;
	private int y;
	
	//sets initial values of x and y
	public MyPoint(int initialX, int initialY) {
		x = initialX;
		y = initialY;
	}

	//finds the x value
	public void getX() {
		System.out.println("The initial value of x is " +x);
	}
	
	//retrieves the y value
	public void getY() {
		System.out.println("The inital value of y is " +y);
	}
	
	//changes the x and y values to the inputed ones in the parameter
	public void setLocation(int newX, int newY) {
		x = newX;
		y = newY;
	
	}
	
	//changes the x and y values by adding parameters respectively
	public void translate(int dx, int dy) {
		x = x+dx;
		y = y+dy;
		
	}
	
	//finds the distance using Pythagorean theorem
	public void distanceFromOrigin() {
		double distance= Math.sqrt((Math.pow((double)x, 2)+ Math.pow((double)y, 2)));
		System.out.println("The coordinates are " +String.format("%.2f", distance) +" away from the origin");
	}
	
	//return coordinates in standard format
	public String toString() {
		String point = "("+x+","+y+")";
		return point;
	}
	
	//checks if new coordinates vertically align with point in parameter by checking if x values are equal
	public boolean isVertical(MyPoint other) {
		if (x==other.x)
			return true;
		else
			return false;
	}

	//checks if new coordinates horizontally align with the point in parameter by checking if y values are equal
	public boolean isHorizaontal(MyPoint other) {
		if (y==other.y)
			return true;
		else
			return false;
	}
}
