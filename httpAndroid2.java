import java.io.*;
import java.net.*;

public class httpAndroid2 {

	public static void main(String[] args) throws IOException {
		//Creates the URL object and sets the variable to a web page
		URL funnsmiley = new URL("http://www.funnsmileys.com/");
		//Creates connection object
        HttpURLConnection fun= (HttpURLConnection) funnsmiley.openConnection();
		try {
			//Request to post data
			fun.setDoOutput(true);
			//Creates object for things to be pulled from the webpage
			OutputStream output = new BufferedOutputStream(fun.getOutputStream());
			writeStream(output);
			//Creates object for things to be pulled from the webpage
			InputStream input = new BufferedInputStream(fun.getInputStream());
			readStream(input);
		}finally {
			//Disconnects from the web page
			fun.disconnect();
		}
	}

	private static void readStream(InputStream input) {
		// TODO Auto-generated method stub
		
	}

	private static void writeStream(OutputStream output) {
		// TODO Auto-generated method stub
		
	}
}