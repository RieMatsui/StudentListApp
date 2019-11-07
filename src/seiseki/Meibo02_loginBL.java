package seiseki;

import javax.swing.JOptionPane;
import java.sql.Connection;

public class Meibo02_loginBL {
	/**
	 *
	 * @author matsuirie
	 * @since 2017/03/25
	 * @version 1.0
	 */
	public Meibo02_loginBL() {
	}

	/**
	 *
	 * @param _paramData
	 * @return 空チェックを行い、結果をboolean型で返す
	 */
	public boolean checkNull(Meibo02_loginDAO _paramData){

		if(_paramData.getStr_teacherId().isEmpty()){
			//教員IDが入力されていない時Error表示
			JOptionPane.showMessageDialog(null,
					   					  "TEST MESEEAGE>教員IDがありません",
					   					  "TEST TITLE>エラー",
					   					  JOptionPane.INFORMATION_MESSAGE);

		return false;

		}else if(_paramData.getStr_teacherPw().isEmpty()){
			//教員PWが入力されていない時
			JOptionPane.showMessageDialog(null,
										"TEST MESSAGE>教員パスワードがありません",
										"TEST TITLE>エラー",
										JOptionPane.INFORMATION_MESSAGE);
		return false;

		}

		return true;
	}


	public boolean confirmPw(Meibo02_loginDAO _paramData){

		Meibo02_loginData vrb_Meibo02_Date = new Meibo02_loginData();

		JDBCTemplate vrb_jdbc = new JDBCTemplate01();

		Connection vrb_con;


		String rst = null;

		try{

			//データベースに接続する
			vrb_con = vrb_jdbc.dbConnection();
			rst = vrb_Meibo02_Date.findTeacherId(vrb_con,
												_paramData.getStr_teacherId(),
												_paramData.getStr_teacherPw());

			if(rst == null){
				JOptionPane.showMessageDialog(null,
											  "TESTMESSAGE>教員番号またはパスワードがちがいます",
											  "TITLE>エラー",
											  JOptionPane.INFORMATION_MESSAGE);
				return false;
			}

		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;

	}

	public boolean checkInformation(Meibo02_loginDAO _paramDto){

		if(!checkNull(_paramDto)){
			return false;
		}else if(!confirmPw(_paramDto)){
			return false;
		}else{
			JOptionPane.showMessageDialog(null,
										  "TESTMESSAGE>メニュー画面に戻ります",
										  "TITLE>ログインが完了しました",
										  JOptionPane.INFORMATION_MESSAGE);
			return true;
		}

	}

}
