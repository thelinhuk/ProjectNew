import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ClevaPOSFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JLabel lblDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClevaPOSFrame frame = new ClevaPOSFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClevaPOSFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		lblDisplay = new JLabel("0.00");
		lblDisplay.setBackground(Color.WHITE);
		lblDisplay.setPreferredSize(new Dimension(300,100));
		panel_1.add(lblDisplay);
	
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(4, 3, 0, 0));
		
		JButton btnOne = new JButton("1");
		btnOne.addActionListener(this);
		panel_3.add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(this);
		panel_3.add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.addActionListener(this);
		panel_3.add(btnThree);
		
		JButton btnFour = new JButton("4");
		btnFour.addActionListener(this);
		panel_3.add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(this);
		panel_3.add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.addActionListener(this);
		panel_3.add(btnSix);
		
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(this);
		panel_3.add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.addActionListener(this);
		panel_3.add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.addActionListener(this);
		panel_3.add(btnNine);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(this);
		panel_3.add(btnZero);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(this);
		panel_3.add(btnDot);
		
		JButton btnDZero = new JButton("00");
		btnDZero.addActionListener(this);
		panel_3.add(btnDZero);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String btnText = "";
		String afterDot = "";
		String lblText =lblDisplay.getText();
		String newVal = "";
		int dotPost = 0 ;
		long curVal = 0;
		
		JButton btnAction = (JButton) e.getSource();
		dotPost = lblText.indexOf(".");
		btnText = btnAction.getText();
		
		
		
		
		if(lblText.equals("0.00")){
			
			lblText ="";
			lblText = lblText + "" + btnText;
			lblDisplay.setText(lblText);
		}else{
			if(dotPost > 0){
				afterDot = lblText.substring(dotPost+1,lblText.length());
				if(afterDot.length() <= 1){
					lblText = lblText + "" + btnText;
					lblDisplay.setText(lblText);
				}
			}else{
			
				lblText = lblText + "" + btnText;
				lblDisplay.setText(lblText);
			}
			
		}
	
		
	
		
	}

}
