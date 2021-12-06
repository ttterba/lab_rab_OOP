package lab_8;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FrameSolve extends JFrame {

	double X = 0.0;
	double Y = 0.0;
	
	JButton btn;
	JButton btn2;
	
	JButton btnCalc;
	JTextField nTextField;
	JTextField rTextField;
	JTextField xTextField;
	JTextField yTextField;
	
	JRadioButton firstButton;
	JRadioButton secondButton;
	
	ButtonGroup btnGroup;
	int selectedVar = 0;
	
	public FrameSolve() {
		super("Ответ:0.00");
		setSize(280,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cont = getContentPane();
		BoxLayout box = new BoxLayout(cont, BoxLayout.Y_AXIS);
		cont.setLayout(box);
		
		JLabel nLabel = new JLabel("N");
		JLabel rLabel = new JLabel("R");
		JLabel xLabel = new JLabel("X");
		JLabel yLabel = new JLabel("Y");
		nTextField = new JTextField("10");
		rTextField = new JTextField("10");
		xTextField = new JTextField("0.0");
		yTextField = new JTextField("0.0");
		
		firstButton = new JRadioButton("Вариант 1");
		firstButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selectedVar = 1;
			}
		});
		secondButton = new JRadioButton("Вариант 2");
		secondButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selectedVar = 2;
			}
		});
		
		btnGroup = new ButtonGroup();
		btnGroup.add(firstButton);
		btnGroup.add(secondButton);
		
		btnCalc = new JButton("Считать");
		btnCalc.setMaximumSize(new Dimension(100, 20));
		btnCalc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double res = 0.0;
				int n = Integer.parseInt(nTextField.getText());
				int r = Integer.parseInt(rTextField.getText());
				X = Double.parseDouble(xTextField.getText());
				Y = Double.parseDouble(yTextField.getText());
				if (selectedVar == 1) {
					for (int i = 1; i <= n; i++) {
						if (i % 2 == 1) {
							res -= Math.pow(X, i - 1) / i;
						} else {
							res += Math.pow(Y, i - 1) / i;
						}
					}
				} else if (selectedVar == 2) {
					for (int i = 1; i <= n; i++) {
						for (int j = 1; j <= r; j++)
							res += (j*j + i) / (Math.pow(i, j) + j);
					}
				}
				setTitle("Ответ: " + res);
			}
		});
		
		cont.add(Box.createVerticalGlue());
		JPanel nPanel = new JPanel();
		nPanel.setLayout(new BoxLayout(nPanel, BoxLayout.X_AXIS));
		nPanel.add(Box.createHorizontalGlue());
		nPanel.add(nLabel);
		nPanel.add(nTextField);
		nPanel.setMaximumSize(new Dimension(200, 40));
		nPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 0));
		
		JPanel rPanel = new JPanel();
		rPanel.setLayout(new BoxLayout(rPanel, BoxLayout.X_AXIS));
		rPanel.add(Box.createHorizontalGlue());
		rPanel.add(rLabel);
		rPanel.add(rTextField);
		rPanel.setMaximumSize(new Dimension(200, 40));
		rPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 0));
		
		JPanel xPanel = new JPanel();
		xPanel.setLayout(new BoxLayout(xPanel, BoxLayout.X_AXIS));
		xPanel.add(Box.createHorizontalGlue());
		xPanel.add(xLabel);
		xPanel.add(xTextField);
		xPanel.setMaximumSize(new Dimension(200, 40));
		xPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 0));
		
		JPanel yPanel = new JPanel();
		yPanel.setLayout(new BoxLayout(yPanel, BoxLayout.X_AXIS));
		yPanel.add(Box.createHorizontalGlue());
		yPanel.add(yLabel);
		yPanel.add(yTextField);
		yPanel.setMaximumSize(new Dimension(200, 40));
		yPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 0));
		
		cont.add(nPanel);
		cont.add(rPanel);
		cont.add(xPanel);
		cont.add(yPanel);
		
		cont.add(firstButton);
		cont.add(secondButton);
		cont.add(btnCalc);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FrameSolve();
	}

}
