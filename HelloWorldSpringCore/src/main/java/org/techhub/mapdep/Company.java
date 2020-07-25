package org.techhub.mapdep;

import java.util.*;

public class Company {

	private Map<Integer, String> map;

	public Company()
	{
		System.out.println("I am company constructor");
	}
	public void setStudentList(Map<Integer, String> map) {
		this.map = map;
	}

	public void show() {
		Set s = map.keySet();
		Iterator i = s.iterator();
		while (i.hasNext()) {
			Object key = i.next();
			Object value = map.get(key);
			System.out.println(key + "\t" + value);
		}
	}
}
