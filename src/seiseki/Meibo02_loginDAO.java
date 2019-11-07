package seiseki;

/**
 *
 * @author matsuirie
 * @since 2017/03/25
 * @version 1.0
 */
public class Meibo02_loginDAO {

	String str_teacherId = null;

	String str_teacherPw = null;

	public Meibo02_loginDAO() {
	}

	public Meibo02_loginDAO(String str_teacherId,
							String str_teacherPw){

	this.setStr_teacherId(str_teacherId);
	this.setStr_teacherPw(str_teacherPw);

	}

	public String getStr_teacherId() {
		return str_teacherId;
	}

	public void setStr_teacherId(String str_teacherId) {
		this.str_teacherId = str_teacherId;
	}

	public String getStr_teacherPw() {
		return str_teacherPw;
	}

	public void setStr_teacherPw(String str_teacherPw) {
		this.str_teacherPw = str_teacherPw;
	}

}
