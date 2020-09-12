package cs4743.Assign2.Main;

public class Player {

	//two deck classes here
	
	//name
	private static String name;
	
	public Player() {
		name = "john doe";
	}

	public static String getName() {
		return name;
	}

	
	
	
	//accessors
	
	public static void setName(String name) {
		Player.name = name;
	}
}
