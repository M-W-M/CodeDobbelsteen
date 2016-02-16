import javax.swing.*;
import java.awt.*;

public class DobbelsteenMVC extends JApplet
{
	DobbelsteenModel model;            //het model
	TekstView tekstView;              // view
	DobbelsteenView dobbelsteenView;  // view
	StatistiekView statView;		  //view
	DobbelsteenController controller;             // Controller
	
	public void init()
	{
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
        
		// Maak het model
		model = new DobbelsteenModel();
        
        // Maak de controller en geef hem het model
		controller = new DobbelsteenController(model);
        controller.setBackground(Color.gray);
        getContentPane().add(controller,BorderLayout.NORTH);
        
        // Maak de views
        dobbelsteenView = new DobbelsteenView(Color.red);
        dobbelsteenView.setBackground(Color.black);
        getContentPane().add(dobbelsteenView,BorderLayout.CENTER);
        tekstView = new TekstView();
        tekstView.setBackground(Color.gray);
        getContentPane().add(tekstView,BorderLayout.SOUTH);
        statView = new StatistiekView();
        getContentPane().add(statView,BorderLayout.EAST);
        
        // Registreer de views bij het model
        model.addActionListener(tekstView);
        model.addActionListener(dobbelsteenView);
        model.addActionListener(statView);
        
        // Eerste worp
        model.gooi();
	}
}
