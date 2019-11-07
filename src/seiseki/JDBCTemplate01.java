package seiseki;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public class JDBCTemplate01 implements JDBCTemplate {

	public JDBCTemplate01() {
	}

	@Override
	public Connection dbConnection() throws SQLException {
		Connection con = null;
		try{
			//接続ドライバの指定
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}

		con = DriverManager.getConnection("jdbc:mysql://192.168.33.10/my_meibo","root","lFSi8Qnsl8zQ5hYU");

		return con;
	}

	@Override
	public void setAutoCommit(Connection con, boolean startCom) throws SQLException {
		con.setAutoCommit(startCom);
	}

	@Override
	public void commit(Connection con) throws SQLException {
		con.commit();
	}

	@Override
	public void rollback(Connection con) throws SQLException {
		con.rollback();
	}

	@Override
	public void conClose(Connection con) throws SQLException {
		if(con != null){
			con.close();
		}
	}


	@Override
	public void psmtClose(PreparedStatement psmt) throws SQLException {
		if(psmt != null){
			psmt.close();
		}
	}

	@Override
	public void rstClose(ResultSet rst) throws SQLException {
		if(rst != null){
			rst.close();
		}
	}

}
