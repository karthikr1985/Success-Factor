import java.sql.*;
import java.utils.*;

public class EmployeeLoginDetails {
	
	public void method6() {
		String QUERY1 = "SELECT INSTR('Melbourne, Australia', 'a', -1)";
		String QUERY2 = "into sal1";
		String Query3 = "FROM DUAL";

// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL1, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY1 + QUERY2 + QUERY3)) {
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void method7() {

 String QUERY1 = "SELECT unique"; 
 String QUERY2 = "col1";
 String QUERY3 = "FROM";
 String Query4 = "table1;"



      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL1, USER, PASS);
         Statement stmt = conn.createStatement();   
       ResultSet rs = stmt.executeQuery(QUERY1 + QUERY2+ QUERY3+QUERY4)){ 
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }

	public void method8() {
		String QUERY1 = "SELECT";
		String QUERY2 = "DBMS_RANDOM.VALUE";
		String QUERY3 = "FROM";
		String Query4 = "DUAL";

// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL1, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY1 + QUERY2 + QUERY3 + QUERY4)) {
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void method9() {

		String q = "SELECT DBMS_RANDOM.VALUE FROM DUAL";
		try (Connection conn = DriverManager.getConnection(DB_URL1, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(q)) {
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	

	public void method10() {

		try (Connection conn = DriverManager.getConnection(DB_URL1, USER, PASS);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT DBMS_RANDOM.VALUE FROM DUAL")) {
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	

}
