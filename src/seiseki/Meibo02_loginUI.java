package seiseki;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * @author matsuirie
 * @since 2017/03/25
 * @version 1.0
 */

public class Meibo02_loginUI {

	private JFrame frame;
	private JTextField tfTeacherPw;
	private JTextField tfTeacherId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Meibo02_loginUI window = new Meibo02_loginUI();
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
	public Meibo02_loginUI() {
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

		JLabel label = new JLabel("学生名簿登録アプリケーション");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		label.setBounds(215, 23, 296, 40);
		frame.getContentPane().add(label);

		JLabel lblNewLabel = new JLabel("ログインするには教員IDとパスワードを入力してください");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(79, 125, 452, 28);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("教員ID");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1.setBounds(137, 205, 150, 28);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel label_1 = new JLabel("教員パスワード");
		label_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		label_1.setBounds(137, 285, 150, 28);
		frame.getContentPane().add(label_1);

		tfTeacherPw = new JTextField();
		tfTeacherPw.setBounds(299, 283, 296, 34);
		frame.getContentPane().add(tfTeacherPw);
		tfTeacherPw.setColumns(10);

		tfTeacherId = new JTextField();
		tfTeacherId.setColumns(10);
		tfTeacherId.setBounds(299, 203, 296, 34);
		frame.getContentPane().add(tfTeacherId);

		JButton button = new JButton("戻る");
		button.addMouseListener(new MouseAdapter() {

			//戻るボタンを押下したとき
			@Override
			public void mouseClicked(MouseEvent e) {
				Meibo01_menuUI.main(null);
			    frame.setVisible(false);
			}
		});
		button.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button.setBounds(108, 393, 150, 40);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("ログイン");
		button_1.addMouseListener(new MouseAdapter() {
			//ログインボタンを押下したとき
			@Override
			public void mouseClicked(MouseEvent e) {

				//教員ID
				String str_teacherId = null;

				//教員パスワード
				String str_teacherPw = null;

				//入力項目を代入
				str_teacherId = tfTeacherId.getText();

				//入力項目を代入
				str_teacherPw = tfTeacherPw.getText();

				Meibo02_loginDAO  vrb_meibo02_Dao = new Meibo02_loginDAO(str_teacherId, str_teacherPw);

				Meibo02_loginBL vrb_meibo02_Bl = new Meibo02_loginBL();

				if(!vrb_meibo02_Bl.checkInformation(vrb_meibo02_Dao)){

				}else{
					String[] args = {str_teacherId};

					Meibo03_menuUI2.main(args);
					frame.setVisible(false);

				}

			}
		});
		button_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		button_1.setBounds(499, 393, 150, 40);
		frame.getContentPane().add(button_1);
	}

}
