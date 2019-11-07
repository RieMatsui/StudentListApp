package seiseki;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * @author matsuirie
 * @since 2017/03/25
 * @version 1.0
 */
public class Meibo01_menuUI {

	private JFrame frame;
	private JButton btnResister;
	private JButton btnFind;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JButton btnLogout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try{
					Meibo01_menuUI window = new Meibo01_menuUI();
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
	public Meibo01_menuUI() {
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

		JLabel lblNewLabel = new JLabel("学生名簿登録アプリケーション");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(215, 38, 296, 40);
		frame.getContentPane().add(lblNewLabel);

		JButton bt_login = new JButton("ログイン");
		bt_login.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		bt_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Meibo02_loginUI.main(null);
				frame.setVisible(false);

			}
		});
		bt_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bt_login.setBounds(80, 110, 199, 46);
		frame.getContentPane().add(bt_login);

		btnLogout = new JButton("ログアウト");
		btnLogout.setEnabled(false);
		btnLogout.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

			}
		});
		btnLogout.setBounds(80, 233, 199, 46);
		frame.getContentPane().add(btnLogout);

		btnFind = new JButton("検索");
		btnFind.setEnabled(false);
		btnFind.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnFind.setBounds(402, 263, 199, 46);
		frame.getContentPane().add(btnFind);

		btnResister = new JButton("登録");
		btnResister.setEnabled(false);
		btnResister.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnResister.setBounds(402, 110, 199, 46);
		frame.getContentPane().add(btnResister);

		btnUpdate = new JButton("更新");
		btnUpdate.setEnabled(false);
		btnUpdate.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdate.setBounds(402, 184, 199, 46);
		frame.getContentPane().add(btnUpdate);

		btnDelete = new JButton("削除");
		btnDelete.setEnabled(false);
		btnDelete.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnDelete.setBounds(402, 357, 199, 46);
		frame.getContentPane().add(btnDelete);

		JButton btnFinish = new JButton("終了");
		btnFinish.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
			}
		});
		btnFinish.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnFinish.setBounds(80, 357, 199, 46);
		frame.getContentPane().add(btnFinish);
	}


}
