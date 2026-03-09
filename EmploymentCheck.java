import java.util.Scanner;

public class EmploymentCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your English test score: ");
        double english = input.nextDouble();

        System.out.print("Enter your Mathematics test score: ");
        double mathematics = input.nextDouble();

        System.out.print("Enter your ICT test score: ");
        double ict = input.nextDouble();

        double average = (english + mathematics + ict) / 3;

        if (english > 70 && average >= 80) {
            System.out.println("\nCongratulations " + name + "! You have been granted employment.");
        } 
		else {
            System.out.println("\nSorry " + name + ". You have not met the employment requirements.");
        }

    }
}