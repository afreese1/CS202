/*Alyssa Freese and Kenny Robinson
 * Dr. Petrovic
 * CS202
 * April 13, 2015
 * Lab 8
 * 
 * Algorithm:
 * 1. import scanner and create new scanner within main
 * 2. create new object, MyPoint, called coord with initial coordinates 1 and 5 (parameters for x and y)
 * 3. call on getX method with object, coord
 * 4. call on getY method with object, coord
 * 5. ask user to enter new values for x and y, using the scanner
 * 6. call on method setLocation with object coord, using parameters of x and y
 * 7. ask user to enter values for dx and dy, using the scanner to communicate with keyboard
 * 8. call on method translate with object coord, using parameters dx and dy
 * 9. call on method distanceFromOrigin using the object coord
 * 10. print the return value from the method toString, with the object coord
 * 11. ask user to enter other x and y values to create a new point
 * 12. create new MyPoint object called newpt which calls on MyPoint method using parameters newx and newy
 * 13. Print return value from method isVertical, using newpt as a parameter, reading from object coord
 * 14. Print return value from method isHorizontal, using newpt as a parameter, reading from object coord
 * 
 * Test Cases:
 * 1) x=3, y=4, dx = 1, dy =5 -> output = 9.85 away and (4,9)
 *    newx=3, newy = 9 -> output = vertical-false, horizontal-true
 *    
 *    works as expected
 *    
 * 2) x = 1, y = 3, dx = 5, dy = 2 -> output = 7.81 away and (6, 5)
 *    newx = 6, newy = 8 -> output = vertical-true, horizontal-false
 *    
 *    works as expected
 *    
 *3) x = 4, y = 6, dx = 4, dy = 7 -> output = 15.26 away and (8, 13)
 *   newx = 7, newy = 14 -> output = vertical-false, horizontal-false
 *   
 *   works as expected
 *   
 *4) x = 2, y = 3, dx = 1, dy = 1 -> output = 5.00 away and (3,4)
 *   newx = 3, newy = 4 -> output = vertical-true, horizontal-true
 *   
 *   works as expected
 */

import java.util.Scanner;
public class PointTest 
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//creates new object, MyPoint, with initial x and y values of 1 and 5 respectively
		MyPoint coord = new MyPoint(1,5);
		//calls on getX method in MyPoint to read from object coord
		coord.getX();
		//calls on getY method in MyPoint class to read from object coord
		coord.getY();
		
		//asks user to input new coordinates for x and y
		System.out.println("Enter new coordinates for x and y: ");
		System.out.println("x = ");
		int x = in.nextInt();
		System.out.println("y = ");
		int y = in.nextInt();
		//calls on method setLocation from MyPoint class, using the parameters of inputed values x and y with object coord
		coord.setLocation(x, y);
		
		//asks user to enter values for dx and dy
		System.out.println("Enter amounts for dx and dy, which will determine how x and y move along the axis: ");
		System.out.println("dx = ");
		int dx = in.nextInt();
		System.out.println("dy = ");
		int dy = in.nextInt();
		//calls on method translate with parameters of inputed dx and dy values, using object coord
		coord.translate(dx, dy);
		
		//calls on method distanceFromOrigin from MyPoint class, reading from the object coord
		coord.distanceFromOrigin();
		//calls on method toString from MyPoint class reading from the object coord
		System.out.println("The new coordinates are: " +coord.toString());
		
		//asks user to enter another point
		System.out.println("Enter a new point: ");
		System.out.println("x = ");
		int newx = in.nextInt();
		System.out.println("y = ");
		int newy = in.nextInt();
		//creates the new point object by calling on MyPoint method from MyPoint Class with parameters of newx and newy
		MyPoint newpt = new MyPoint(newx,newy);
		
		//calls on method isVertical from MyPoint class with parameter newpt reading from cord object
		System.out.println("Vertical Test: " +coord.isVertical(newpt));
		//calls on method isHorizontal from MyPoint class with parameter newpt reading from coord object
		System.out.println("Horizontal Test: " +coord.isHorizaontal(newpt));
		
	}

}

//Runs

//1

//The initial value of x is 1
//The inital value of y is 5
//Enter new coordinates for x and y: 
//x = 
//3
//y = 
//4
//Enter amounts for dx and dy, which will determine how x and y move along the axis: 
//dx = 
//1
//dy = 
//5
//The coordinates are 9.85 away from the origin
//The new coordinates are: (4,9)
//Enter a new point: 
//x = 
//3
//y = 
//9
//Vertical Test: false
//Horizontal Test: true

//2

//The initial value of x is 1
//The inital value of y is 5
//Enter new coordinates for x and y: 
//x = 
//1
//y = 
//3
//Enter amounts for dx and dy, which will determine how x and y move along the axis: 
//dx = 
//5
//dy = 
//2
//The coordinates are 7.81 away from the origin
//The new coordinates are: (6,5)
//Enter a new point: 
//x = 
//6
//y = 
//8
//Vertical Test: true
//Horizontal Test: false

//3

//The initial value of x is 1
//The inital value of y is 5
//Enter new coordinates for x and y: 
//x = 
//4
//y = 
//6
//Enter amounts for dx and dy, which will determine how x and y move along the axis: 
//dx = 
//4
//dy = 
//7
//The coordinates are 15.26 away from the origin
//The new coordinates are: (8,13)
//Enter a new point: 
//x = 
//7
//y = 
//14
//Vertical Test: false
//Horizontal Test: false

//4 

//The initial value of x is 1
//The inital value of y is 5
//Enter new coordinates for x and y: 
//x = 
//2
//y = 
//3
//Enter amounts for dx and dy, which will determine how x and y move along the axis: 
//dx = 
//1
//dy = 
//1
//The coordinates are 5.00 away from the origin
//The new coordinates are: (3,4)
//Enter a new point: 
//x = 
//3
//y = 
//4
//Vertical Test: true
//Horizontal Test: true
