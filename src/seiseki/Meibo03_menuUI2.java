package seiseki;

import java.awt.EventQueue;
import java.sql.Connection;

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
public class Meibo03_menuUI2 {

	private JFrame frame;
	private JButton btnResister;
	private JButton btnFind;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JButton btnLogout;
	private String userId;
	private String userName;

	/**
	 * Launch the application.
	 */
	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try{
					Meibo03_menuUI2 window = new Meibo03_menuUI2(args);
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
	public Meibo03_menuUI2(String[] args) {
		setUserId(args[0]);
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
		bt_login.setBounds(80, 189, 199, 46);
		frame.getContentPane().add(bt_login);

		btnLogout = new JButton("ログアウト");
		btnLogout.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Meibo01_menuUI.main(null);
				frame.setVisible(false);
			}
		});
		btnLogout.setBounds(80, 288, 199, 46);
		frame.getContentPane().add(btnLogout);

		btnFind = new JButton("検索");
		btnFind.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnFind.setBounds(402, 305, 199, 46);
		frame.getContentPane().add(btnFind);

		btnResister = new JButton("登録");
		btnResister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnResister.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnResister.setBounds(402, 189, 199, 46);
		frame.getContentPane().add(btnResister);

		btnUpdate = new JButton("更新");
		btnUpdate.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdate.setBounds(402, 247, 199, 46);
		frame.getContentPane().add(btnUpdate);

		btnDelete = new JButton("削除");
		btnDelete.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnDelete.setBounds(402, 369, 199, 46);
		frame.getContentPane().add(btnDelete);

		JButton btnFinish = new JButton("終了");
		btnFinish.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
			}
		});
		btnFinish.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		btnFinish.setBounds(80, 369, 199, 46);
		frame.getContentPane().add(btnFinish);

		JLabel lblNewLabel_1 = new JLabel("ようこそ" + getUserName() + "さん");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(80, 103, 213, 29);
		frame.getContentPane().add(lblNewLabel_1);
	}

	private void setUserId(String userId){
		this.userId = userId;
	}

	private String getUserId(){
		return userId;
	}

	private String getUserName(){

		JDBCTemplate vrb_jdbc = new JDBCTemplate01();
		Meibo02_loginData vrb_meibo02_Data = new Meibo02_loginData();

		Connection vrb_con;


		try{
			vrb_con = vrb_jdbc.dbConnection();
			userName = vrb_meibo02_Data.findTeacherName(vrb_con,getUserId());
		}catch(Exception e){
			e.printStackTrace();

		}

		return userName;
	}

}
