import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptionsMenu 
{
	private MenuAction optionsAction;
	
	public OptionsMenu()
	{
		optionsAction = new MenuAction();
	}
	
	public void displayOptions()
	{
		System.out.println("1. Edit a webpage");
    	System.out.println("2. Editing report");
    	System.out.println("3. Exit application");
	}
	
	public int getUserInput(){
		// read the user input
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String input = "";
		
    	//TODO check for bad input
    	try {
			input = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return Integer.parseInt(input);
    	
	}
	
	public void handleChoice(int choice){
		switch(choice){
		case 1:
			optionsAction.editWebpage();
			break;
		case 2:
			optionsAction.editingReport();
			break;
		case 3:
			optionsAction.exitApplication();
			break;
		}
	}
}
