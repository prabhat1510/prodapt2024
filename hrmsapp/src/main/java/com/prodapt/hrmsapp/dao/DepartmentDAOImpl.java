package com.prodapt.hrmsapp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.prodapt.hrmsapp.exceptions.DepartmentNotFoundException;
import com.prodapt.hrmsapp.model.Department;
import com.prodapt.hrmsapp.utility.DBConnectionUtil;
import com.prodapt.hrmsapp.utility.QUERYMAPPER;

public class DepartmentDAOImpl implements DepartmentDAO {

	@Override
	public String addDepartment(Department department) {
		int row = 0;
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		try {
			// Creating a connection object using Driver Manager getConnection method
			// conn = DriverManager.getConnection(QUERYMAPPER.URL, QUERYMAPPER.USERNAME,
			// QUERYMAPPER.PASSWORD);
			conn = DBConnectionUtil.getDBConnection();
			// Preparing statement to execute -- JDBC Statements
			preparedStatement = conn.prepareStatement(QUERYMAPPER.ADD_DEPARTMENT);

			// Setting data into the sql statement using JDBC PreparedStatement Interface
			// set methods
			preparedStatement.setInt(1, department.getDeptNo());
			preparedStatement.setString(2, department.getDeptName());
		

			// Execute the statement
			row = preparedStatement.executeUpdate();
			// Close the resources
			conn.close();
			preparedStatement.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (row != 0) {
			return QUERYMAPPER.RECORD_INSERTED_SUCCESSFULLY;
		} else {
			return QUERYMAPPER.UNABLE_TO_INSERT_A_RECORD;
		}
	}

	@Override
	public Optional<Department> getDepartmentById(Integer departmentId) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public String updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<String> deleteDepartment(Integer departmentId) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Department> getAllDepartment() throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Department> getDepartmentByName(String departmentName) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
