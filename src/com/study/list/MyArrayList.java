package com.study.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class MyArrayList
{
	// Incorrect method to remove elements from a list in java
	public static <T> void filterList(List<T> list, Predicate<T> condition)
	{
		Iterator<T> itr = list.iterator();
		while (itr.hasNext())
		{
			T t = itr.next();		// throws ConcurrentModificationException
			if (condition.test(t)) {
				list.remove(t);
			}
		}
	}

	public static void main(String[] args) {
		List<String> colors = new ArrayList<>(Arrays.asList("BLUE", "RED", "RED", "YELLOW"));

		filterList(colors, i -> i.equals("RED"));
		System.out.println(colors);   // [BLUE, RED, YELLOW]
	}
}