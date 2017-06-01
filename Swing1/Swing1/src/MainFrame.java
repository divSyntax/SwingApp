import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame
{
	private JTextArea textArea;
	private JButton btn;
	private textPanel textpanel;
	private ToolBar toolbar;
	private FormPanel formPanel;
	public MainFrame()
	{
		super("Hello World");
		
		setLayout(new BorderLayout());
		
		
		toolbar = new ToolBar();
		
		textpanel= new textPanel();
		formPanel = new FormPanel();
		
		//toolbar.setTextPanel(textpanel);
		
		toolbar.textListing(new StringList()
		{
			public void textListing(String text) {
				textpanel.appendTexts(text);
			}
		});

		//textArea = new JTextArea();
		btn = new JButton("Click ME!");

		
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				textpanel.appendTexts("Hello World!\n");
			}
			
		});
		
		formPanel.setFormListener(new FormListener()
		{
			public void formEventOccurred(FormEvent e)
			{
				String name = e.getName();
				String occupation = e.getOccupation();
				
				textpanel.appendTexts(name + ": " + occupation + "\n");
				
			}
			
		});
		
		add(formPanel,BorderLayout.WEST);
		add(toolbar,BorderLayout.NORTH);
		add(textpanel,BorderLayout.CENTER);//add text 
		//add(btn,BorderLayout.SOUTH);//and button
		
		setSize(600, 500);//set size
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close on x press
		setVisible(true);//set window so I can see it
	}

}
