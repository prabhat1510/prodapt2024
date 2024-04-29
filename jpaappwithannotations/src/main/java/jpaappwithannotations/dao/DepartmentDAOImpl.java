package jpaappwithannotations.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;

import jpaappwithannotations.entities.Department;
import jpaappwithannotations.utility.HibernateUtility;

public class DepartmentDAOImpl implements DepartmentDAO {
	Session session = HibernateUtility.getSessionFactory().openSession();
	//Retrieve
	@Override
	public List<Department> getAllDepartment() {
	//select * from department
	//Example of Hibernate Query Language
		
		return session.createQuery("select d from Department d",Department.class).getResultList();
	}

	//Retrieve by Primary Key
	@Override
	public Department getDepartmentById(Integer deptNo) {
		session.beginTransaction();
		Department dept = session.get(Department.class, deptNo);
		session.getTransaction().commit();
		return dept;
	}

	//Create -- add or insert  data in relational table
	@Override
	public void addDepartment(Department department) {
		session.beginTransaction();
		session.persist(department);
		session.getTransaction().commit();

	}

	@Override
	public Department updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDepartment(Integer deptNo) {
		// remove
				session.getTransaction().begin();
				Department d = new Department();
				d.setDeptNo(deptNo);
				session.delete(d);
				session.getTransaction().commit();

	}

	@Override
	public Department getDepartmentByName(String deptName) {
		TypedQuery query = session.getNamedQuery("findDepartmentByName");
		query.setParameter("name", deptName);

		Department department = (Department) query.getSingleResult();
		return department;
	}

	@Override
	public Integer updateDepartmentUsingQuery(Department department) {
		String query = "Update Department SET deptName=:dName WHERE deptNo=:deptId ";
		session.getTransaction().begin();
		Query q = session.createQuery(query);
		q.setParameter("dName", department.getDeptName());
		q.setParameter("deptId", department.getDeptNo());
		int row = q.executeUpdate();
		session.getTransaction().commit();
		session.close();
		if (row > 0) {
			return row;
		}

		return null;
	}

	@Override
	public void deleteDepartmentByName(String deptName) {
		String query = "DELETE Department WHERE deptName=:dName";
		session.getTransaction().begin();
		Query q = session.createQuery(query);
		q.setParameter("dName", deptName);
		int row = q.executeUpdate();
		session.getTransaction().commit();
		
	}

}
