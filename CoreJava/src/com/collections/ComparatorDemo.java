package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {
		int value=0;
		if (e1.getSalary()>e2.getSalary()) {
			value=-1;
		} else if (e1.getSalary()<e2.getSalary()){
			value=1;
		} else if (e1.getSalary()==e2.getSalary()) {
			value=0;
		}
		return value;
	}
	public static void main(String[] args) {
		ArrayList<Emp> emp=new ArrayList<>();
		
		Emp e1=new Emp();
		e1.setEid(1);
		e1.setEname("Ashish");
		e1.setSalary(100000);
		
		Emp e2=new Emp();
		e2.setEid(2);
		e2.setEname("Aqsa");
		e2.setSalary(20000);
		
		Emp e3=new Emp();
		e3.setEid(3);
		e3.setEname("Mayur");
		e3.setSalary(80000);
		
		Emp e4=new Emp();
		e4.setEid(4);
		e4.setEname("Jhanvi");
		e4.setSalary(150000);
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		Collections.sort(emp, new ComparatorDemo());
		for (Emp e : emp) {
			System.out.println("EID : "+e.getEid()+" ENAME : "+e.getEname()+" SALARY : "+e.getSalary());
		}
	}
	
}
