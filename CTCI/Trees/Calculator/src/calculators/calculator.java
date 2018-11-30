package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calculator {

	private JFrame frmCalculator;
	private JTextField textResult;
	private JButton btn8;
	private JButton btn9;
	private JButton btnPlus;
	private JTextField txtFirstNumber;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnSub;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnMul;
	private JButton btn0;
	private JButton btnDot;
	private JButton btnEquals;
	private JButton btnDiv;
	private JButton btnArrow;
	private JButton btnC;
	
	// declare first and second numberrs
	double firstNumber;
	double secondNumber;
	double result;
	String operations;
	String answer;
	private JButton btnMod;
	private JTextField txtSecondNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
//		-------------------- ROW 1 -------------------------
		
		frmCalculator = new JFrame();
		frmCalculator.setTitle("CALCULATOR");
		frmCalculator.setBounds(100, 100, 299, 534);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		txtFirstNumber = new JTextField();
		txtFirstNumber.setHorizontalAlignment(SwingConstants.RIGHT  );
		txtFirstNumber.setColumns(10);
		txtFirstNumber.setBounds(6, 6, 121, 46);
		frmCalculator.getContentPane().add(txtFirstNumber);
		
		
//		-------------------- ROW 2 -------------------------
		
		btnArrow = new JButton("←");
		btnArrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace  = null; 
				if(txtFirstNumber.getText().length() > 0) {
					StringBuilder sb = new StringBuilder(txtFirstNumber.getText());
					sb.deleteCharAt(txtFirstNumber.getText().length() - 1);
					backspace =sb.toString();
					txtFirstNumber.setText(backspace);
					
				}
				
				if(txtSecondNumber.getText().length() > 0) {
					StringBuilder sb = new StringBuilder(txtSecondNumber.getText());
					sb.deleteCharAt(txtSecondNumber.getText().length() - 1);
					backspace =sb.toString();
					txtSecondNumber.setText(backspace);
					
				}
				
			}
		});
		btnArrow.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnArrow.setBounds(6, 112, 62, 69);
		frmCalculator.getContentPane().add(btnArrow);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstNumber.setText(null);
				txtSecondNumber.setText(null);
				textResult.setText(null);
				operations = null;
			}
		});
		btnC.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnC.setBounds(80, 112, 62, 69);
		frmCalculator.getContentPane().add(btnC);
		
		textResult = new JTextField();
		textResult.setBounds(6, 54, 285, 46);
		frmCalculator.getContentPane().add(textResult);
		textResult.setColumns(10);
			
		
//		-------------------- ROW 3 -------------------------
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
					if(!(operations == null))  {
						String enterNumber = txtSecondNumber.getText() + btn7.getText();
						txtSecondNumber.setText(enterNumber);
					}
					else {
						
						String enterNumber = txtFirstNumber.getText() + btn7.getText();
						txtFirstNumber.setText(enterNumber);
					}
				}
				catch (NumberFormatException ex ) {
					System.out.println("INVALID INPUT!...  Please enter a valid number !");
					JOptionPane.showMessageDialog(frmCalculator, "NO DATA ENTRY! ... Please enter valid integer ");
					
				}
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn7.setBounds(6, 194, 62, 69);
		frmCalculator.getContentPane().add(btn7);
		
		//******
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
					if(!(operations == null))  {
						String enterNumber = txtSecondNumber.getText() + btn8.getText();
						txtSecondNumber.setText(enterNumber);
					}
					else {
						
						String enterNumber = txtFirstNumber.getText() + btn8.getText();
						txtFirstNumber.setText(enterNumber);
					}
				}
				catch (NumberFormatException ex ) {
					System.out.println("INVALID INPUT!...  Please enter a valid number !");
					JOptionPane.showMessageDialog(frmCalculator, "NO DATA ENTRY! ... Please enter valid integer ");
				}
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn8.setBounds(80, 194, 62, 69);
		frmCalculator.getContentPane().add(btn8);
		
		//******
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(!(operations == null))  {
						String enterNumber = txtSecondNumber.getText() + btn9.getText();
						txtSecondNumber.setText(enterNumber);
					}
						else {
						
						String enterNumber = txtFirstNumber.getText() + btn9.getText();
						txtFirstNumber.setText(enterNumber);
						}
				}
				catch (NumberFormatException ex ) {
					System.out.println("INVALID INPUT!...  Please enter a valid number !");
					JOptionPane.showMessageDialog(frmCalculator, "NO DATA ENTRY! ... Please enter valid integer ");
				}
			}
		});
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn9.setBounds(155, 194, 62, 69);
		frmCalculator.getContentPane().add(btn9);
		
		//******
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					firstNumber = Double.parseDouble(txtFirstNumber.getText());
					operations = "+"; 
				}
				catch (NumberFormatException ex ) {
					System.out.println("INVALID INPUT!...  Please enter a valid number !");
					JOptionPane.showMessageDialog(frmCalculator, "INVALID INPUT!...  Please enter a valid number !\"");
				}
				
				
			}
		});
		btnPlus.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnPlus.setBounds(229, 194, 62, 69);
		frmCalculator.getContentPane().add(btnPlus);
		
