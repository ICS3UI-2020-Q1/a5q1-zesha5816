import java.util.Scanner;
/**
 * Create a program that will ask the user for an integer. It will then create a       “multiplication table” for that number from 1 to 12.
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create the Scanner
		Scanner input = new Scanner(System.in);
		//output message to user
		System.out.println("Please enter an integer to create a multiplication table for");
		//initialize the variables
		int mulitplicationInt = input.nextInt();
		int count=0;
		int answer;
		//only works while count is less than 12 
		while (count < 12){
			//add 1 to count everytime the loop repeats
			count++;
			//answer is count multypilying by the input value 
			answer = count * mulitplicationInt;
			//outputs the timetable 
			System.out.println(count + " x " + mulitplicationInt + " = " + answer);
			
		}
  }
}
