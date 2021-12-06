package lab_8;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dialog;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameExample extends JFrame {

	public JFrameExample() {
		super("Пример JFrame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setIconImage(getToolkit().getImage("1.png"));
		setSize(300, 100);
		setVisible(true);
	}
	
	public class JDialogExample extends JDialog {
		
		public JDialogExample(Dialog parent, String caption, boolean isModal) {
			super(parent, caption, isModal);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setSize(200, 100);
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		
	}

}
