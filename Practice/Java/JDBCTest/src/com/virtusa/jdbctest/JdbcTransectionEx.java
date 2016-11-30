package com.virtusa.jdbctest;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTransectionEx {

	public static void main(String a[]) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			PreparedStatement ps = con.prepareStatement("insert into image values(?,?)");
			ps.setInt(1, 1);
			InputStream fin = new FileInputStream("a.jpg");
			//ps.setBinaryStream(2, fin, fin.available());
			ps.setBinaryStream(2,fin);
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");
			PreparedStatement preparedStatement = con.prepareStatement("select image.* from image");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				System.out.println(resultSet.getInt(1) + " " + resultSet.getBlob(2));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}