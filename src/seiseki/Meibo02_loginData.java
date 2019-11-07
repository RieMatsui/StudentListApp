package seiseki;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


public class Meibo02_loginData {

	public Meibo02_loginData() {

	}
	/**
	 *
	 * @param con
	 * @param teacherId
	 * @param teacherPassword
	 * @return
	 * @throws SQLException
	 */
	public String findTeacherId(Connection con,String teacherId, String teacherPassword) throws SQLException{

		String rsCol_id = null;
		String rsCol_password = null;
		String rsCol_name = null;
		StringBuilder sb = new StringBuilder();
		ResultSet rst = null;
		PreparedStatement pstmt = null;

		sb.append("SELECT");
		sb.append(" TEACHER_ID,TEACHER_PASSWORD,CREATE_NAME");
		sb.append(" FROM");
		sb.append(" t_teacher");
		sb.append(" WHERE");
		sb.append(" TEACHER_ID= ");
		sb.append(" ?");

		//SQL文を宣言すること記載

		pstmt = con.prepareStatement(sb.toString());
		pstmt.setString(1,teacherId);
		rst = pstmt.executeQuery();

		while(rst.next()){

			rsCol_id = rst.getString("TEACHER_ID");
			rsCol_password = rst.getString("TEACHER_PASSWORD");
			rsCol_name = rst.getString("CREATE_NAME");
		}


		if(rsCol_id == null){
			return null;
		}

		else if(!rsCol_id.equals(teacherId) || !rsCol_password.equals(teacherPassword)){

			return null;
		}else {
			return rsCol_name;
		}

	}

	public String findTeacherName(Connection con, String userId) throws SQLException{

		String rsCol_name = null;
		StringBuilder sb = new StringBuilder();
		ResultSet res = null;
		PreparedStatement pstmt = null;

		sb.append(" SELECT");
		sb.append(" TEACHER_ID, CREATE_NAME");
		sb.append(" FROM");
		sb.append(" t_teacher");
		sb.append(" WHERE");
		sb.append(" TEACHER_ID= ");
		sb.append(" ?");

		pstmt = con.prepareStatement(sb.toString());
		pstmt.setString(1, userId);
		res = pstmt.executeQuery();

		while(res.next()){
		rsCol_name = res.getString("CREATE_NAME");
		}

		System.out.println(rsCol_name);

		return rsCol_name;
	}

}
