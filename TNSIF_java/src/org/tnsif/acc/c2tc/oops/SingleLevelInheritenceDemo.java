package org.tnsif.acc.c2tc.oops;



class  course
{
	String  couseName ="JavaProgram";
	
	void showCourse()
	{
		System.out.println("Course : " +couseName);
	}
}
class Student extends course
{
	String name ="ABC";
	void showStudent ()
	{
		System.out.println("student :"+name);
	}
}
public class SingleLevelInheritenceDemo {

	public static void main(String[] args) {
		Student student=new Student();
		student.showCourse();
		student.showStudent();
		

	}

}
