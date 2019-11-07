package seiseki;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author matsuirie
 * @since 2017/03/25
 * @version 1.0
 */
public interface JDBCTemplate {
	/**
	 *
	 * @return
	 * @throws SQLException
	 */
	public Connection dbConnection() throws SQLException;
	/**
	 *
	 * @param con
	 * @param startCom
	 * @throws SQLException
	 */
	public void setAutoCommit(Connection con, boolean startCom)throws SQLException;
	/**
	 *
	 * @param con
	 * @throws SQLException
	 */
	public void commit(Connection con) throws SQLException;
	/**
	 *
	 * @param con
	 * @throws SQLException
	 */
	public void rollback(Connection con) throws SQLException;
	/**
	 *
	 * @param con
	 * @throws SQLException
	 */
	public void conClose(Connection con) throws SQLException;
	/**
	 *
	 * @param con
	 * @throws SQLException
	 */
	public void psmtClose(PreparedStatement psmt) throws SQLException;
	/**
	 *
	 * @param con
	 * @throws SQLException
	 */
	public void rstClose(ResultSet rst) throws SQLException;

}
