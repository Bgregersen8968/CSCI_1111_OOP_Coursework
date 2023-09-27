import java.util.Random;
import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] array = new int[100];
		Random random = new Random();
		{

			for (int i = 0; i < array.length; i++) {
				array[i] = random.nextInt(100);
			}

			System.out.print("Enter your sepecified index to see its corisponding element: ");
			int index = in.nextInt();

			try {
				System.out.println("The corresponding element would be: " + array[index]);
			} catch (ArrayIndexOutOfBoundsException l) {
				System.out.println("out of bounds");
			}
		}

	}
}