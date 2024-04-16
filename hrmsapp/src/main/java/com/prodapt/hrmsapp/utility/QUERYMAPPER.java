package com.prodapt.hrmsapp.utility;

public interface QUERYMAPPER {
		//Constant URL variable
		public static final String RECORD_DELETED_SUCCESSFULLY="Record deleted successfully";
		public static final String UNABLE_TO_DELETE_A_RECORD="Unable to delete a record";
		public static final String RECORD_INSERTED_SUCCESSFULLY="Record inserted successfully";
		public static final String UNABLE_TO_INSERT_A_RECORD="Unable to insert a record";
		public static final String ADD_EMPLOYEE="INSERT INTO EMPLOYEE VALUES(?,?,?,?,?,?)";
		public static final String DELETE_EMPLOYEE="DELETE FROM EMPLOYEE WHERE empId=? ";
		public static final String GET_EMPLOYEE_BY_ID="SELECT * FROM EMPLOYEE WHERE empId=?";
		public static final String GET_ALL_EMPLOYEES="SELECT * FROM EMPLOYEE";
		//Department
		public static final String ADD_DEPARTMENT="INSERT INTO DEPARTMENT VALUES(?,?)";
		public static final String DELETE_DEPARTMENT="DELETE FROM DEPARTMENT WHERE deptNo=? ";
		public static final String GET_DEPARTMENT_BY_ID="SELECT * FROM DEPARTMENT WHERE deptNo=?";
		public static final String GET_ALL_DEPARTMENT="SELECT * FROM DEPARTMENT";
}
