import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MenuAction 
{
	public MenuAction()
	{
		
	}
	
	public void editWebpage()
	{
		System.out.println("Please enter a URL:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		URL userURL = null;
		
		try {
			userURL = new URL(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // TODO: error handling 
		
		StringBuffer htmlContent = new StringBuffer();
		htmlContent = getHTMLcontent(userURL);
		
		Pattern pattern = Pattern.compile("<title>(.+?)</title>");
		Matcher matcher = pattern.matcher(htmlContent);
		
		while (matcher.find()) {
		    System.out.println(matcher.group(1));
		}

	}
	
	private StringBuffer getHTMLcontent(URL userURL)
	{
		InputStream is = null;
		
		try {
			is = userURL.openStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int ptr = 0;
		StringBuffer buffer = new StringBuffer();
		
		try {
			while ((ptr = is.read()) != -1) {
			    buffer.append((char)ptr);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return buffer;
	}
	
	public void editingReport()
	{
		
	}
	
	public void exitApplication()
	{
		System.exit(1);
	}
}
