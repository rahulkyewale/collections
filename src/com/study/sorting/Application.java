package com.study.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {

	public static void main(String[] args) 
	{
		List<EmployeeComparable> list = new ArrayList<EmployeeComparable>();
		
		list.add(new EmployeeComparable(110, "Rahul"));
		list.add(new EmployeeComparable(109, "Pratibha"));
		list.add(new EmployeeComparable(112, "Swapnil"));
		list.add(new EmployeeComparable(119, "Shalan"));
		list.add(new EmployeeComparable(100, "Arjun"));
		
		for (EmployeeComparable employeeComparable : list) {
			System.out.println(employeeComparable);
		}
		
		Collections.sort(list);
		System.out.println("");
		System.out.println("After Sorting");
		System.out.println("");
		for (EmployeeComparable employeeComparable : list) {
			System.out.println(employeeComparable);
		}
		
		
		List<Student> listStudent = new ArrayList<Student>();
		StudentRollNoComparator studentRollNoComparator = new StudentRollNoComparator();
		
		listStudent.add(new Student(109, "Rahul"));
		listStudent.add(new Student(110, "Pratibha"));
		listStudent.add(new Student(112, "Swapnil"));
		listStudent.add(new Student(119, "Shalan"));
		listStudent.add(new Student(100, "Arjun"));
		
		Collections.sort(listStudent, studentRollNoComparator);
		System.out.println("");
		System.out.println("Sort by Roll No Comparator");
		System.out.println("");
		for (Student student : listStudent) {
			System.out.println(student);
		}
		
		Collections.sort(listStudent, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return -o1.getName().compareTo(o2.getName());
			}
			
		});
		
		System.out.println("");
		System.out.println("Sort by Name Comparator");
		System.out.println("");
		for (Student student : listStudent) {
			System.out.println(student);
		}
	}

}
