package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: findById =======");
		Department dep1 = departmentDao.findById(1);
		System.out.println(dep1);

		System.out.println("=== TEST 2: findAll =======");
		System.out.println(departmentDao.findAll());

		System.out.println("=== TEST 3: insert =======");
		Department dep2 = new Department(null, "Music");
		departmentDao.insert(dep2);
		System.out.println("Insertion complete! Department inserted: " + dep2);

		System.out.println("=== TEST 4: update =======");
		dep2.setName("Instruments");
		departmentDao.update(dep2);
		System.out.println("Update complete! dep 2 =" + dep2);
	}

}
