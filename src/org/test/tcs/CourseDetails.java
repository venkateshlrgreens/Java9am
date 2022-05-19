package org.test.tcs;

//			Class name
public class CourseDetails {
	
	//1.Type the method name and press ctrl+spacebar,then select method from that
	public void javaCourse() {
		System.out.println("Java course");
	}
	
	//2.Press ctrl+spacebar and then select the method from that
	public void oracleCourse() {
		System.out.println("Oracle Course");
	}
	
	//Main method
	//Type Main and press ctrl+space bar
	public static void main(String[] args) {
		//Object creation
		CourseDetails c=new CourseDetails();
		//Method calling
		c.javaCourse();
		c.oracleCourse();
	}
	
	

}