//		-------------------- ROW 4 -------------------------
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(!(operations == null))  {
						String enterNumber = txtSecondNumber.getText() + btn4.getText();
						txtSecondNumber.setText(enterNumber);
					}
						else {
						
						String enterNumber = txtFirstNumber.getText() + btn4.getText();
						txtFirstNumber.setText(enterNumber);
						}
					}
				
				catch (NumberFormatException ex ) {
					System.out.println("INVALID INPUT!...  Please enter a valid number !");
					JOptionPane.showMessageDialog(frmCalculator, "INVALID INPUT!... Please enter valid integer ");
				}
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn4.setBounds(6, 275, 62, 69);
		frmCalculator.getContentPane().add(btn4);
		
		//******
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(!(operations == null))  {
						String enterNumber = txtSecondNumber.getText() + btn5.getText();
						txtSecondNumber.setText(enterNumber);
					}
					else {
						
						String enterNumber = txtFirstNumber.getText() + btn5.getText();
						txtFirstNumber.setText(enterNumber);
					}
				}
				
				catch (NumberFormatException ex ) {
					System.out.println("INVALID INPUT!...  Please enter a valid number !");
					JOptionPane.showMessageDialog(frmCalculator, "NO DATA ENTRY! ... Please enter valid integer ");
				}
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn5.setBounds(80, 275, 62, 69);
		frmCalculator.getContentPane().add(btn5);
		
		//******
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try { 
					if(!(operations == null))  {
						String enterNumber = txtSecondNumber.getText() + btn6.getText();
						txtSecondNumber.setText(enterNumber);
					}
						else {
						
						String enterNumber = txtFirstNumber.getText() + btn6.getText();
						txtFirstNumber.setText(enterNumber);
						}
				}
				
				catch (NumberFormatException ex ) {
					System.out.println("INVALID INPUT!...  Please enter a valid number !");
					JOptionPane.showMessageDialog(frmCalculator, "NO DATA ENTRY! ... Please enter valid integer ");
				}
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn6.setBounds(155, 275, 62, 69);
		frmCalculator.getContentPane().add(btn6);
		
		//******
		
		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				firstNumber = Double.parseDouble(txtFirstNumber.getText());
				//txtNumberEntered.setText("");
				operations = "-"; 
				}
				catch (NumberFormatException ex ) {
					System.out.println("INVALID INPUT!...  Please enter a valid number !");
					JOptionPane.showMessageDialog(frmCalculator, "NO DATA ENTRY! ... Please enter valid integer ");
				}
				
			}
		});
		btnSub.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSub.setBounds(228, 275, 62, 69);
		frmCalculator.getContentPane().add(btnSub);
		
