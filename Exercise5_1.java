import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercise5_1 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

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
		frame.setBounds(100, 100, 997, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(93, 68, 276, 45);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(494, 68, 276, 45);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans = num1+num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
				
			}
		});
		btnNewButton.setBounds(136, 171, 197, 47);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans = num1-num2;
					textFieldAns.setText(Integer.toString(ans));
					
				}catch(Exception e1){
				JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
					
			}
		});
		btnNewButton_1.setBounds(531, 171, 197, 47);
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(326, 277, 276, 45);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The Answer is");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(73, 281, 180, 42);
		frame.getContentPane().add(lblNewLabel);
	}
}
