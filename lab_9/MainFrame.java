package lab_9;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class MainFrame extends JFrame{

	JComboBox<String> nBox;
	JSpinner kSpinner;
	JTextField pField;
	JTextField yField;
	
	JLabel lblRes8;
	JLabel lblRes16;
	JLabel lblRes10;
	JLabel lblResMath;
	
	public MainFrame() {
		super("Решение задачи Вар. 3");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(540, 300);
		Container container = getContentPane();
		container.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JPanel iterPanel = new JPanel();
		iterPanel.setBorder(BorderFactory.createTitledBorder("Кол-во итераций"));
		iterPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		iterPanel.setPreferredSize(new Dimension(160, 100));
		
		iterPanel.add(new JLabel("N"));
		nBox = new JComboBox<String>(new String[] {"1", "2", "3", "4"});
		nBox.setPreferredSize(new Dimension(120, 20));
		iterPanel.add(nBox);
		
		
		iterPanel.add(new JLabel("K"));
		kSpinner = new JSpinner();
		kSpinner.setPreferredSize(new Dimension(120, 20));
		iterPanel.add(kSpinner);
		
		//UI perems
		JPanel peremPanel = new JPanel();
		peremPanel.setBorder(BorderFactory.createTitledBorder("Переменные"));
		peremPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		peremPanel.setPreferredSize(new Dimension(160, 100));
		
		peremPanel.add(new JLabel("p"));
		pField = new JTextField();
		pField.setPreferredSize(new Dimension(125, 20));
		peremPanel.add(pField);
		
		peremPanel.add(new JLabel("y"));
		yField = new JTextField();
		yField.setPreferredSize(new Dimension(125, 20));
		peremPanel.add(yField);
		
		container.add(iterPanel);
		container.add(peremPanel);
		
		//UI result
		JPanel resPanel = new JPanel();
		resPanel.setBorder(BorderFactory.createTitledBorder("Результат"));
		GridLayout l = new GridLayout(4, 2, 10, 12);
		resPanel.setLayout(l);
		resPanel.setPreferredSize(new Dimension(486, 150));
		
		lblRes8 = new JLabel("0");
		lblRes16 = new JLabel("0");
		lblRes10 = new JLabel("0");
		lblResMath = new JLabel("0");
		
		resPanel.add(lblRes8);
		resPanel.add(new JLabel("- система счисления с основанием 8"));
		resPanel.add(lblRes16);
		resPanel.add(new JLabel("- система счисления с основанием 16"));
		resPanel.add(lblRes10);
		resPanel.add(new JLabel("- система счисления с основанием 10"));
		resPanel.add(lblResMath);
		resPanel.add(new JLabel("- математический вид"));
		
		
		container.add(resPanel);
		
		nBox.addActionListener(getListenerForElem());
		pField.getDocument().addDocumentListener(getListenerForTextField());
		yField.getDocument().addDocumentListener(getListenerForTextField());
		kSpinner.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				Calc();
			}
		});
		
		setVisible(true);
	}
	
	private ActionListener getListenerForElem() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calc();
			}
		};
	}
	
	private DocumentListener getListenerForTextField() {
		return new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) { Calc();}
			
			@Override
			public void insertUpdate(DocumentEvent e) { Calc();}
			
			@Override
			public void changedUpdate(DocumentEvent e) { Calc();}
		};
	}
	
	private void Calc() {
		int N = Integer.parseInt((String)nBox.getSelectedItem());
		int K = (int)kSpinner.getValue();
		double p = Double.parseDouble(pField.getText());
		double y = Double.parseDouble(yField.getText());
		
		double z = 0;
		for (int i = 1; i <= N; i++)
			for (int j = 1; j <= K; j++) {
				z += (Math.pow(p, i) * Math.pow(y, j)) / (i * j);
			}
		
		lblRes10.setText(String.format("%12.3f", z));
		lblResMath.setText(String.format("%5.3e", z));
		int zInt = (int)z;
		lblRes8.setText(String.format("%o", zInt));
		lblRes16.setText(String.format("%x", zInt));
		
		
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}

}
