import java.io.*;
import java.net.*;

public class httpAndroid1 {

	public static void main(String[] args) throws IOException {
		//Creates the URL object and sets the variable to a web page.
		URL funnsmiley = new URL("http://www.funnsmileys.com/");
		//Creates connection object
        HttpURLConnection fun= (HttpURLConnection) funnsmiley.openConnection();
		try {
		//Creates a stream object to pull from web page
		  InputStream input = new BufferedInputStream(fun.getInputStream());
		  //Must meet conditions for the user to be signed onto the network. If the conditions aren't met sends user to to sign on to network.
		  if (!funnsmiley.getHost().equals(fun.getURL().getHost())) {
		  }
		} finally {
		// Disconnects from the web page
		  fun.disconnect();
		}
	}
}
