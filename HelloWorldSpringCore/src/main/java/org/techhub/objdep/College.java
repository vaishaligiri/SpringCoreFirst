package org.techhub.objdep;

public class College {

	private Student student;
	
	public College(Student student)
	{
		this.student=student;
	}
	public void setStudent(Student student)
	{
		this.student=student;
	}
	public void show()
	{
		System.out.println(student.getName()+"\t"+student.getId()+"\t"+student.getPer());
	}
}
