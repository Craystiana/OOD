package crypt_decrypt;

import java.util.Random;
import java.util.Scanner;
import fileIO.FileInput;
import fileIO.FileOutput;

public class Main {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int key = rand.nextInt(1000);
		
		System.out.println("Choose the type crypting you want:\n1. Text crypt\n2. Bin crypt\n3. Text and Bin crypt\n");
		Scanner in = new Scanner(System.in); //read the chosen option
		int input = in.nextInt();
		
		FileInput inFile = new FileInput();		
		FileOutput outFile = new FileOutput();
		
		CryptText textCrypter;
		DecryptText textDecrypter; 
		
		CryptBinary binaryCrypter;
		DecryptBinary binaryDecrypter;
		
		switch(input)
		{
		case 1:
			
			System.out.println("How many times you want to crypt the file?\n");
			int nr_crypts = in.nextInt();  //read the number of operations
			
			String inputText = inFile.read("input.txt"); //read the text
			textCrypter = new CryptText(inputText); 
			
			for(int i = 0; i < nr_crypts; i++ )
			{
				textCrypter.crypt(key); //encode the text (nr_crypts) times
			}
			String outputString = textCrypter.getText() + " " + nr_crypts;
			outFile.write("output.txt", outputString); //write the encoded text and the number of operations
			
			String outputText=inFile.read("output.txt"); //read the encoded text and the number of operations from the output file for the decoding operation
			int decryptNo = outputText.charAt(outputText.length() - 1) - '0'; //number of operations
			String decryptText = outputString.substring(0, outputText.length() - 2); //encoded text
			
			textDecrypter = new DecryptText(decryptText);
			
			for(int i = 0; i < decryptNo; i++ )
			{
				textDecrypter.decrypt(key); //decode the text (decryptNo) times
			}
			System.out.println(textDecrypter.getText()); //print the decoded text
			
			break;
			
		case 2:
			
			System.out.println("How many times you want to crypt the file?\n");
			nr_crypts = in.nextInt(); //read the number of operations
			
			inputText = inFile.read("input.bin"); //read the binary file
			binaryCrypter = new CryptBinary(inputText);
			
			for(int i = 0; i < nr_crypts; i++)
			{
				binaryCrypter.crypt(); //encode the binary text (nr_crypts) times
			}
			outputString = binaryCrypter.getText() + " " + nr_crypts;
			outFile.write("output.bin", outputString); //write the encoded binary text and the number of operations
			
			outputText=inFile.read("output.bin");//read the encoded binary text and the number of operations from the output file for the decoding operation
			decryptNo = outputText.charAt(outputText.length()-1) - '0'; //number of operations
			String decryptBinary = outputString.substring(0, outputText.length()-2);//encoded binary text
			
			binaryDecrypter = new DecryptBinary(decryptBinary);
			
			for(int i = 0; i < decryptNo; i++ )
			{
				binaryDecrypter.decrypt(); //decode the binary text (decryptNo) times
			}
			System.out.println(binaryDecrypter.getText()); //print the decoded binary text
			break;
			
		case 3:
			
			System.out.println("Choose how many times you want to apply the text crypt:\n");
			int nrTextCrypt = in.nextInt(); //read the number of txt operations
			
			System.out.println("Choose how many times you want to apply the binary crypt:\n");
			int nrBinaryCrypt = in.nextInt(); //read the number of bin operations
			
			inputText = inFile.read("txtbin.txt"); //read the text
			textCrypter = new CryptText(inputText);
			
			for(int i = 0; i < nrTextCrypt; i++)
			{
				textCrypter.crypt(key); //encode the text (nrTextCrypt) times with the text algorithm
			}
			
			binaryCrypter=new CryptBinary(textCrypter.getText());
			
			for(int i=0; i<nrBinaryCrypt;i++)
			{
				binaryCrypter.crypt(); //encode the text (nrBinaryCrypt) times with the bin algorithm
			}
			
			outputString = binaryCrypter.getText() + " " + nrTextCrypt + " " + nrBinaryCrypt;
			outFile.write("txtbin_out.txt", outputString); //write the encoded text and the number of operations 
			
			outputText=inFile.read("txtbin_out.txt"); //read the encoded text and the number of operations from the out file
			int decryptsBinary = outputText.charAt(outputText.length() - 1) - '0'; //number of operations-type bin
			int decryptsText = outputText.charAt(outputText.length() - 3) - '0'; //number of operations-type text
			String txtbin = outputString.substring(0, outputText.length() - 4); //encoded text
			
			binaryDecrypter = new DecryptBinary(txtbin);
			
			for(int i = 0; i < decryptsBinary; i++ )
			{
				binaryDecrypter.decrypt(); //decode the text with bin algorithm (decryptsBinary) times
			}
			
			textDecrypter = new DecryptText(binaryDecrypter.getText());
			
			for(int i = 0; i < decryptsText; i++)
			{
				textDecrypter.decrypt(key); //decode the text with text algorithm (decryptsText) times
			}
			
			System.out.println(textDecrypter.getText()); //print the decoded text
			break;
			
		default:
			System.out.println("Enter a valid type!");	
		}
	}
}
