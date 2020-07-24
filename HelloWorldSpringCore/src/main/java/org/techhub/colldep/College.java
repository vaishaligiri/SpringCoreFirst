package org.techhub.colldep;

import java.util.*;
public class College {

	private List<String> studentNames;
	
	public void setStudentNames(List<String> studentNames)
	{
		this.studentNames=studentNames;
	}
	public void show()
	{
		for(String s:studentNames)
		{
			System.out.println(s);
		}
	}
	
}
