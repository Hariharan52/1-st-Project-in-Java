import java.io.File;
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.Scanner;
import java.io.FileNotFoundException; 
import java.util.regex.*;
import java.util.Calendar;
public class Hari 
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		String cc = cal.getTime().toString();
	    try
	    {
	    	File file = new File("C:\\Users\\mhari\\OneDrive\\Desktop\\abc.txt");
	        Scanner s= new Scanner(file);
	        while (s.hasNextLine()) 
	        {        	
	            String name = s.next();
	            String num = s.next();
	            if(Pattern.matches("[6-9]{1}[0-9]{9}",num))
	            {
	            	File user = new File(name+".txt");
	            	try
	            	{
	            	      FileWriter myWriter = new FileWriter(user);
	            	      myWriter.write(cc);
	            	      myWriter.close();
	            	}
	            	catch (IOException e) 
	            	{
	            	    e.printStackTrace();
	            	}
	            }
	        }
	    }
	    catch (FileNotFoundException e) 
	    {
	    	System.out.print("Operation falied");
	        e.printStackTrace();
	    }
	 
	}
}