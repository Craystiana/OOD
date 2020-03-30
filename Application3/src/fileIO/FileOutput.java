package fileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class FileOutput {
	
	public void write(String s, String string) {
	       FileOutputStream outputStream = null;

	        try
	        {
	            outputStream = new FileOutputStream(s);
	            PrintWriter writer = new PrintWriter(outputStream);
	            
	            writer.print(string);
	            writer.flush();
	            writer.close();
	        }
	        catch (FileNotFoundException e)
	        {
	            System.out.println("Eroare la deschiderea fisierului " + e.getMessage());
	        }
	        catch (NoSuchElementException e)
	        {
	            System.out.println("Eroare la procesarea fisierului " + e.getMessage());
	            
	        }
	        catch(Exception e)
	        {
	            System.out.println("Eroare la procesarea fisierului " + e.getMessage());
	            
	        }
	        
	        if(outputStream != null) {
	            try
	            {
	                outputStream.close();
	            }
	            catch(IOException e)
	            {
	                System.out.println("Fisierul nu este deschis." + e.getMessage());
	            }
	        }
	    }
}
