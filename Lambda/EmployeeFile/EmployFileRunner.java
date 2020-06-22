package com.functional.lambda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployFileRunner {

	public static void main(String[] args) throws IOException {

		String file_Nameip = "C:/Java_Training/data/employees2.txt";
		String file_NameOp = "C:/Java_Training/data/employees2_op.txt";

		// double bonus = 1000;

		BufferedReader reader = new BufferedReader(new FileReader(file_Nameip));

		// read file line by line
		String line = null;
		Scanner scanner = null;
		int index = 0;
		List<EmployFile> empList = new ArrayList<>();

		while ((line = reader.readLine()) != null) {
			EmployFile emp = new EmployFile();
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

		// close reader
		reader.close();

		System.out.println("Employeee List : " + empList);

		System.out.println("<------------------------------->");

		/*
		 * // key = DeptId, value - EmployeeName Map<Integer, String> result1 =
		 * empList.stream().collect( Collectors.toMap(EmployFile::getDeptId,
		 * EmployFile::getName)); // Collectors.toMap(Employee2::getDeptId,
		 * Employee2::getName)); // empList.stream().map(emplList)
		 * System.out.println("Result 1 : " + result1);
		 * 
		 * Map<Integer, String> result2 = empList.stream().collect(
		 * Collectors.toMap(EmployFile::getDeptId, EmployFile::getName));
		 * System.out.println("result2 : " + result2);
		 */

//Create a list of employees from the file, put each employee list in a map where key is department id 
//Write map into a file where key is department id 

		Map<Integer, EmployFile> map = empList.stream()
				.collect(Collectors.toMap(EmployFile::getDeptId, EmployFile -> EmployFile));

		System.out.println("Map : " + map);

		BufferedWriter bf = null;
		;

		try {
			bf = new BufferedWriter(new FileWriter(file_NameOp));

			// iterate map entries
			for (Entry<Integer, EmployFile> entry : map.entrySet()) {

				// put key and value separated by a colon
				bf.write(entry.getKey() + ":" + entry.getValue());

				// new line
				bf.newLine();
			}

			bf.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				// always close the writer
				bf.close();
			} catch (Exception e) {
			}
		}

	}

}