//		-------------------- ROW 5 -------------------------
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try { 
					if(!(operations == null))  {
						String enterNumber = txtSecondNumber.getText() + btn1.getText();
						txtSecondNumber.setText(enterNumber);
					}
					else {
						
						String enterNumber = txtFirstNumber.getText() + btn1.getText();
						txtFirstNumber.setText(enterNumber);
					}
				}
				catch (NumberFormatException ex ) {
					System.out.println("INVALID INPUT!...  Please enter a valid number !");
					JOptionPane.showMessageDialog(frmCalculator, "NO DATA ENTRY! ... Please enter valid integer ");
				}
				
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn1.setBounds(6, 356, 62, 69);
		frmCalculator.getContentPane().add(btn1);
		
		//******
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(!(operations == null))  {
						String enterNumber = txtSecondNumber.getText() + btn2.getText();
						txtSecondNumber.setText(enterNumber);
					}
					else {
						
						String enterNumber = txtFirstNumber.getText() + btn2.getText();
						txtFirstNumber.setText(enterNumber);
					}
				
				}
				
				catch (NumberFormatException ex ) {
					System.out.println("INVALID INPUT!...  Please enter a valid number !");
					JOptionPane.showMessageDialog(frmCalculator, "NO DATA ENTRY! ... Please enter valid integer ");
				}
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn2.setBounds(80, 356, 62, 69);
		frmCalculator.getContentPane().add(btn2);
		
		//******
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(!(operations == null))  {
						String enterNumber = txtSecondNumber.getText() + btn3.getText();
						txtSecondNumber.setText(enterNumber);
					}
					else {
						
						String enterNumber = txtFirstNumber.getText() + btn3.getText();
						txtFirstNumber.setText(enterNumber);
					}
				
				}
				catch (NumberFormatException ex ) {
					System.out.println("INVALID INPUT!...  Please enter a valid number !");
					JOptionPane.showMessageDialog(frmCalculator, "NO DATA ENTRY! ... Please enter valid integer ");
				}
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn3.setBounds(155, 356, 62, 69);
		frmCalculator.getContentPane().add(btn3);
		
		//******
		
		btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					firstNumber = Double.parseDouble(txtFirstNumber.getText());
					operations = "*"; 
				}
				catch (NumberFormatException ex  ) {
					System.out.println("INVALID INPUT!...  Please enter a valid number !");
					JOptionPane.showMessageDialog(frmCalculator, "Please enter first integer ");
				}
				
			}
		});
		btnMul.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnMul.setBounds(228, 356, 62, 69);
		frmCalculator.getContentPane().add(btnMul);
		
		
