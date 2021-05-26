import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Exercise5_1 {

	private JFrame frame;
	private JTextField Num1TextField;
	private JTextField Num2TextField;
	private JTextField AnsTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise5_1 window = new Exercise5_1();
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
	public Exercise5_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 222, 173));
		frame.getContentPane().setForeground(new Color(204, 255, 204));
		frame.setBounds(100, 100, 801, 572);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Num1TextField = new JTextField();
		Num1TextField.setHorizontalAlignment(SwingConstants.CENTER);
		Num1TextField.setFont(new Font("Times New Roman", Font.BOLD, 25));
		Num1TextField.setBounds(152, 106, 189, 59);
		frame.getContentPane().add(Num1TextField);
		Num1TextField.setColumns(10);
		
		Num2TextField = new JTextField();
		Num2TextField.setHorizontalAlignment(SwingConstants.CENTER);
		Num2TextField.setFont(new Font("Times New Roman", Font.BOLD, 25));
		Num2TextField.setBounds(409, 106, 189, 59);
		frame.getContentPane().add(Num2TextField);
		Num2TextField.setColumns(10);
		
		JButton AddButton = new JButton("ADD");
		AddButton.setBackground(new Color(255, 192, 203));
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(Num1TextField.getText());
					num2 = Integer.parseInt(Num2TextField.getText());
					
					ans = num1 + num2;
					
					AnsTextField.setText(Integer.toString(ans));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter A Valid Number");
				}
			}
		});
		AddButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		AddButton.setBounds(193, 223, 148, 65);
		frame.getContentPane().add(AddButton);
		
		JButton MinusButton = new JButton("MINUS");
		MinusButton.setBackground(new Color(255, 192, 203));
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(Num1TextField.getText());
					num2 = Integer.parseInt(Num2TextField.getText());
					
					ans =num1-num2;
					
					AnsTextField.setText(Integer.toString(ans));
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter A Valid Number");
				}
			}
		});
		MinusButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		MinusButton.setBounds(409, 223, 148, 65);
		frame.getContentPane().add(MinusButton);
		
		JLabel AnsLabel = new JLabel("The Answer is ");
		AnsLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		AnsLabel.setBounds(141, 366, 166, 45);
		frame.getContentPane().add(AnsLabel);
		
		AnsTextField = new JTextField();
		AnsTextField.setFont(new Font("Times New Roman", Font.BOLD, 25));
		AnsTextField.setBounds(311, 359, 307, 59);
		frame.getContentPane().add(AnsTextField);
		AnsTextField.setColumns(10);
	}
}