import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) 
	
	{
		//make sure it wont crash
		SwingUtilities.invokeLater(new Runnable(){

	
			public void run() {
				
				//create obj JFrame (window)
			MainFrame frame = new MainFrame();
			}
		});
	}

}
