package seiseki;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Meibo04_InsertUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Meibo04_InsertUI window = new Meibo04_InsertUI();
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
	public Meibo04_InsertUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("学生名簿アプリケーション");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setBounds(154, 6, 457, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("学生ID");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1.setBounds(141, 70, 102, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(256, 71, 260, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("生徒名");
		label.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		label.setBounds(141, 129, 102, 35);
		frame.getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(256, 130, 260, 35);
		frame.getContentPane().add(textField_1);
		
		JLabel label_1 = new JLabel("年齢");
		label_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		label_1.setBounds(141, 187, 102, 35);
		frame.getContentPane().add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(256, 188, 260, 35);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(256, 255, 353, 35);
		frame.getContentPane().add(textField_3);
		
		JLabel label_2 = new JLabel("住所");
		label_2.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		label_2.setBounds(141, 254, 102, 35);
		frame.getContentPane().add(label_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(256, 302, 353, 35);
		frame.getContentPane().add(textField_4);
		
		JButton button = new JButton("登録");
		button.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button.setBounds(269, 377, 199, 46);
		frame.getContentPane().add(button);
	}
}
