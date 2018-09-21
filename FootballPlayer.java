/*Algorithm:
 * 1. create class FootballPlayer with instance variables name (string), gamesPlayed(int) and numberOfInjuries(int)
 * 2. create a constructor that has three parameters, player, numGames and numInjuries
 * 3. within constructor set variables equal to parameter accordingly
 * 3. create get methods which will return appropriate variable
 * 4. create set methods that have one parameter which will be set equal to the variable
 * 5. create a display method that will print all variables within class
 * 
 */
public class FootballPlayer {
	private String name;
	private int gamesPlayed;
	private int numberOfInjuries;
	
	//setting instance variables
	public FootballPlayer(String player, int numGames, int numInjuries) {
		name = player;
		gamesPlayed = numGames;
		numberOfInjuries = numInjuries;
	}
	
	//retrieve information for each variable
	public String getName() {
		return name;
	}
	
	public int getGamesPlayed() {
		return gamesPlayed;
		
	}
	
	public int getNumberOfInjuries() {
		return numberOfInjuries;
	}
	
	//set variables to new numbers
	public void setName(String newName) {
		name = newName;
	}
	
	public void setGamesPlayed(int played) {
		gamesPlayed = played;
	}
	
	public void setNumberOfInjuries(int injuries) {
		numberOfInjuries = injuries;
	}
	
	//print
	public void display() {
		System.out.println("Name: " +name);
		System.out.println("Games Played: " +gamesPlayed);
		System.out.println("Number of Injuries: " +numberOfInjuries);	}
}
