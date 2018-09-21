/*Alyssa Freese and Kenny Robinson
 *Dr. Petrovic
 *CS202
 *Lab 9 
 *
 * Algorithm:
 * 
 * 1. create new InsectPopulation object called test with parameter 10 (initial population)
 * 2. create a for loop that will loop around 18 times
 * 3. print i and add a space afterwards
 * 4. call on method breed in InsectPopulation class through object test
 * 5. call on method spray from InsectPopulation class with object test
 * 6. calls on display method from InsectPopulation class with object test
 */

public class TestInsectPopulation {

	public static void main(String[] args) {
		InsectPopulation test = new InsectPopulation(10);
		for (int i=1; i<=18; i++) {
			System.out.print(i +". ");
			//call on methods from other class, using object
			test.breed();
			test.spray();
			test.display();
		}

	}

}

//Run

/*
1. The current population is 18
2. The current population is 33
3. The current population is 60
4. The current population is 108
5. The current population is 195
6. The current population is 351
7. The current population is 632
8. The current population is 1138
9. The current population is 2049
10. The current population is 3689
11. The current population is 6641
12. The current population is 11954
13. The current population is 21518
14. The current population is 38733
15. The current population is 69720
16. The current population is 125496
17. The current population is 225893
18. The current population is 406608
 */