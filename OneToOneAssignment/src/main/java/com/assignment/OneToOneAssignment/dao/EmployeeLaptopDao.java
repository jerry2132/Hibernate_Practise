package com.assignment.OneToOneAssignment.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.assignment.OneToOneAssignment.dto.Employee;
import com.assignment.OneToOneAssignment.dto.Laptop;

public class EmployeeLaptopDao {

	EntityManager em = Persistence.createEntityManagerFactory("sumit").createEntityManager();
	EntityTransaction et = em.getTransaction();

	public Employee insertEmployeeAndLaptop(Employee emp, Laptop laptop) {

		try {

			et.begin();
			emp.setLaptop(laptop);
			em.persist(emp);
			et.commit();

			return emp;

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;
	}

	public boolean deleteLaptopById(int laptopId) {

		String deleteQuery = "Select s from Employee s where s.laptop.id=?1";

		Query q = em.createQuery(deleteQuery);

		q.setParameter(1, laptopId);
		//Employee emp = (Employee) q.getSingleResult();

		List<Employee> emp = q.getResultList();
		Laptop laptop = em.find(Laptop.class, laptopId);

		if (emp.isEmpty()) {
			et.begin();
			em.remove(laptop);
			et.commit();
			return true;
		} else {

			try {

				if (laptop != null) {
					
					Employee empl = emp.get(0);
					empl.setLaptop(null);
					et.begin();
					em.remove(laptop);
					et.commit();

					return true;
				} else
					return false;

			} catch (Exception e) {

				e.printStackTrace();
			}

			return false;

		}

	}

	public boolean deleteEmployeeByDob(LocalDate date) {

		String findByDob = "Select e from Employee e where e.dob = ?1";

		Query q = em.createQuery(findByDob);

		q.setParameter(1, date);

		Employee emp = (Employee) q.getSingleResult();

		try {

			if (emp != null) {
				et.begin();
				em.remove(emp);
				et.commit();
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	public boolean updateLaptopPriceByEmployeeId(int empId, long price) {

		Employee emp = em.find(Employee.class, empId);

		Laptop laptop = emp.getLaptop();

		try {

			if (laptop != null && emp != null) {

				laptop.setPrice(price);
				et.begin();
				em.merge(laptop);
				et.commit();

				return true;

			} else
				return false;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	public List<Employee> displayLaptopAndEmployee() {

		String display = "select s from Employee s";

		Query q = em.createQuery(display);

		List<Employee> emp = q.getResultList();

		return emp;

	}

}
