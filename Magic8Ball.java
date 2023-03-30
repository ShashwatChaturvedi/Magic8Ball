import java.util.Scanner;
import java.util.Random;

public class Magic8Ball {
	public static void main(String args[]) {
		Scanner keyboardInput = new Scanner(System.in);
		Random randomInt = new Random();

			String question;
			int random = randomInt.nextInt(3)+1;
			String answer = "";
			System.out.println("Ask your question: ");
			question = keyboardInput.next();
				if (random == 1) {
							answer = "yes";
						} else if (random == 2) {
							answer = "NO";
						} else if (random == 3) {
							answer = "ASK AGAIN LATER";
						}
							System.out.println(answer);
					}
				}