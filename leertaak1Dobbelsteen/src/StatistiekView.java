/*
 * Met deze klasse wordt de statistiek bijgehouden van de waarden die met de dobbelsteen zijn gegooid.
 */
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class StatistiekView extends JPanel implements ActionListener
{
	JTextArea statText = new JTextArea();
	DobbelsteenModel d = new DobbelsteenModel();
	int waarde1;
	int waarde2;
	int waarde3;
	int waarde4;
	int waarde5;
	int waarde6;
	int worpen;
	
	public StatistiekView()
	{
		this.setLayout(new GridLayout());
		this.add(statText);
	}
	
	// Deze methode retourneert een textstring met het totaal aantal worpen, 
	// en het aantal keer dat een bepaalde waarde is gegooid.
	public String getGegooideWaarden()
	{
		String gegooideWaarden = worpen + " worpen \n" 
				+ "1: " + waarde1 + " keer \n" + "2 :" + waarde2 + " keer \n"
				+ "3 :" + waarde3 + " keer \n"+ "4 :" + waarde4 + " keer \n"+ "5 :" + waarde5 + " keer \n" 
				+ "6 :" + waarde6 + " keer \n";
		return gegooideWaarden;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		d = (DobbelsteenModel) e.getSource();
		worpen++;
		WaardeOpslaan(d.getWaarde());
		statText.setText(getGegooideWaarden());		
	}
	
	public Dimension getPreferredSize()
	{
	    return new Dimension(100,120);
	} 
	
	//Deze methode slaat het aantal worpen per waarde op. 
	public void WaardeOpslaan(int i)
	{
		switch(i)
		{
			case 1: waarde1 ++; 					
			break;		
			case 2: waarde2 ++;					
			break;
			case 3: waarde3 ++; 					
			break;
			case 4: waarde4 ++; 					
			break;
			case 5: waarde5 ++;					
			break;
			case 6: waarde6 ++; 					
			break;
		}		
	}	
}
