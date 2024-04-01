package classworkdaynine.serialization;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerialiazableExample {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(11);
		e.setEmpName("Rakesh");
		System.out.println(e);
		Employee e1 = new Employee();
		e1.setEmpId(12);
		e1.setEmpName("Ashwin");
		System.out.println(e1);
		Employee e2 = new Employee();
		e2.setEmpId(13);
		e2.setEmpName("Harish");
		System.out.println(e2);
		Employee e3 = new Employee();
		e3.setEmpId(14);
		e3.setEmpName("Amrita");
		System.out.println(e3);
		// Serialize an object e
		// Write an object into a file system
		File file = new File("D:\\prodapt2024\\output\\serializedObject.txt");
		List<Employee> empList = new ArrayList<Employee>();
		//Employee[] arrayOfEmp = new Employee[4];
		try (FileOutputStream fos = new FileOutputStream(file); 
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			oos.writeObject(e);
			oos.writeObject(e1);
			oos.writeObject(e2);
			oos.writeObject(e3);
			
			//Deserialize 
			Employee emp;
			
			while(fis.available() !=0) {
				//Object obj = ois.readObject();
				emp = (Employee) ois.readObject();
				if(emp !=null) {
					empList.add(emp);
				}
			}
			System.out.println("Deserialized -----"+empList);

		} catch (FileNotFoundException fnfe) {

			System.out.println(fnfe.getClass() + "---------------" + fnfe.getMessage());
		}catch (IOException ioe) {
			System.out.println(ioe.getClass() + "---------------" + ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			// TODO Auto-generated catch block
			cnfe.printStackTrace();
		}
		

	}

}
