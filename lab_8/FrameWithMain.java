package lab_8;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameWithMain extends JFrame {

	JButton btn;
	
	public FrameWithMain() {
		super("Окно с методом main");
		setSize(400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cont = getContentPane();
		BoxLayout box = new BoxLayout(cont, BoxLayout.X_AXIS);
		cont.setLayout(box);
		
		btn = new JButton("Log");
		btn.setPreferredSize(new Dimension(200, 100));
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button <Log> pressed!");
			}
		});
		
		cont.add(Box.createHorizontalGlue());
		cont.add(btn);
		cont.add(Box.createHorizontalGlue());
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FrameWithMain();
	}

}
