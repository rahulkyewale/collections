package com.study.map;

import java.util.HashMap;
import java.util.Map;

import com.study.model.Person;

public class MapExample {

	public static void main(String[] args) 
	{
		Map<Person, Integer> map = new HashMap<Person, Integer>();
		
		for (int i = 0; i < 20; i++) 
		{
			map.put(new Person("firstName"+i, "lastName"+i, i), i);
		}
		
		Person p1 = new Person("abc", "xyz", 29);
		Person p2 = new Person("abc", "xyz", 29);
		
		System.out.println(p1.equals(p2));
		System.out.println("Hashcode p1 = "+p1.hashCode());
		System.out.println("Hashcode p2 = "+p2.hashCode());
		
		map.put(p1, 25);
		map.put(p2, 30);
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		
		System.out.println("FB".hashCode());
		System.out.println("Ea".hashCode());
		map2.put("FB", 1);
		map2.put("Ea", 2);
		
		System.out.println(map2.get("Ea"));
	}

}
