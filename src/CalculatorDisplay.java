import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorDisplay {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/**
	 * variavies para soma e valores reservados
	 */
	Double valor1 , valor2;
	String sinal; 
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorDisplay window = new CalculatorDisplay();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorDisplay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 313, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtDisplay = new JTextPane();
		txtDisplay.setEditable(false);
		txtDisplay.setBounds(27, 11, 260, 60);
		frame.getContentPane().add(txtDisplay);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_7.getText());
			}
		});
		button_7.setBounds(27, 93, 44, 30);
		frame.getContentPane().add(button_7);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_4.getText());
			}
		});
		button_4.setBounds(27, 130, 44, 30);
		frame.getContentPane().add(button_4);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText(txtDisplay.getText() + button_1.getText());
			}
		});
		button_1.setBounds(27, 170, 44, 30);
		frame.getContentPane().add(button_1);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_8.getText());
			}
		});
		button_8.setBounds(81, 93, 44, 30);
		frame.getContentPane().add(button_8);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_5.getText());
			}
		});
		button_5.setBounds(81, 130, 44, 30);
		frame.getContentPane().add(button_5);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_2.getText());
			}
		});
		button_2.setBounds(81, 170, 44, 30);
		frame.getContentPane().add(button_2);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_0.getText());
			}
		});
		button_0.setBounds(27, 211, 98, 39);
		frame.getContentPane().add(button_0);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_9.getText());
			}
			
			
		});
		button_9.setBounds(135, 93, 44, 30);
		frame.getContentPane().add(button_9);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_6.getText());
			}
		});
		button_6.setBounds(135, 130, 44, 30);
		frame.getContentPane().add(button_6);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_3.getText());
			}
		});
		button_3.setBounds(135, 170, 44, 30);
		frame.getContentPane().add(button_3);
		
		JButton button_dot = new JButton(".");
		button_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText() + button_dot.getText());
			}
		});
		button_dot.setBounds(135, 211, 44, 39);
		frame.getContentPane().add(button_dot);
		
		JButton button_divide = new JButton("/");
		button_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtDisplay.getText());  //pega o valor 
				txtDisplay.setText("");  //limpar o display
				sinal = "dividir";				
			}
		});
		button_divide.setBounds(243, 215, 44, 30);
		frame.getContentPane().add(button_divide);
		
		JButton button_multiply = new JButton("*");
		button_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtDisplay.getText());  //pega o valor 
				txtDisplay.setText("");  //limpar o display
				sinal = "multiplicar";
			}
		});
		button_multiply.setBounds(243, 93, 44, 30);
		frame.getContentPane().add(button_multiply);
		
		JButton button_menos = new JButton("-");
		button_menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				valor1 = Double.parseDouble(txtDisplay.getText());  //pega o valor 
				txtDisplay.setText("");  //limpar o display
				sinal = "menos";
			}
		});
		button_menos.setBounds(243, 170, 44, 30);
		frame.getContentPane().add(button_menos);
		
		JButton button_plus = new JButton("+");
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
			valor1 = Double.parseDouble(txtDisplay.getText());  //pega o valor 
			txtDisplay.setText("");  //limpar o display
			sinal = "soma";
			}
		});
		button_plus.setBounds(243, 130, 44, 30);
		frame.getContentPane().add(button_plus);
		
		JButton button_equal = new JButton("=");
		button_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtDisplay.getText()); 
				if (sinal == "soma") {
					txtDisplay.setText(String.valueOf(valor1+valor2));   //valueof para converter string 
				}
				
				if (sinal == "menos") {
					txtDisplay.setText(String.valueOf(valor1-valor2));
				}
				
				if (sinal == "multiplicar") {
					txtDisplay.setText(String.valueOf(valor1*valor2));
				}
				
				if (sinal == "dividir") {
					txtDisplay.setText(String.valueOf(valor1/valor2));
				}
								
					}
		});
		button_equal.setBounds(189, 170, 44, 80);
		frame.getContentPane().add(button_equal);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = null;
				valor2 = null;
				txtDisplay.setText("");
			}
		});
		btnC.setBounds(189, 130, 44, 30);
		frame.getContentPane().add(btnC);
		
		JButton button_del = new JButton("DEL");
		button_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");
			}
		});
		button_del.setBounds(189, 93, 51, 30);
		frame.getContentPane().add(button_del);
	}
}
