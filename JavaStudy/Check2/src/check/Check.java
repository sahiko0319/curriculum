package check;

public class Check {

	private static String firstName = "武蔵";
	private static String lastName = "孝二";
	
	public static void main(String[] args) { 
		printName(firstName,lastName);
		Pet pet = new Pet("java吉","hoge");
		pet.introduce();
		
		RobotPet robotPet = new RobotPet("R2D2","ルーク");
		robotPet.introduce();
		
	}
	
	private static void printName(String firstName,String lastName) {
		
		System.out.println("printNameメソッド→"+firstName+lastName);
	}
}
