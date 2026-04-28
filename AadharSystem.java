package com.tap.comparators;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Aadhar{
	private int aadharNumber;
	private String name;
	private int age;
	
	public Aadhar() {
		// TODO Auto-generated constructor stub
	}

	public Aadhar(int aadharNumber, String name, int age) {
		super();
		this.aadharNumber = aadharNumber;
		this.name = name;
		this.age = age;
	}

	public int getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "AadharNumber=" + aadharNumber + ", name=" + name + ", age=" + age ;
	}
	
	
}

class sortAadharAsc implements Comparator<Aadhar>{
	@Override
	public int compare(Aadhar o1, Aadhar o2) {
		return Integer.valueOf(o1.getAadharNumber()).compareTo(o2.getAadharNumber());
	}
}
class sortAadharDsc implements Comparator<Aadhar>{
	@Override
	public int compare(Aadhar o1, Aadhar o2) {
		return -1*Integer.valueOf(o1.getAadharNumber()).compareTo(o2.getAadharNumber());
	}
}
class sortNameAsc implements Comparator<Aadhar>{
	@Override
	public int compare(Aadhar o1, Aadhar o2) {
		int value = String.valueOf(o1.getName()).compareTo(o2.getName());
		
		if(value ==0) {
			return Integer.valueOf(o1.getAadharNumber()).compareTo(o2.getAadharNumber());
		}
		return value;
	}
}
//change the logic slightly becox 0 will be -1if both are same
class sortNameDsc implements Comparator<Aadhar>{
	@Override
	public int compare(Aadhar o1, Aadhar o2) {
		return -1*String.valueOf(o1.getName()).compareTo(o2.getName());
	}
}
class sortAgeAsc implements Comparator<Aadhar>{
	@Override
	public int compare(Aadhar o1, Aadhar o2) {
		return Integer.valueOf(o1.getAge()).compareTo(o2.getAge());
	}
}
class sortAgeDsc implements Comparator<Aadhar>{
	@Override
	public int compare(Aadhar o1, Aadhar o2) {
		return -1*Integer.valueOf(o1.getAge()).compareTo(o2.getAge());
	}
}

public class AadharSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortAadharAsc saA = new sortAadharAsc();
		sortAadharDsc saD = new sortAadharDsc();
		
		sortNameAsc snA = new sortNameAsc();
		sortNameDsc snD = new sortNameDsc();
		
		sortAgeAsc sagA = new sortAgeAsc();
		sortAgeDsc sagD = new sortAgeDsc();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of Indians");
		int n = sc.nextInt();
		
		System.out.println("enter the on what basis you want filter or sort ");
		System.out.println("1 -> Aadhar Number ascending");
		System.out.println("2 -> Aadhar Number descending");
		System.out.println("3 -> Name ascending");
		System.out.println("4 -> Name descending");
		System.out.println("5 -> Age ascending");
		System.out.println("6 -> Age descending");
		
		int m = sc.nextInt();
		TreeSet<Aadhar> ts= null;
		
		if(m<1 || m>6) {
			System.out.println("invalid");
		}
		else if(m==1) {
			 ts = new TreeSet<Aadhar>(saA);
		}else if(m==2) {
			ts = new TreeSet<Aadhar>(saD);
		}else if(m==3) {
			 ts = new TreeSet<Aadhar>(snA);
		}
		else if(m==4) {
			 ts = new TreeSet<Aadhar>(snD);
		}
		else if(m==5) {
			 ts = new TreeSet<Aadhar>(sagA);
		}
		else {
			 ts = new TreeSet<Aadhar>(sagD);
		}
		
		
		sc.nextLine();
		System.out.println("data FORMAT: aadharNumber,name,age");
		for(int i=0;i<n;i++) {
			System.out.println("enter the person "+(i+1)+" data");
			String details = sc.nextLine();
			String data[] = details.split(",");
			
			ts.add(new Aadhar(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2])));
			
		}
		System.out.println(ts);

	}

}


OUTPUT:
enter the number of Indians
2
enter the on what basis you want filter or sort 
1 -> Aadhar Number ascending
2 -> Aadhar Number descending
3 -> Name ascending
4 -> Name descending
5 -> Age ascending
6 -> Age descending
3
data FORMAT: aadharNumber,name,age
enter the person 1 data
101,prajwal,21
enter the person 2 data
95,kumar,23
[AadharNumber=95, name=kumar, age=23, AadharNumber=101, name=prajwal, age=21]
