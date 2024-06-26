package firstmavenproject.util;

public interface QUERYMAPPER {
		//Constant URL variable
		public static final String RECORD_DELETED_SUCCESSFULLY="Record deleted successfully";
		public static final String UNABLE_TO_DELETE_A_RECORD="Unable to delete a record";
		public static final String RECORD_INSERTED_SUCCESSFULLY="Record inserted successfully";
		public static final String UNABLE_TO_INSERT_A_RECORD="Unable to insert a record";
		public static final String URL = "jdbc:mysql://localhost:3306/prodapt2024";
		public static final String USERNAME="root";
		public static final String PASSWORD="password";
		public static final String ADD_CUSTOMER="INSERT INTO CUSTOMER(customerId,customerName,birthDate,mobile,email) VALUES(?,?,?,?,?)";
		public static final String DELETE_CUSTOMER="DELETE FROM CUSTOMER WHERE customerId=? ";
		public static final String GET_CUSTOMER_BY_ID="SELECT * FROM CUSTOMER WHERE customerId=?";
		public static final String GET_ALL_CUSTOMERS="SELECT * FROM CUSTOMER";
}
