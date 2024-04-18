package com.prodapt.hrmsapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.prodapt.hrmsapp.exceptions.EmployeeNotFoundException;
import com.prodapt.hrmsapp.exceptions.OperationNotExecutedException;
import com.prodapt.hrmsapp.model.Employee;
import com.prodapt.hrmsapp.utility.DBConnectionUtil;
import com.prodapt.hrmsapp.utility.QUERYMAPPER;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public String addEmployee(Employee employee) {
		Connection conn = DBConnectionUtil.getDBConnection();
		//PreparedStatement pStmt = conn.prepareStatement("");
		     //pStmt.setInt(6,employee.getDepartment().getDeptNo());
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer employeeId) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public String updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<String> deleteEmployee(Integer employeeId) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Employee> getAllEmployee() throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public Optional<Employee> getEmployeeByName(String employeeName) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public String insertEmployeeAndDepartment(Employee employee) throws OperationNotExecutedException {
		Connection conn = DBConnectionUtil.getDBConnection();
		try {
			//Disable auto commit 
			conn.setAutoCommit(false);
			PreparedStatement pStmt = conn.prepareStatement(QUERYMAPPER.ADD_DEPARTMENT);
			pStmt.setInt(1, employee.getDepartment().getDeptNo());
			pStmt.setString(2, employee.getDepartment().getDeptName());
			int deptRow = pStmt.executeUpdate();
			
			if(deptRow !=0) {
				PreparedStatement pStmt1 = conn.prepareStatement("INSERT INTO EMPLOYEE (empId,empName) VALUES(?,?)");
				pStmt1.setInt(1, employee.getEmpId());
				pStmt1.setString(2, employee.getEmpName());
				int empRow = pStmt1.executeUpdate();
				if(empRow ==0) {
					conn.rollback(); //Transaction RollBack
				}else {
					conn.commit(); //Transaction Commit
					return QUERYMAPPER.RECORD_INSERTED_SUCCESSFULLY;
				}
				conn.commit();//Transaction Commit
			}else {
				conn.rollback();
				return QUERYMAPPER.UNABLE_TO_INSERT_A_RECORD;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

}
