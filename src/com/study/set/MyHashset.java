package com.study.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.study.sorting.Student;

public class MyHashset {

	public static void main(String[] args) 
	{
		Set<Integer> set = new HashSet<Integer>();
		set.add(null);
		set.add(null);
		for (int i = 1; i <= 13; i++) {
			set.add(i);
			
		}
		
		System.out.println(set);
		
		Set<Student> setStudents = new HashSet<Student>();
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		Student s1 = new Student(109, "Rahul");
		Student s2 = new Student(110, "Pratibha");
		System.out.println("s1 hashcode = "+s1.hashCode());
		System.out.println("s2 hashcode = "+s2.hashCode());
		
		setStudents.add(s1);
		setStudents.add(s2);
		map.put(s1, 1);
		map.put(s2, 2);
		System.out.println("");
		for (Student student : setStudents) {
			System.out.println(student);
		}
		System.out.println("");
		
		s1.setRollNo(110);
		s1.setName("Pratibha");
		//s1.setName("Arjun");
		System.out.println("s1 hashcode after modification = "+s1.hashCode());
		System.out.println("");
		
		System.out.println("");
		for (Student student : setStudents) {
			System.out.println(student);
		}
		System.out.println("");
		
		
		System.out.println("");
		for (Entry<Student, Integer> entry : map.entrySet()) 
		{
			System.out.println("K = "+entry.getKey()+ " V = "+entry.getValue());
		}
		System.out.println("");
	}

}
