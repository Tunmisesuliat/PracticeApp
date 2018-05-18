dir1.class
dir2.class
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt(20);
		int b = rand.nextInt(20);
		int c = rand.nextInt(20);
		
		System.out.print("Hello user, I have a number (between 0 and 20) in mind, can you guess what the number id ?\nReply: ");
		int reply = new Scanner(System.in).nextInt();
		
		if(reply == a || reply == b || reply == c) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong!!\nThe number is: "+a);
		}
	}
}