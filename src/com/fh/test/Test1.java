package com.fh.test;

import java.lang.reflect.Method;

public class Test1 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		//int d = 9;
		//change(d);
		//System.out.println(d);
		/*Student a = new Student("a", "a");
		change1(a);
		System.out.println(a.getName());
		Student b = new Student("b", "b");
		change2(b);
		System.out.println(b.getName());*/
//		String str = "22";
//		System.out.println(str == "22");
		
		String method = "staff";
		Method m1 =  Foo.class.getDeclaredMethod(method);
		Method m2 = Foo.class.getMethod(method);
		
	}
	public static void change(int i){
		i = 1234;
	}
	
	public static void change1(Student i){
		i = new Student("1","1");
	}
	
	public static void change2(Student i){
		i.setName("2");;
	}
	

}
class Student{
	String name;
	String age;
	public Student(String name,String age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
class Foo{
	void staff(){};
}
