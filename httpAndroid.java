import java.net.*;
import java.io.*;

public class httpAndroid {
    public static void main(String[] args) throws Exception {
    	
    	//Creates the URL object and sets the variable to a web page.
        URL funnsmiley = new URL("http://www.funnsmileys.com/");
        
        //Creates connection object
        HttpURLConnection fun= (HttpURLConnection) funnsmiley.openConnection();
        
        //Creates a reader object
        BufferedReader BringIn = new BufferedReader(new InputStreamReader(
                                    fun.getInputStream()));
        String input;
        //Creates loop to pull data from web page. It cannot be null or without data
        while ((input = BringIn.readLine()) != null) 
        	//Prints the data pulled from the web page
            System.out.println(input);
        //Closes the reader
        BringIn.close();
    }
}