package com.assign.hsqldb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HSQLDBExam {

	public static final String Create_Empl_Tbl = "CREATE TABLE emp_test_tbl (emp_id INT NOT NULL, emp_name VARCHAR(50) NOT NULL, dept_id INT NOT NULL, addr_id INT NOT NULL, PRIMARY KEY (emp_id))";
	public static final String Create_Dept_Tbl = "CREATE TABLE dept_test_tbl (dept_id INT NOT NULL, dept_name VARCHAR(50) NOT NULL, PRIMARY KEY (dept_id))";
	public static final String Create_Addr_Tbl = "CREATE TABLE addr_test_tbl (addr_id INT NOT NULL, hno INT NOT NULL, street VARCHAR(50) NOT NULL, City VARCHAR(20) NOT NULL, state VARCHAR(20) NOT NULL, Zipcode INT NOT NULL, PRIMARY KEY (addr_id))";
	public static final String Insert_Empl_Tbl = "INSERT INTO emp_test_tbl VALUES (?,?, ?, ?)";
	public static final String Insert_Empl_Tbl1 = "INSERT INTO emp_test_tbl VALUES (1001, \"Krish\", 201, 601)";
	public static final String Update_Empl_Tbl1 = "UPDATE emp_test_tbl SET emp_name =?, dept_id=?, addr_id =? WHERE emp_id = ?";
	public static final String Insert_DEPT_Tbl1 = "INSERT INTO dept_test_tbl VALUES (204, \"Electronics\")";
	public static final String Insert_DEPT_Tbl2 = "INSERT INTO dept_test_tbl VALUES  (201, 'Mechanical'),\r\n"
			+ "(202, 'CIVIL'),\r\n" + "(203, 'ELECTRICAL')";
	public static final String Insert_ADDR_Tbl2 = "INSERT INTO addr_test_tbl VALUES (601,214, 'w side','Ellicott City', 'MD',20876)";
	public static final String Insert_ADDR_Tbl = "INSERT INTO addr_test_tbl VALUES (601,214, 'w side','Ellicott City', 'MD',20876),\r\n"
			+ "	(602,215, 'w side','Ellicott City', 'MD',20876),\r\n"
			+ "	(603,216, 'w side','Ellicott City', 'MD',20876),\r\n"
			+ "	(604,217, 'w side','Ellicott City', 'MD',20876),\r\n"
			+ "	(605,218, 'w side','Ellicott City', 'MD',20876),\r\n"
			+ "	(606,219, 'w side','Ellicott City', 'MD',20876),\r\n"
			+ "	(607,314, 'w side','Ellicott City', 'MD',20876),\r\n"
			+ "	(608,315, 'w side','Ellicott City', 'MD',20876),\r\n"
			+ "	(609,316, 'w side','Ellicott City', 'MD',20876),\r\n"
			+ "	(610,317, 'w side','Ellicott City', 'MD',20876),\r\n"
			+ "	(611,318, 'w side','Ellicott City', 'MD',20876),\r\n"
			+ "	(612,319, 'w side','Ellicott City', 'MD',20876)";
	public static final String GET_EMP_data = "select  a.emp_id, a.emp_name, a.dept_id , a.addr_id  from \r\n"
			+ "(SELECT emp.emp_id, emp.emp_name, emp.dept_id , emp.addr_id \r\n"
			+ " FROM  emp_test_tbl emp  join  dept_test_tbl dept \r\n" + "	on dept.dept_id = emp.dept_id ) a \r\n"
			+ "join addr_test_tbl addr \r\n" + "	ON addr.addr_id = a.addr_id ";

	public static void main(String[] args) {

		Connection con = HSQLDBConnection.getConnection();
		System.out.println("Connection Obtained");

		int result = 0;
		Statement stmt = null;
		Statement stmt1 = null;
		Statement stmt2 = null;

		Address addr = new Address(601, 214, "West SideDrive", "CampHill", "PA", 17011);

		List<Integer> addrID = new ArrayList<Integer>();
		addrID.add(addr.getAddrIDd());

		Employee emp = new Employee(1001, "Krish", 201, addrID);

		Department dpt = new Department(201, "Mechanical");

		try {

			stmt = con.createStatement();

			System.out.println("Before Create_Empl_Tbl");
			result = stmt.executeUpdate(Create_Empl_Tbl);
			result = stmt.executeUpdate(Create_Dept_Tbl);
			result = stmt.executeUpdate(Create_Addr_Tbl);
			System.out.println("After Create_Empl_Tbl");
			// PreparedStatement ps2 = con.prepareStatement(Insert_Empl_Tbl);
			PreparedStatement ps1 = con
					.prepareStatement("INSERT INTO emp_test_tbl VALUES (1001, 'Krish1', 201, 601),\r\n"
							+ "(1002, 'Krish2', 201, 602),\r\n" + "(1003, 'Krish3', 202, 602),\r\n"
							+ "(1004, 'Krish4', 202, 604),\r\n" + "(1005, 'Krish5', 202, 605),\r\n"
							+ "(1006, 'Krish6', 203, 606),\r\n" + "(1007, 'Krish7', 203, 607)");
			ps1.executeUpdate();
			PreparedStatement ps2 = con.prepareStatement("INSERT INTO emp_test_tbl VALUES (2001, 'Ram', 202, 602)");
			ps2.executeUpdate();
			System.out.println("After Insert_Empl_Tbl");
			PreparedStatement ps3 = con.prepareStatement(Update_Empl_Tbl1);
			ps3.setString(1, "Rahul");
			ps3.setInt(2, 5555);
			ps3.setInt(3, 606);
			ps3.setInt(4, 1001);
			ps3.executeUpdate();

			// dept table
			PreparedStatement ps4 = con.prepareStatement(Insert_DEPT_Tbl2);
			ps4.executeUpdate();
			//Address table
			PreparedStatement ps5 = con.prepareStatement(Insert_ADDR_Tbl);
			ps5.executeUpdate();
			PreparedStatement ps6 = con.prepareStatement(GET_EMP_data);
			ResultSet rs = ps6.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("emp_id") + " | " + rs.getString("emp_name") + " | " + rs.getInt("dept_id")
						+ " | " + rs.getString("addr_id"));
			}

			stmt.close();
			ps1.close();
			ps2.close();
			ps3.close();
			ps4.close();
			ps5.close();
			ps6.close();

			con.commit();

		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {

		}

	}
}
