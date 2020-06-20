package com.functional.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadCSVWithScanner2 {

	public static void main(String[] args) throws IOException {
		
		String file_Nameip  = "C:/Java_Training/data/employees2.txt";
				//"C:/data/PersonListdata.txt";
		// open file input stream
		//BufferedReader reader = new BufferedReader(new FileReader("C:\\Java_Training\\data\\employees.csv"));
				BufferedReader reader = new BufferedReader(new FileReader(file_Nameip));

		// read file line by line
		String line = null;
		Scanner scanner = null;
		int index = 0;
		List<Employee2> empList = new ArrayList<>();

		while ((line = reader.readLine()) != null) {
			Employee2 emp = new Employee2();
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				String data = scanner.next();
				if (index == 0)
					emp.setId(Integer.parseInt(data));
				else if (index == 1)
					emp.setName(data);
				else if (index == 2)
					emp.setRole(data);
				else if (index == 3)
					emp.setSalary(data);
				else if (index == 4)
					emp.setDeptId(Integer.parseInt(data));
				else
					System.out.println("invalid data::" + data);
				index++;
			}
			index = 0;
			empList.add(emp);
		}
		
		//close reader
		reader.close();
		
		System.out.println(empList);
		
		System.out.println("<------------------------------->");
		
		// key = id, value - EmployeeName
				Map<Integer, String> result1 = empList.stream().collect(
				Collectors.toMap(Employee2::getDeptId, Employee2::getName));
               // Collectors.toMap(Employee2::getDeptId, Employee2::getName));
				
			//	empList.stream().map(emplList)
			
				System.out.println("Result 1 : " + result1);
		
	//	List<Item> list;
	//	Map<Key,Item> map = new HashMap<Key,Item>();
	//	for (Employee i : empList) map.put(i.getKey(),i);
		
	}

}