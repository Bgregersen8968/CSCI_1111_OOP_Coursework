import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Exercise12_15File {
	public static void main(String[] args) throws IOException {
		File ex12_15 = new File("Exercise12_15.txt");
		if (!ex12_15.exists()) {
			ex12_15.createNewFile();
		}
		PrintWriter writer = new PrintWriter(new FileWriter(ex12_15));
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			writer.write(random.nextInt(100) + " ");
		}
		writer.close();
		Scanner in = new Scanner(ex12_15);
		int[] array = new int[100];
		for (int i = 0; i < 100; i++) {
			array[i] = in.nextInt();
		}
			Arrays.sort(array);
			System.out.println("Sorted Array: ");
			for (int l = 0; l < 100; l++) {
				System.out.print(array[l] + " ");
			}
		}
	}

