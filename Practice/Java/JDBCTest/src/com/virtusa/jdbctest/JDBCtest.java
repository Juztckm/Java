package com.virtusa.jdbctest;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class JDBCtest {

	/**
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String query = "select id,name from abc";
		int newID;

		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet resultSet = statement.executeQuery(query);
		PreparedStatement preparedStatement;
		connection.setAutoCommit(false);

		
		
		statement.addBatch("update abc set id = 2 where id = 1");
		statement.addBatch("update abc set id = 1 where id = 2");
		statement.executeBatch();
		connection.commit();
		System.out.println(connection.getMetaData().getDatabaseProductName());
		System.out.print("CRUD : \n\n\t\t1:Select\n\t\t2:Update\n\t\t3:Delete\n\t\t4:Insert\n\t\t5:Insert ProcedureCall\n\nEnter Choice : ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
			case 1 :
				// resultSet.afterLast();
				resultSet.absolute(3);
				// resultSet.deleteRow();
				while (resultSet.next()) {
					newID = resultSet.getInt("id") + 5;
					resultSet.updateInt("id", newID);
					resultSet.updateRow();
					System.out.println(resultSet.getInt(1) + " "
							+ resultSet.getString(2));
				}
				break;
			case 2 :
				System.out.print("Enter id :  ");
				int id = scanner.nextInt();
				query = "update abc set id = id + ? where id = 1";
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, id);
				preparedStatement.execute();
				break;
			case 3 :
				System.out.print("Enter ID :  ");
				id = scanner.nextInt();
				resultSet.absolute(3);
				resultSet.deleteRow();
				break;
			case 4 :
				System.out.println("Inserting a new record...");
				resultSet.moveToInsertRow();
				resultSet.updateInt("id", 104);
				resultSet.updateString("name", "JUZT");
				// Commit row
				resultSet.insertRow();
				break;
			case 5:
				CallableStatement callableStatement = connection.prepareCall("{call procedureTestJDBC(?,?)}");
				callableStatement.setInt(1, 1);
				callableStatement.setString(2, "name");
				callableStatement.execute();
			case 6:
				
			default :
				break;
		}

		connection.close();
		scanner.close();
	}

}

// while(resultSet.next()){
// System.out.println(resultSet.getInt("EMPLOYEE_ID") + "     " +
// resultSet.getString("FIRST_NAME") + "     " +
// resultSet.getString("LAST_NAME") + "     " +
// resultSet.getString("EMAIL") + "     " +
// resultSet.getString("PHONE_NUMBER") + "     " +
// resultSet.getDate("HIRE_DATE") + "     " +
// resultSet.getString("JOB_ID") + "     " +
// resultSet.getDouble("SALARY") + "     " +
// resultSet.getInt("COMMISSION_PCT") + "     " +
// resultSet.getInt("MANAGER_ID") + "     " +
// resultSet.getInt("DEPARTMENT_ID"));
// }
