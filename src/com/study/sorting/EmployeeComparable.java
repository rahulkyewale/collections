package com.study.sorting;

public class EmployeeComparable implements Comparable<EmployeeComparable>
{
	private Integer id;
	
	private String name;

	public EmployeeComparable(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(EmployeeComparable obj) 
	{
		return this.id - obj.id;
	}

	@Override
	public String toString() {
		return "EmployeeComparable [id=" + id + ", name=" + name + "]";
	}
	
	
}
