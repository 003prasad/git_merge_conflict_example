package com.sms;

import java.sql.*;

public class StudentDAO {
	public void addStud(Student s) {
		try {
			Connection con = DBConnection.getConnection();
			String sql = "Insert Into student(name, email, course) Values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, s.getName());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getCourse());
			
			ps.executeUpdate();
			System.out.println("Student Added Successfully");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void viewStudents() {
		try {
			Connection con = DBConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from student");
			while(rs.next()) {
				System.out.println(
						rs.getInt("id") + " "+
						rs.getString("name") + " "+
						rs.getString("email") + " " +
						rs.getString("course") 
						);
			}
		}
		catch(Exception e) {
			  e.printStackTrace();
		}
	}
}
