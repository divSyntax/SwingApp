import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBar extends JPanel implements ActionListener
{
	private JButton helloBtn;
	private JButton goodByeBtn;
	private textPanel textpanel;
		private StringList textString;
	
	public ToolBar()
	{
		//set border for toolbar
		setBorder(BorderFactory.createEtchedBorder());
		
		helloBtn = new JButton("Hello");
		goodByeBtn = new JButton("GoodBye");
		
		helloBtn.addActionListener(this);
		goodByeBtn.addActionListener(this);
		
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloBtn);
		add(goodByeBtn);

	}
	
//	public void setTextPanel(textPanel textpanel)
//	{
//		this.textpanel = textpanel;
//	}
	
	public void textListing(StringList listener)
	{
		this.textString = listener;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JButton clicked = (JButton)e.getSource();
		
		if(clicked == helloBtn)
		{
			//textpanel.appendTexts("Hello\n");
			
			if(textString != null)
			{
				textString.textListing("Hello\n");
			}
			
			
		} else if(clicked == goodByeBtn)
		{
			if(textString != null)
			{
				textString.textListing("Goodbye\n");
			}
		}
	}

}
