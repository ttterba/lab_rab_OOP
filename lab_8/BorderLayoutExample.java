package lab_8;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class BorderLayoutExample extends JFrame {

	public BorderLayoutExample() {
		super("Пример BorderLayout");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container con = getContentPane();
		con.add(new JButton("Кнопка Север"), "North");
		con.add(new JButton("Кнопка Юг"), "South");
		con.add(new JLabel("Надпись Запад"), BorderLayout.WEST);
		con.add(new JEditorPane(JEditorPane.DEFAULT_KEYMAP, "Текстовый редактор"), BorderLayout.CENTER);
		setIconImage(getToolkit().getImage("1.png"));
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
	}

}
