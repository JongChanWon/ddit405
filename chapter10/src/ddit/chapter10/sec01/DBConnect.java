package ddit.chapter10.sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	// 싱글톤
	// db랑 연결하려면 하나만 있어야 한다. 여러개 있으면 stack overflower에러 날 수 있음
	private static DBConnect instance = null;

	private DBConnect() {

	}

	public static DBConnect getInstance() {
		if (instance == null) {
			instance = new DBConnect();
		}
		return instance;
	}

	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "pc28";
	private String passwd = "java";

	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;

	public void connect() {
		try {
			conn = DriverManager.getConnection(url, user, passwd);
			String sql = "select * from EMP";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String empNo = rs.getString("EMPNO");
				String eName = rs.getString("ENAME");
				String deptNo = rs.getString("DEPTNO");
				String job = rs.getString("JOB");
				int salary = rs.getInt("SAL");
				String mgr = rs.getString("MGR");

				System.out.println(empNo + "\t" + eName + "\t" + deptNo + "\t" + job + "\t" + salary + "\t" + mgr);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}finally { // 연결설정은 꼭 마지막에 닫아줘야 다음껄 받아올 수 있어서 꼭 닫아줘야함,,, 제일 마지막에 연 순서로 닫아줘야
			if(rs!=null) {try {rs.close();} catch (Exception e2) {}}
			if(stmt!=null) {try {stmt.close();} catch (Exception e2) {}}
			if(conn!=null) {try {conn.close();} catch (Exception e2) {}}
		}
	}
}
