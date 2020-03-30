package fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileInput {
	
	public String read(String path) {
        FileInputStream inputStream = null;
        String string = "";
        try
        {
            inputStream = new FileInputStream(path);
            Scanner fileScanner = new Scanner(inputStream);

            string = fileScanner.nextLine();      
            fileScanner.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Eroare la deschiderea fisierului " + e.getMessage());
            e.printStackTrace();
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Eroare la procesarea fisierului " + e.getMessage());
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println("Eroare la procesarea fisierului " + e.getMessage());
            e.printStackTrace();
        }
        
        if(inputStream != null) {
            try
            {
                inputStream.close();
            }
            catch(IOException e)
            {
                System.out.println("Fisierul nu este deschis." + e.getMessage());
            }
        }
        
        return string;
    } 
}

