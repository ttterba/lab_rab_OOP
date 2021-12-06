package lab_8;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameWithoutMain extends JFrame {
	
	private JButton btn;
	
	public FrameWithoutMain() {
		super("Окно без функции main");
		setSize(400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cont = getContentPane();
		
		btn = new JButton("Log");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button <Log> pressed!");
			}
		});
		
		cont.add(btn, BorderLayout.CENTER);
	}

}
