package com.sample.learning.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Sample {

	
	public static void main(String[] args) {
		
		
		
		
//		List employees = new ArrayList();
//		Employee emp1 = new Employee("John", 26);
//		Employee emp2 = new Employee("Martin", 23);
//		Employee emp3 = new Employee("John", 20);
//		Employee emp4 = new Employee("Martin", 19);
//		Employee emp5 = new Employee("Arpit", 27);
//
//		employees.add(emp1);
//		employees.add(emp2);
//		employees.add(emp3);
//		employees.add(emp4);
//		employees.add(emp5);
		
		
//		Integer[] arr=new Integer[]{100,24,13,44,114,200,40,112};
//		List<Integer> list = Arrays.asList(arr);
		
		
//		Integer[] arr=new Integer[]{1,2,3,4,3,2,4,2};
//		List<Integer> listWithDuplicates = Arrays.asList(arr);
//		Set<Integer> set = new HashSet<>(listWithDuplicates);
//		System.out.println(set);
		
//		ArrayList<Employee> employeeList = new ArrayList<Employee>();
//		Employee e1=new Employee("Mary",21);
//		Employee e2=new Employee("Martin",19);
//		Employee e3=new Employee("Mary",31);
//		Employee e4=new Employee("Stephan",18);
//		Employee e5=new Employee("Mary",26);
// 
//		employeeList.add(e1);
//		employeeList.add(e2);
//		employeeList.add(e3);
//		employeeList.add(e4);
//		employeeList.add(e5);
		
//		Predicate<Employee> agePredicate = e-> e.getName().equals("Mary");
//		java.util.List<Employee> emp = employeeList.stream().filter(agePredicate).collect(Collectors.toList());
//		Optional<Employee> e = employeeList.stream().filter(agePredicate).findAny();
//		if(e.isPresent()) {
//			System.out.println(e.get());
//		}
		
//		OptionalInt maxAge= employeeList.stream().mapToInt(Employee::getAge).max();
//		if(maxAge.isPresent()) {
//			System.out.println(maxAge);
//		}
		
//		employeeList.sort((e11,e12)->e11.getAge()-e12.getAge());
		
		
//		System.out.println(String.join(",", employeeList.stream().map(Employee::getName).collect(Collectors.toList())));
		
//		Map<String, java.util.List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getName));
//		map.forEach((s,e)->System.out.println(s+":"+e));
		
		
//		LocalDate date = LocalDate.now();
//		LocalTime time = LocalTime.now();
//		LocalDateTime dt = LocalDateTime.now();
//		
//		System.out.println("date : "+date);
//		System.out.println("time : "+time);
//		System.out.println("dt : "+dt);
		
//		ArrayList<Employee> list = new ArrayList<Employee>();
//		list.add(new Employee("C", 1));
//		list.add(new Employee("A", 3));
//		list.add(new Employee("T", 2));
//		
//		System.out.println(list);
//		
//		Predicate<Employee> predicate = e-> e.id <3;
//		
//		ArrayList<Employee> list1 = (ArrayList<Employee>) list.stream().filter(predicate).collect(Collectors.toList());
//		
//		System.out.println(list1);
		
//		String s = "abc";
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		for (Character c : s.toCharArray()) {
//			if(map.containsKey(c)) {
//				map.put(c, map.get(c)+1);
//			}else {
//				map.put(c, 1);
//			}
//		}
//		
//		Optional<Character> nrc = Optional.ofNullable(null);
//		for (Entry<Character, Integer> m : map.entrySet()) {
//			if(m.getValue() == 1) {
//				nrc = Optional.of(m.getKey());
//				break;
//			}
//		}
//		
//		if(nrc.isPresent()) {
//			System.out.println(nrc.get());
//		}else {
//			System.out.println("No");
//		}
		
//		Thread t1 = new Thread(ArithMAtic::test);
//		t1.start();
//		
//		BiFunction<Integer, Integer, Integer> a = ArithMAtic::add;
//		System.out.println(a.apply(1, 1));
		
//		String s1 = "hi";
//		String s2 = "hello";
//		
//		Thread t1 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				synchronized (s1) {
//					System.out.println("T1 Lock S1");
//					
//					synchronized (s2) {
//						System.out.println("T1 Lock S2");
//					}
//				}
//			}
//		});
//		
//		
//		Thread t2 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				synchronized (s2) {
//					System.out.println("T2 Lock S2");
//					synchronized (s1) {
//						System.out.println("T2 Lock S1");
//					}
//				}
//			}
//		});
//		
//		t1.start();
//		t2.start();
		
//		BlockingQueue queue = new ArrayBlockingQueue<>(10);
//		
//		Producer p  = new Producer(queue);
//		Consumer q  = new Consumer(queue);
//		
//		new Thread(p).start();
//		new Thread(q).start();
		
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("1", "2");
//		
//		Iterator<String> itr = map.keySet().iterator();
//		while (itr.hasNext()) {
//			String string = (String) itr.next();
//			System.out.println(string);
//			System.out.println(map.get(string));
//		}
//		
//		
//		for (Entry<String, String> e : map.entrySet()) {
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
//		}
		
		
//		A a1 = A.getA();
//		A a2 = A.getA();
//		
//		System.out.println(a1.hashCode());
//		System.out.println(a2.hashCode());
//		
//		try {
//			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("out"));
//			out.writeObject(a1);
//			out.close();
//			
//			ObjectInputStream in = new ObjectInputStream(new FileInputStream("out"));
//			A a3 = (A) in.readObject();
//			in.close();
//			
//			System.out.println(a3.hashCode());
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		Thread t1 = new Thread(new OddEvenSequence(0));
//		Thread t2 = new Thread(new OddEvenSequence(1));
//		
//		t1.start();
//		t2.start();
		
//		OddEven  oddEven = new OddEven();
//		
//		Thread t1 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				oddEven.even();
//			}
//		});
//		
//		Thread t2 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				oddEven.odd();
//			}
//		});
//		
//		t1.start();
//		t2.start();
		
	}
	
}


