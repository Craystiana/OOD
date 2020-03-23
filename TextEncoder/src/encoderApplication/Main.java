package encoderApplication;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File fr = new File("input.txt");

		String string = null;
		try {
			Scanner sc = new Scanner(fr);
			String str = sc.nextLine();
			string = str;
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Random rand = new Random();
		int random = rand.nextInt(1000);

		Encoder text = new Encoder(string);
		text.encode(random);

		try {
			File fw = new File("encoded.bin");
			fw.createNewFile();

			FileWriter output = new FileWriter("encoded.bin");
			output.write(text.getText());

			output.close();
		} catch (IOException e) {

			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		System.out.println(text.getText());

		Decoder decoded_text = new Decoder(text.getText());
		decoded_text.decode(random);

		System.out.println(decoded_text.getText());
	}

}
