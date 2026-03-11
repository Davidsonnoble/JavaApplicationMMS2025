import java.util.Scanner;

public class one_Dimensional_Array{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[] marks = new int[10];
		int counter = 1;
		
		for(int i = 0; i <10; i++){
			System.out.printf("Enter element %d: ",counter);
			
			marks [i] = scan.nextInt();
		
		counter++;
	}
				System.out.println("The element of the array are %d: ");
				for(int i = 0; i <10; i++){
					
				System.out.printf("%d: ",marks[i]);

					


				
		}
	}
}