import java.util.Scanner;

public class VarargsWithScanner {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//Read the name 
		System.out.print("Enter your score: ");
		Strings name = input.nextLine();
		
		//Ask how many score the user wants to enter
		System.out.print("How many score will ypu enter? ");
		int n = input.nextLine();
		
		int[] scores = new int[n];
		
		// Read score 
		for(int i = 0; i < n; i ++){
			System.out.print("Enter score " + (i+1) + ":");
			Score[i] = input.nextInt();
		}
		
		//call the method using varargs (pass the array)
		greet(name, scores);
		
		input.close();
		
		public static void greet(String name, int... score){
		System.out.println("\nHello" + name +", your scores are:");
		for(int s : scores){
			System.out.println(s);
	

		}

	}
}