//		-------------------- ROW 5 -------------------------
		
		
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(!(operations == null))  {
						String enterNumber = txtSecondNumber.getText() + btn0.getText();
						txtSecondNumber.setText(enterNumber);
					}
					else {
						
						String enterNumber = txtFirstNumber.getText() + btn0.getText();
						txtFirstNumber.setText(enterNumber);
					}
				}
				
				catch (NumberFormatException ex ) {
					System.out.println("INVALID INPUT!...  Please enter a valid number !");
					JOptionPane.showMessageDialog(frmCalculator, "Please enter first integer ");
				}
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn0.setBounds(6, 437, 62, 69);
		frmCalculator.getContentPane().add(btn0);
		
		//******
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(txtFirstNumber.getText().equals("")) {
						String enterNumber = txtFirstNumber.getText() + btnDot.getText();
						txtFirstNumber.setText(enterNumber);
					}
					else if(Double.parseDouble(txtFirstNumber.getText()) % 1 == 0) {
						
						txtFirstNumber.setText(txtFirstNumber.getText() + btnDot.getText());
					}
					else if(txtSecondNumber.getText().equals("")) {
						String enterNumber = txtSecondNumber.getText() + btnDot.getText();
						txtSecondNumber.setText(enterNumber);
					}
					else if(Double.parseDouble(txtSecondNumber.getText()) % 1 == 0) {
						
						txtSecondNumber.setText(txtSecondNumber.getText() + btnDot.getText());
					}
					else {
						
					}
				}
				
				catch(NumberFormatException ex) {
					
					JOptionPane.showMessageDialog(frmCalculator, "Please enter valid integer ");
				}
							
			}
		});
		btnDot.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnDot.setBounds(80, 437, 62, 69);
		frmCalculator.getContentPane().add(btnDot);
		
		//******
		
		btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer; 
				
				if(txtFirstNumber.getText().equals("")) {
					System.out.println("NO DATA ENTRY! ... Please enter first number ");
					JOptionPane.showMessageDialog(frmCalculator, "NO DATA ENTRY! ... Please enter first number ");
					return;
				}
				
				
				try {
					secondNumber = Double.parseDouble(txtSecondNumber.getText());
					if(txtSecondNumber.getText().equals("")) {
						System.out.println("NO DATA ENTRY! ... Please enter second number ");
						return;
					}
					
					  if(btnDot.getModel().isPressed()) {
						  txtSecondNumber.setText(txtSecondNumber.getText() + btnDot.getText());
					  }
					  
				}
				
				catch (NumberFormatException ex ) {
					System.out.println("INVALID INPUT!...Please enter second operand as an integer !");
					JOptionPane.showMessageDialog(frmCalculator, "INVALID INPUT!...Please enter second operand as an integer !");
				}
				
				try {
						if(operations == "+" ) {
							result = firstNumber + secondNumber;
							answer = String.format("%.2f", result);
							textResult.setText(answer);
						}
					
						else if(operations == "-" ) {
							result = firstNumber - secondNumber;
							answer = String.format("%.2f", result);
							textResult.setText(answer);
						}
					
						else if(operations == "*" ) {
							result = firstNumber * secondNumber;
							answer = String.format("%.2f", result);
							textResult.setText(answer);
						}
					
						else if(operations == "/") {
							if(secondNumber == 0) {
								System.out.println("Divisor cannot be zero");
								return;
							}
							result = firstNumber / secondNumber;
							answer = String.format("%.2f", result);
							textResult.setText(answer);
						}
						
						else if(operations == "%") {
							result = firstNumber % secondNumber;
							answer = String.format("%.2f", result);
							textResult.setText(answer);
						}
						
				}
					catch (NumberFormatException ex ) {
						System.out.println("Invalid");
						JOptionPane.showMessageDialog(frmCalculator, "Invalid entry");
					}
				}

		});
		btnEquals.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnEquals.setBounds(154, 113, 137, 69);
		frmCalculator.getContentPane().add(btnEquals);
		
		//******
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					firstNumber = Double.parseDouble(txtFirstNumber.getText());
					//txtNumberEntered.setText("");
					operations = "/"; 
					}
					catch (NumberFormatException ex ) {
						System.out.println("Invlid input : Please enter first operand as an Integer !");
						JOptionPane.showMessageDialog(frmCalculator, " Please enter valid integer ");
					}
				
			}
		});
		btnDiv.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnDiv.setBounds(228, 437, 62, 69);
		frmCalculator.getContentPane().add(btnDiv);
		
		btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					firstNumber = Double.parseDouble(txtFirstNumber.getText());
					//txtNumberEntered.setText("");
					operations = "%"; 
					}
					catch (NumberFormatException ex ) {
						System.out.println("Invlid input : Please enter first operand as an Integer !");
						JOptionPane.showMessageDialog(frmCalculator, " Invlid input : Please enter first operand as an Integer");
					}
				
			}
		});
		
		btnMod.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnMod.setBounds(155, 437, 62, 69);
		frmCalculator.getContentPane().add(btnMod);
		
		txtSecondNumber = new JTextField();
		txtSecondNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSecondNumber.setColumns(10);
		txtSecondNumber.setBounds(154, 6, 137, 46);
		frmCalculator.getContentPane().add(txtSecondNumber);
		

		
	}
}
