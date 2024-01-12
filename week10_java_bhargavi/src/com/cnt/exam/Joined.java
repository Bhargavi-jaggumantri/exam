package com.cnt.exam;
import java.util.List;
import java.util.stream.Collectors;
public class Joined {
	public static void main(String[] args) {
		EmployeeData employeeData = new EmployeeData();
		List<Employee> list = employeeData.EmployeeRecords();
		
		list.stream().filter(e-> e.getYearOfJoining()>2015).collect(Collectors.groupingBy(Employee::getNames).entryset()
				.stream.foreach(e1->{
					System.out.println(e1.getKey());
				}));
		

	}
			
}
